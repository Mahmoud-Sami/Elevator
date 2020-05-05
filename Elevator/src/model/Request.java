
package model;

import javax.swing.JButton;

public class Request {
    
    private static int objCounter = 0;
    
    private final int requestID;
    private final int requestedFloor;
    private final JButton clickedBtn;

    public Request(int requestedFloor, JButton clickedBtn) {
        objCounter++;
    
        this.requestID = objCounter;
        this.requestedFloor = requestedFloor;
        this.clickedBtn = clickedBtn;
    }

    public int getRequestID() {
        return requestID;
    }

    public int getRequestedFloor() {
        return requestedFloor;
    }

    public JButton getClickedBtn() {
        return clickedBtn;
    }
    
    
}
