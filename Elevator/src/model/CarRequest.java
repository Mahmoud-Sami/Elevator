package model;

import events.CarCallEvent.Direction;
import javax.swing.JButton;


public class CarRequest extends Request {
     
    private final Direction requestDirection;
    public CarRequest(int requestedFloor, Direction requestDirection, JButton clickedBtn) {
        super(requestedFloor, clickedBtn);
        this.requestDirection = requestDirection;
    }

    public Direction getRequestDirection() {
        return requestDirection;
    }
    
    
}
