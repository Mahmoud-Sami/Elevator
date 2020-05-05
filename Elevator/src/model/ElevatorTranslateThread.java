package model;

import esper.Config;
import events.CarStateSensor;
import events.DoorStateSensor;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

class ElevatorTranslateThread extends TimerTask 
{ 
    int [] FloorY = {580, 472, 364, 258, 152, 48};
    
    private final Elevator elevator;
    private final int floorNo;

    public ElevatorTranslateThread(Elevator elevator, int floorNo) {
        
        
        
        this.elevator = elevator;
        this.floorNo = floorNo;
        
        if (elevator.getCurrentFloor() == floorNo || elevator.getIsMoving()){
            try {
                this.cancel();
                this.finalize();
            } catch (Throwable ex) {
                Logger.getLogger(ElevatorTranslateThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            Config.sendEvent(new DoorStateSensor(false));
        }
    }
    
    private int getCurrentFloor(int Y){
        
        if (Y >= FloorY[0] - 1) {
            return 1;
        } else if (Y < FloorY[0] && Y >= FloorY[1]) {
            return 2;
        } else if (Y < FloorY[1] && Y >= FloorY[2]) {
            return 3;
        } else if (Y < FloorY[2] && Y >= FloorY[3]) {
            return 4;
        } else if (Y < FloorY[3] && Y >= FloorY[4]) {
            return 5;
        } else if (Y < FloorY[4] && Y >= FloorY[5]) {
            return 6;
        } else{
            return 0;
        }
    }
    
    @Override
    public void run() 
    { 
        
        int FloorIndex = this.floorNo-1;
        JPanel Elevator = elevator.getGUI().getElevatorPanel();
        if (Math.abs(Elevator.getLocation().y - FloorY[FloorIndex]) > 0){
            if (Elevator.getLocation().y > FloorY[FloorIndex]) {
                Elevator.setLocation(Elevator.getLocation().x, Elevator.getLocation().y - 1);
                Config.sendEvent(new CarStateSensor(CarStateSensor.CarDirection.UP, true, Elevator.getLocation().y, getCurrentFloor(Elevator.getLocation().y)));
            } else {
                Elevator.setLocation(Elevator.getLocation().x, Elevator.getLocation().y + 1);
                Config.sendEvent(new CarStateSensor(CarStateSensor.CarDirection.DOWN, true, Elevator.getLocation().y, getCurrentFloor(Elevator.getLocation().y)));
            }
        }
        else{
            this.cancel();
            Config.sendEvent(new CarStateSensor(CarStateSensor.CarDirection.None, false, Elevator.getLocation().y, getCurrentFloor(Elevator.getLocation().y)));
            Config.sendEvent(new DoorStateSensor(true));
        }
    } 
 
}