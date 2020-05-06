/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import esper.Config;
import events.CarCallEvent;
import events.DoorStateSensor;
import events.EmergencyEvent;
import events.RequestFloorEvent;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ElevatorView extends javax.swing.JFrame {

    
    
    
    public ElevatorView() {
        initComponents();
        this.setTitle("Elevator Control System - Simulation");
        this.setResizable(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuildingPanel = new javax.swing.JPanel();
        btnCall6Down = new javax.swing.JButton();
        btnCall5Up = new javax.swing.JButton();
        btnCall5Down = new javax.swing.JButton();
        btnCall4Up = new javax.swing.JButton();
        btnCall4Down = new javax.swing.JButton();
        btnCall3Up = new javax.swing.JButton();
        btnCall3Down = new javax.swing.JButton();
        btnCall2Up = new javax.swing.JButton();
        btnCall2Down = new javax.swing.JButton();
        btnCall1Up = new javax.swing.JButton();
        ElevatorPanel = new javax.swing.JPanel();
        elevtorLedPanel = new javax.swing.JPanel();
        doorImageLabel = new javax.swing.JLabel();
        ButtonsPanel = new javax.swing.JPanel();
        btnFloor1 = new javax.swing.JButton();
        btnFloor2 = new javax.swing.JButton();
        btnFloor3 = new javax.swing.JButton();
        btnFloor4 = new javax.swing.JButton();
        btnFloor5 = new javax.swing.JButton();
        btnFloor6 = new javax.swing.JButton();
        btnOpenDoor = new javax.swing.JButton();
        btnCloseDoor = new javax.swing.JButton();
        btnEmergency = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alarmImageLabel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BuildingPanel.setBackground(new java.awt.Color(255, 255, 255));
        BuildingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCall6Down.setBackground(new java.awt.Color(255, 255, 255));
        btnCall6Down.setText("↓");
        btnCall6Down.setName("D6"); // NOI18N
        btnCall6Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall6DownActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall6Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 45, 40));

        btnCall5Up.setBackground(new java.awt.Color(255, 255, 255));
        btnCall5Up.setText("↑");
        btnCall5Up.setName("U5"); // NOI18N
        btnCall5Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall5UpActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall5Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 45, 40));

        btnCall5Down.setBackground(new java.awt.Color(255, 255, 255));
        btnCall5Down.setText("↓");
        btnCall5Down.setName("D5"); // NOI18N
        btnCall5Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall5DownActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall5Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 45, 40));

        btnCall4Up.setBackground(new java.awt.Color(255, 255, 255));
        btnCall4Up.setText("↑");
        btnCall4Up.setName("U4"); // NOI18N
        btnCall4Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall4UpActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall4Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 45, 40));

        btnCall4Down.setBackground(new java.awt.Color(255, 255, 255));
        btnCall4Down.setText("↓");
        btnCall4Down.setName("D4"); // NOI18N
        btnCall4Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall4DownActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall4Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 45, 40));

        btnCall3Up.setBackground(new java.awt.Color(255, 255, 255));
        btnCall3Up.setText("↑");
        btnCall3Up.setName("U3"); // NOI18N
        btnCall3Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall3UpActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall3Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 45, 40));

        btnCall3Down.setBackground(new java.awt.Color(255, 255, 255));
        btnCall3Down.setText("↓");
        btnCall3Down.setName("D3"); // NOI18N
        btnCall3Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall3DownActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall3Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 45, 40));

        btnCall2Up.setBackground(new java.awt.Color(255, 255, 255));
        btnCall2Up.setText("↑");
        btnCall2Up.setName("U2"); // NOI18N
        btnCall2Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall2UpActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall2Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 45, 40));

        btnCall2Down.setBackground(new java.awt.Color(255, 255, 255));
        btnCall2Down.setText("↓");
        btnCall2Down.setName("D2"); // NOI18N
        btnCall2Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall2DownActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall2Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 45, 40));

        btnCall1Up.setBackground(new java.awt.Color(255, 255, 255));
        btnCall1Up.setText("↑");
        btnCall1Up.setName("U1"); // NOI18N
        btnCall1Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall1UpActionPerformed(evt);
            }
        });
        BuildingPanel.add(btnCall1Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 45, 40));

        ElevatorPanel.setBackground(new java.awt.Color(0, 153, 255));
        ElevatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elevtorLedPanel.setBackground(new java.awt.Color(0, 204, 51));
        elevtorLedPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout elevtorLedPanelLayout = new javax.swing.GroupLayout(elevtorLedPanel);
        elevtorLedPanel.setLayout(elevtorLedPanelLayout);
        elevtorLedPanelLayout.setHorizontalGroup(
            elevtorLedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        elevtorLedPanelLayout.setVerticalGroup(
            elevtorLedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        ElevatorPanel.add(elevtorLedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        doorImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/opened.png"))); // NOI18N
        ElevatorPanel.add(doorImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 60));

        BuildingPanel.add(ElevatorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 50, 65));

        ButtonsPanel.setBackground(new java.awt.Color(219, 217, 208));
        ButtonsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFloor1.setBackground(new java.awt.Color(255, 255, 255));
        btnFloor1.setText("1");
        btnFloor1.setName("B1"); // NOI18N
        btnFloor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor1ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnFloor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 50));

        btnFloor2.setBackground(new java.awt.Color(255, 255, 255));
        btnFloor2.setText("2");
        btnFloor2.setName("B2"); // NOI18N
        btnFloor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor2ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnFloor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, 50));

        btnFloor3.setBackground(new java.awt.Color(255, 255, 255));
        btnFloor3.setText("3");
        btnFloor3.setName("B3"); // NOI18N
        btnFloor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor3ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnFloor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 50));

        btnFloor4.setBackground(new java.awt.Color(255, 255, 255));
        btnFloor4.setText("4");
        btnFloor4.setName("B4"); // NOI18N
        btnFloor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor4ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnFloor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, 50));

        btnFloor5.setBackground(new java.awt.Color(255, 255, 255));
        btnFloor5.setText("5");
        btnFloor5.setName("B5"); // NOI18N
        btnFloor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor5ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnFloor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 50));

        btnFloor6.setBackground(new java.awt.Color(255, 255, 255));
        btnFloor6.setText("6");
        btnFloor6.setName("B6"); // NOI18N
        btnFloor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloor6ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnFloor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 80, 50));

        btnOpenDoor.setText("Open Door");
        btnOpenDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenDoorActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnOpenDoor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 50));

        btnCloseDoor.setText("Close Door");
        btnCloseDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseDoorActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnCloseDoor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 50));

        btnEmergency.setText("Emergency");
        btnEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencyActionPerformed(evt);
            }
        });
        ButtonsPanel.add(btnEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, 50));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elevator Controller");
        ButtonsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 30));

        BuildingPanel.add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 190, 390));

        alarmImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/alarm.gif"))); // NOI18N
        alarmImageLabel.setPreferredSize(new java.awt.Dimension(20, 96));
        BuildingPanel.add(alarmImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 10, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/bg2.jpg"))); // NOI18N
        BuildingPanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BuildingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuildingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFloor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor1ActionPerformed
        Config.sendEvent(new RequestFloorEvent(1));
    }//GEN-LAST:event_btnFloor1ActionPerformed

    private void btnFloor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor2ActionPerformed
        Config.sendEvent(new RequestFloorEvent(2));
    }//GEN-LAST:event_btnFloor2ActionPerformed

    private void btnFloor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor3ActionPerformed
        Config.sendEvent(new RequestFloorEvent(3));
    }//GEN-LAST:event_btnFloor3ActionPerformed

    private void btnFloor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor4ActionPerformed
        Config.sendEvent(new RequestFloorEvent(4));
    }//GEN-LAST:event_btnFloor4ActionPerformed

    private void btnFloor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor5ActionPerformed
        Config.sendEvent(new RequestFloorEvent(5));
    }//GEN-LAST:event_btnFloor5ActionPerformed

    private void btnFloor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloor6ActionPerformed
        Config.sendEvent(new RequestFloorEvent(6));
    }//GEN-LAST:event_btnFloor6ActionPerformed

    private void btnOpenDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenDoorActionPerformed
        
        Config.sendEvent(new DoorStateSensor(true));
    }//GEN-LAST:event_btnOpenDoorActionPerformed

    private void btnCloseDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseDoorActionPerformed
        Config.sendEvent(new DoorStateSensor(false));
    }//GEN-LAST:event_btnCloseDoorActionPerformed

    private void btnEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencyActionPerformed
        Config.sendEvent(new EmergencyEvent(true));
    }//GEN-LAST:event_btnEmergencyActionPerformed

    private void btnCall5UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall5UpActionPerformed
        Config.sendEvent(new CarCallEvent(5, CarCallEvent.Direction.UP));
    }//GEN-LAST:event_btnCall5UpActionPerformed

    private void btnCall4UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall4UpActionPerformed
        Config.sendEvent(new CarCallEvent(4, CarCallEvent.Direction.UP));
    }//GEN-LAST:event_btnCall4UpActionPerformed

    private void btnCall3UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall3UpActionPerformed
        Config.sendEvent(new CarCallEvent(3, CarCallEvent.Direction.UP));
    }//GEN-LAST:event_btnCall3UpActionPerformed

    private void btnCall2UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall2UpActionPerformed
        Config.sendEvent(new CarCallEvent(2, CarCallEvent.Direction.UP));
    }//GEN-LAST:event_btnCall2UpActionPerformed

    private void btnCall1UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall1UpActionPerformed
        Config.sendEvent(new CarCallEvent(1, CarCallEvent.Direction.UP));
    }//GEN-LAST:event_btnCall1UpActionPerformed

    private void btnCall2DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall2DownActionPerformed
        Config.sendEvent(new CarCallEvent(2, CarCallEvent.Direction.DOWN));
    }//GEN-LAST:event_btnCall2DownActionPerformed

    private void btnCall3DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall3DownActionPerformed
        Config.sendEvent(new CarCallEvent(3, CarCallEvent.Direction.DOWN));
    }//GEN-LAST:event_btnCall3DownActionPerformed

    private void btnCall4DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall4DownActionPerformed
        Config.sendEvent(new CarCallEvent(4, CarCallEvent.Direction.DOWN));
    }//GEN-LAST:event_btnCall4DownActionPerformed

    private void btnCall5DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall5DownActionPerformed
        Config.sendEvent(new CarCallEvent(5, CarCallEvent.Direction.DOWN));
    }//GEN-LAST:event_btnCall5DownActionPerformed

    private void btnCall6DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall6DownActionPerformed
        Config.sendEvent(new CarCallEvent(6, CarCallEvent.Direction.DOWN));
    }//GEN-LAST:event_btnCall6DownActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened


    public JPanel getElevatorPanel() {
        return ElevatorPanel;
    }

    public JButton getBtnCall1Up() {
        return btnCall1Up;
    }

    public JButton getBtnCall2Down() {
        return btnCall2Down;
    }

    public JButton getBtnCall2Up() {
        return btnCall2Up;
    }

    public JButton getBtnCall3Down() {
        return btnCall3Down;
    }

    public JButton getBtnCall3Up() {
        return btnCall3Up;
    }

    public JButton getBtnCall4Down() {
        return btnCall4Down;
    }

    public JButton getBtnCall4Up() {
        return btnCall4Up;
    }

    public JButton getBtnCall5Down() {
        return btnCall5Down;
    }

    public JButton getBtnCall5Up() {
        return btnCall5Up;
    }

    public JButton getBtnCall6Down() {
        return btnCall6Down;
    }

    public JButton getBtnCloseDoor() {
        return btnCloseDoor;
    }

    public JButton getBtnEmergency() {
        return btnEmergency;
    }

    public JButton getBtnFloor1() {
        return btnFloor1;
    }

    public JButton getBtnFloor2() {
        return btnFloor2;
    }

    public JButton getBtnFloor3() {
        return btnFloor3;
    }

    public JButton getBtnFloor4() {
        return btnFloor4;
    }

    public JButton getBtnFloor5() {
        return btnFloor5;
    }

    public JButton getBtnFloor6() {
        return btnFloor6;
    }

    public JButton getBtnOpenDoor() {
        return btnOpenDoor;
    }

    public JLabel getDoorImageLabel() {
        return doorImageLabel;
    }

    public JPanel getElevtorLedPanel() {
        return elevtorLedPanel;
    }

    public JPanel getBuildingPanel() {
        return BuildingPanel;
    }

    public JPanel getButtonsPanel() {
        return ButtonsPanel;
    }

    public JLabel getAlarmImageLabel() {
        return alarmImageLabel;
    }


    
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuildingPanel;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel ElevatorPanel;
    private javax.swing.JLabel alarmImageLabel;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnCall1Up;
    private javax.swing.JButton btnCall2Down;
    private javax.swing.JButton btnCall2Up;
    private javax.swing.JButton btnCall3Down;
    private javax.swing.JButton btnCall3Up;
    private javax.swing.JButton btnCall4Down;
    private javax.swing.JButton btnCall4Up;
    private javax.swing.JButton btnCall5Down;
    private javax.swing.JButton btnCall5Up;
    private javax.swing.JButton btnCall6Down;
    private javax.swing.JButton btnCloseDoor;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnFloor1;
    private javax.swing.JButton btnFloor2;
    private javax.swing.JButton btnFloor3;
    private javax.swing.JButton btnFloor4;
    private javax.swing.JButton btnFloor5;
    private javax.swing.JButton btnFloor6;
    private javax.swing.JButton btnOpenDoor;
    private javax.swing.JLabel doorImageLabel;
    private javax.swing.JPanel elevtorLedPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
