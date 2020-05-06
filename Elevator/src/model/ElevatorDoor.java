package model;

import events.LedStateSensor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import controller.AudioController;

public class ElevatorDoor {
    
    private boolean doorState;
    private Elevator elevator;
    
    public ElevatorDoor(Elevator elevator) {
        this.doorState = true;
        this.elevator = elevator;
    }
    
    public void setDoorState(boolean doorState){
        this.doorState = doorState;
        if (doorState == true){
            
            Icon icon = new ImageIcon(this.getClass().getResource("../view/images/opened.png"));
            elevator.getGUI().getDoorImageLabel().setIcon(icon);
            elevator.getLed().setLedColor(LedStateSensor.Color.Green);
            elevator.getController().getAudioController().playOpenDoor();
        }
        else{
            Icon icon = new ImageIcon(this.getClass().getResource("../view/images/closed.png"));
            elevator.getGUI().getDoorImageLabel().setIcon(icon);
            elevator.getLed().setLedColor(LedStateSensor.Color.Red);
        }
    }
}
