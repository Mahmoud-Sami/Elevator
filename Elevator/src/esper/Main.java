package esper;

import events.CarCallEvent;
import events.CarStateSensor;
import events.LedStateSensor;
import jdk.nashorn.internal.objects.NativeDebug;
import model.Elevator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class Main {
    public static void main(String[] args){
        // Disable logging
        Logger.getRootLogger().setLevel(Level.OFF);

        // Register events
        Config.registerEvents();

        System.out.println(NativeDebug.getClass(args, args));
        // Create Elevator
        final Elevator elevator = new Elevator();

        Config.createStatement("select doorstate from DoorStateSensor")
                .setSubscriber(new Object() {
                    public void update(boolean doorState) throws InterruptedException {
                        elevator.setDoorState(doorState);
                        
                        if (doorState == true)
                            elevator.OpenDoor();
                        else
                            elevator.CloseDoor();
                    }
                });

        Config.createStatement("select carDir, isMoving, carPositionY, currentFloor from CarStateSensor")
                .setSubscriber(new Object() {
                    public void update(CarStateSensor.CarDirection direction, boolean isMoving, int carPositionY, int currentFloor) throws InterruptedException {
                        elevator.setCarDir(direction);
                        elevator.setIsMoving(isMoving);
                        elevator.setCarPositionY(carPositionY);
                        elevator.setCurrentFloor(currentFloor);
                        
                        if (!isMoving){
                            elevator.getGUI().getBtnOpenDoor().setEnabled(true);
                            elevator.getGUI().getBtnCloseDoor().setEnabled(true);
                        }
                    }
                });
        
        Config.createStatement("select floorNumber, direction from CarCallEvent")
                .setSubscriber(new Object() {
                    public void update(int floorNumber, CarCallEvent.Direction direction) throws InterruptedException {
                        elevator.MoveElevator(floorNumber);
                    }
                });
    }
}
