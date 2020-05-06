package controller;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Elevator;

public class EmergencyController
{
    private final Elevator elevator; 

    public EmergencyController(Elevator elevator) {
        this.elevator = elevator;
    }
    
    
    public void EmergencyCall() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++)
                {
                    System.out.println("Emergancy !");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EmergencyController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    elevator.getDoor().setDoorState(true);
                    if (elevator.getGUI().getBtnEmergency().getBackground() != Color.RED) {
                        elevator.getGUI().getBtnEmergency().setBackground(Color.RED);
                        elevator.getGUI().getElevtorLedPanel().setBackground(Color.RED);
                    } else {
                        elevator.getGUI().getBtnEmergency().setBackground(Color.WHITE);
                        elevator.getGUI().getElevtorLedPanel().setBackground(Color.WHITE);
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EmergencyController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                
            }
        }).start();
    }
    
}
