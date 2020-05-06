package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import model.Elevator;
import model.Request;

public class ElevatorController {
    
    private final Elevator elevator;
    private final Timer requestManager;
    private final ArrayList<Request> Requests;
    private final AudioController audioController;
    
    
    public ElevatorController(Elevator elevator) {
        
        this.elevator = elevator;
        this.requestManager = new Timer();
        this.Requests = new ArrayList<>();
        this.requestManager.schedule(new RequestManager(elevator, this), 0, 1000);
        this.audioController = new AudioController();
    }
    
    public void ChangeDoorState(boolean doorState){
        if (elevator.getIsMoving() == false){
            this.elevator.getDoor().setDoorState(doorState);
        }
    }
    
    public void AcceptRequest(Request request){
        boolean flagExist = false;
        for (Request r : Requests){
            if (r.getRequestedFloor() == request.getRequestedFloor() || r.getRequestID() == request.getRequestID() || request.getRequestedFloor() == elevator.getCurrentFloor()){
                flagExist = true;
            }
        }
        if (!flagExist)
            Requests.add(request);
        
    }

    public ArrayList<Request> getRequests() {
        return Requests;
    }

    public Request getNextRequest(){
        Collections.sort(Requests, (a, b) -> Math.abs(elevator.getCurrentFloor() - a.getRequestedFloor()) < Math.abs(elevator.getCurrentFloor() - b.getRequestedFloor()) ? -1 : 1);
        if (Requests.isEmpty())
            return null;
        else{
            return Requests.remove(0);
        }
    }
    
    public void MoveElevator(Request r){
        if (r.getRequestedFloor() != elevator.getCurrentFloor()){
            elevator.getGUI().getBtnOpenDoor().setEnabled(false);
            elevator.getGUI().getBtnCloseDoor().setEnabled(false);
            
            if (!elevator.getIsMoving())
                this.audioController.playDoaa();
            
            Timer t = new Timer();
            t.schedule(new ElevatorTranslateThread(elevator, r), 500, 7);
        }
    }

    public AudioController getAudioController() {
        return audioController;
    }
    
    

}
