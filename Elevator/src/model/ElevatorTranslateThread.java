package model;

import esper.Config;
import events.CarStateSensor;
import events.DoorStateSensor;
import java.awt.Color;
import java.awt.Component;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

class ElevatorTranslateThread extends TimerTask 
{ 
    int [] FloorY = {580, 472, 364, 258, 152, 48};
    
    private final Elevator elevator;
    private final Request request;
    
    public ElevatorTranslateThread(Elevator elevator, Request request) {

        this.elevator = elevator;
        this.request = request;
        
        if (elevator.getCurrentFloor() == request.getRequestedFloor() || elevator.getIsMoving()){
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
        int FloorIndex = this.request.getRequestedFloor() - 1;
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
            
            Config.sendEvent(new CarStateSensor(CarStateSensor.CarDirection.None, false, Elevator.getLocation().y, getCurrentFloor(Elevator.getLocation().y)));
            Config.sendEvent(new DoorStateSensor(true));
            request.getClickedBtn().setBackground(Color.WHITE);
            for (Component c : elevator.getGUI().getBuildingPanel().getComponents()) {
                if (c instanceof JButton) {
                    if (((JButton) c).getName().compareToIgnoreCase("D" + request.getClickedBtn().getName().charAt(1)) == 0) {
                        ((JButton) c).setBackground(Color.WHITE);
                    } else if (((JButton) c).getName().compareToIgnoreCase("U" + request.getClickedBtn().getName().charAt(1)) == 0){
                        ((JButton) c).setBackground(Color.WHITE);
                    }
                    
                }
            }
            this.cancel();
        }
    } 
 
}