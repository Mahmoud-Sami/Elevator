package model;

import java.util.Timer;

public class ElevatorController {
    
    private Elevator elevator;

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
    }
    
    public void ChangeDoorState(boolean doorState){
        if (elevator.getIsMoving() == false){
            this.elevator.getDoor().setDoorState(doorState);
        }
    }
    
    public void MoveElevator(int floorNumber){
        if (floorNumber != elevator.getCurrentFloor()){
            elevator.getGUI().getBtnOpenDoor().setEnabled(false);
            elevator.getGUI().getBtnCloseDoor().setEnabled(false);
            new Timer().schedule(new ElevatorTranslateThread(elevator, floorNumber), 500, 7);
        }
    }
}
