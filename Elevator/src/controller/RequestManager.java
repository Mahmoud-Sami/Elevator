package controller;

import java.util.TimerTask;
import model.Elevator;
import model.Request;

public class RequestManager extends TimerTask {

    private final Elevator elevator;
    private final ElevatorController controller;
    
    public RequestManager(Elevator elevator, ElevatorController elevatorController) {
        this.elevator = elevator;
        this.controller = elevatorController;
    }
    
    @Override
    public void run() {
        if (elevator.isEmergencyTrigger())
        {
            this.cancel();
            return;
        }
        
        if (controller.getRequests().isEmpty())
            return;
        
        if (elevator.getIsMoving())
            return;
        
        Request r = controller.getNextRequest();
        controller.MoveElevator(r);
    }
}
