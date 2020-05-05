package model;

import events.LedStateSensor.Color;
public class ElevatorLed {
    
    private Color ledColor;
    private Elevator elevator;

    public ElevatorLed(Elevator elevator) {
        this.ledColor = Color.Green;
        this.elevator = elevator;
    }

    public void setLedColor(Color color) {
        this.ledColor = color;
        if (color == Color.Green) {
            elevator.getGUI().getElevtorLedPanel().setBackground(java.awt.Color.GREEN);
        } else {
            elevator.getGUI().getElevtorLedPanel().setBackground(java.awt.Color.RED);
        }

    }
}
