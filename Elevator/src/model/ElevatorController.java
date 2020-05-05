package model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;

public class ElevatorController {
    
    private final Elevator elevator;
    private final Timer requestManager;
    private final Queue<CarRequest> CarRequestQueue;
    
    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        this.requestManager = new Timer();
        this.CarRequestQueue = new LinkedList<>();
        System.out.println(CarRequestQueue.isEmpty());
        requestManager.schedule(new RequestManager(elevator, this), 0, 1000);
    }
    
    public void ChangeDoorState(boolean doorState){
        if (elevator.getIsMoving() == false){
            this.elevator.getDoor().setDoorState(doorState);
        }
    }
    
    public void AcceptCarRequest(CarRequest request){
        boolean flagExist = false;
        for (CarRequest r : CarRequestQueue){
            if (r.getRequestedFloor() == request.getRequestedFloor() || r.getRequestID() == request.getRequestID()){
                flagExist = true;
            }
        }
        if (!flagExist)
            CarRequestQueue.add(request);
        
    }

    public Queue<CarRequest> getCarRequestQueue() {
        return CarRequestQueue;
    }

    public Request getNextRequest(){
        if (CarRequestQueue.isEmpty())
            return null;
        else
            return CarRequestQueue.peek();
    }
    
    public void removeTopRequest(){
        if (!CarRequestQueue.isEmpty())
            CarRequestQueue.remove();
    }
    
    public void MoveElevator(Request r){
        if (r.getRequestedFloor() != elevator.getCurrentFloor()){
            elevator.getGUI().getBtnOpenDoor().setEnabled(false);
            elevator.getGUI().getBtnCloseDoor().setEnabled(false);
            new Timer().schedule(new ElevatorTranslateThread(elevator, r), 500, 7);
        }
    }
}
