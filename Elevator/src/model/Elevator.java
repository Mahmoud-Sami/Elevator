package model;

import events.CarStateSensor;
import events.LedStateSensor.Color;
import view.ElevatorView;

public class Elevator {
    // The Elevator GUI
    private ElevatorView gui;
    
    // Elevator Components
    private ElevatorLed led;
    private ElevatorDoor door;
    private ElevatorController controller;
    
    // Elevators Status
    private boolean doorState;
    private Color ledColor;
    private CarStateSensor.CarDirection carDir;
    private boolean isMoving;
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
        this.doorState = true;
        this.ledColor = Color.Green;
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
    
    public void MoveElevator(int floorNumber){
        this.controller.MoveElevator(floorNumber);
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

    public boolean getDoorState() {
        return doorState;
    }

    public Color getLedColor() {
        return ledColor;
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
    
    // Setter

    public void setDoorState(boolean doorState) {
        this.doorState = doorState;
    }

    public void setLedColor(Color ledColor) {
        this.ledColor = ledColor;
    }

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
    
    
    
}
