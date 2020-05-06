package model;

import controller.EmergencyController;
import controller.ElevatorController;
import esper.Config;
import events.CarStateSensor;
import events.LedStateSensor.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import view.ElevatorView;

public class Elevator {
    // The Elevator GUI
    private final ElevatorView gui;
    
    // Elevator Components
    private final ElevatorLed led;
    private final ElevatorDoor door;
    private final ElevatorController controller;
    
    // Elevators StatusW
    private CarStateSensor.CarDirection carDir;
    private boolean isMoving;
    private boolean emergencyTrigger;
    private int carPositionY;
    private int currentFloor;
    
    public Elevator() {
        this.gui = new ElevatorView();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        
        // Initialize Components
        this.led = new ElevatorLed(this);
        this.door = new ElevatorDoor(this);
        this.controller = new ElevatorController(this);
        
        // Initialize Elevator Status
        this.carDir = CarStateSensor.CarDirection.None;
        this.isMoving = false;
        this.carPositionY = 580;
        this.currentFloor = 1;
    }
    
    public void OpenDoor(){
        this.controller.ChangeDoorState(true);
    }
    
    public void CloseDoor(){
        this.controller.ChangeDoorState(false);
    }
    
    public void AddRequest(Request request){
        this.controller.AcceptRequest(request);
    }
    
    public void RunEmergency(){
       this.gui.getBtnEmergency().setEnabled(false);
       this.gui.getAlarmImageLabel().setSize(200, 200);
        for (Component c : this.getGUI().getBuildingPanel().getComponents()) {
            if (c instanceof JButton) {
                c.setEnabled(false);
                c.setBackground(java.awt.Color.WHITE);
            }
        }
       
       for (Component c : this.gui.getButtonsPanel().getComponents()){
           if (c instanceof JButton) {
                c.setEnabled(false);
                c.setBackground(java.awt.Color.WHITE);
            }
       }
       this.isMoving = false;
       this.OpenDoor();
       this.controller.getAudioController().playEmergency();
       
        JLabel alaramImage = new JLabel("Hello Wolrd");
        alaramImage.setBounds(50,50, 100,30); 
        this.gui.add(alaramImage);
    }
    
    
    
    //--------------Getters------------------\\

    public ElevatorView getGUI() {
        return gui;
    }

    public ElevatorLed getLed() {
        return led;
    }

    public ElevatorDoor getDoor() {
        return door;
    }

    public ElevatorController getController() {
        return controller;
    }

    public CarStateSensor.CarDirection getCarDir() {
        return carDir;
    }

    public boolean getIsMoving() {
        return isMoving;
    }

    public int getCarPositionY() {
        return carPositionY;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isEmergencyTrigger() {
        return emergencyTrigger;
    }
    
    
    
    // Setter

    public void setCarDir(CarStateSensor.CarDirection carDir) {
        this.carDir = carDir;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public void setCarPositionY(int carPositionY) {
        this.carPositionY = carPositionY;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setEmergencyTrigger(boolean emergencyTrigger) {
        this.emergencyTrigger = emergencyTrigger;
    }
    
    
    
}
