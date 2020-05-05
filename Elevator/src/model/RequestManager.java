package model;

import java.awt.Color;
import java.util.Queue;
import java.util.TimerTask;
import javax.swing.UIManager;

public class RequestManager extends TimerTask {

    private final Elevator elevator;
    private final ElevatorController controller;
    
    public RequestManager(Elevator elevator, ElevatorController elevatorController) {
        this.elevator = elevator;
        this.controller = elevatorController;
    }
    
    @Override
    public void run() {
        if (controller.getCarRequestQueue().isEmpty())
            return;
        
        if (elevator.getIsMoving())
            return;
        
        Request r = controller.getNextRequest();
        if (r instanceof CarRequest){
            controller.MoveElevator(r);
            controller.removeTopRequest();
        }
    }
    
}
