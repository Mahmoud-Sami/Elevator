package esper;

import events.CarCallEvent;
import events.CarStateSensor;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import jdk.nashorn.internal.objects.NativeDebug;
import model.CarRequest;
import model.Elevator;
import model.Request;
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
                        elevator.getDoor().setDoorState(doorState);
                        
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
                        JButton clickedBtn = null;
                        String btnName;
                        
                        if (direction == CarCallEvent.Direction.DOWN)
                            btnName = "D";
                        else
                            btnName = "U";
                        
                        btnName += floorNumber;
                        
                        //Searching for the clicked button
                        for (Component c : elevator.getGUI().getBuildingPanel().getComponents()){
                            if (c instanceof JButton){
                                if (((JButton)c).getName().compareToIgnoreCase(btnName) == 0){
                                    clickedBtn = (JButton)c;
                                }
                            }
                        }
                        
                        if (elevator.getCurrentFloor() != floorNumber){
                            clickedBtn.setBackground(Color.YELLOW);
                            elevator.AddRequest(new CarRequest(floorNumber, direction, clickedBtn));
                        }
                    }
                });
        
        Config.createStatement("select floorNumber from RequestFloorEvent")
                .setSubscriber(new Object() {
                    public void update(int floorNumber) throws InterruptedException {
                        JButton clickedBtn = null;
                        String btnName = "B" + floorNumber;
                        
                        //Searching for the clicked button
                        for (Component c : elevator.getGUI().getButtonsPanel().getComponents()){
                            if (c instanceof JButton){
                                if (((JButton)c).getName().compareToIgnoreCase(btnName) == 0){
                                    clickedBtn = (JButton)c;
                                    break;
                                }
                            }
                        }
                        
                        if (elevator.getCurrentFloor() != floorNumber){
                            clickedBtn.setBackground(Color.YELLOW);
                            elevator.AddRequest(new Request(floorNumber, clickedBtn));
                        }
                    }
                });
        
        Config.createStatement("select trigger_emergency from EmergencyEvent")
                .setSubscriber(new Object() {
                    public void update(boolean status) throws InterruptedException {
                        elevator.setEmergencyTrigger(status);
                        if (status){
                            elevator.RunEmergency();
                        }
                    }
                });
    }
}
