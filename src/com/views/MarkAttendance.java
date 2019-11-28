package com.views;

import com.utilities.DBAccessUtilities;
import com.utilities.DBOperationUtilities;
import com.utilities.UIComponentUtilities;
import java.util.Date;
import javax.swing.*;
import java.awt.Component;
import java.text.SimpleDateFormat;

public class MarkAttendance extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();
    private DBOperationUtilities dboperation;
    private DBAccessUtilities dbaccesstocken; 
    private SimpleDateFormat sdf;
    public MarkAttendance() {          
        initComponents();       
        initConnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        EmployeeId = new javax.swing.JTextField();
        EmployeeIdlbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        AteendanceMasterlbl = new javax.swing.JLabel();
        absentButtonPanel = new javax.swing.JPanel();
        absentButtenLabel = new javax.swing.JLabel();
        presentButtonPanel = new javax.swing.JPanel();
        presentButtenLabel = new javax.swing.JLabel();
        dateOfAttendance = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setBackground(utilities.colorutil.bodypanelcolor);
        setForeground(utilities.colorutil.primarytextcolor);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        panelHead.setBackground(utilities.colorutil.headpanelandhovercolor);
        panelHead.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.bodypanelcolor));
        panelHead.setForeground(utilities.colorutil.primarytextcolor);

        title.setBackground(utilities.colorutil.headpanelandhovercolor);
        title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        title.setForeground(utilities.colorutil.primarytextcolor);
        title.setText("Employee Attendance Management System");

        minimize_lbl.setBackground(utilities.colorutil.headpanelandhovercolor);
        minimize_lbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minimize_lbl.setForeground(utilities.colorutil.primarytextcolor);
        minimize_lbl.setText("-");
        minimize_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_lblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseHoverminimmizeClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseHoverminimmizeClose(evt);
            }
        });

        close_lbl.setBackground(utilities.colorutil.headpanelandhovercolor);
        close_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close_lbl.setForeground(utilities.colorutil.primarytextcolor);
        close_lbl.setText("X");
        close_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actionClose(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseHoverminimmizeClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseHoverminimmizeClose(evt);
            }
        });

        javax.swing.GroupLayout panelHeadLayout = new javax.swing.GroupLayout(panelHead);
        panelHead.setLayout(panelHeadLayout);
        panelHeadLayout.setHorizontalGroup(
            panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimize_lbl)
                .addGap(18, 18, 18)
                .addComponent(close_lbl)
                .addContainerGap())
        );
        panelHeadLayout.setVerticalGroup(
            panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeadLayout.createSequentialGroup()
                .addGroup(panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimize_lbl))
                .addGap(70, 70, 70))
            .addGroup(panelHeadLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EmployeeId.setBackground(utilities.colorutil.bodypanelcolor);
        EmployeeId.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        EmployeeId.setForeground(utilities.colorutil.primarytextcolor);
        EmployeeId.setText("Employee Id");
        EmployeeId.setToolTipText("Employee Id");
        EmployeeId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        EmployeeId.setCaretColor(utilities.colorutil.initialColor);
        EmployeeId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        EmployeeIdlbl.setBackground(utilities.colorutil.bodypanelcolor);
        EmployeeIdlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        EmployeeIdlbl.setForeground(utilities.colorutil.primarytextcolor);
        EmployeeIdlbl.setText("Employee ID");

        passwordlbl.setBackground(utilities.colorutil.bodypanelcolor);
        passwordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordlbl.setForeground(utilities.colorutil.primarytextcolor);
        passwordlbl.setText("Date");

        AteendanceMasterlbl.setBackground(utilities.colorutil.bodypanelcolor);
        AteendanceMasterlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AteendanceMasterlbl.setForeground(utilities.colorutil.primarytextcolor);
        AteendanceMasterlbl.setText("Attendance Master");

        absentButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        absentButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        absentButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        absentButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        absentButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markAttendance(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        absentButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        absentButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        absentButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        absentButtenLabel.setText("ABSENT");
        absentButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout absentButtonPanelLayout = new javax.swing.GroupLayout(absentButtonPanel);
        absentButtonPanel.setLayout(absentButtonPanelLayout);
        absentButtonPanelLayout.setHorizontalGroup(
            absentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(absentButtonPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(absentButtenLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        absentButtonPanelLayout.setVerticalGroup(
            absentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(absentButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        presentButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        presentButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        presentButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        presentButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        presentButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markAttendance(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        presentButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        presentButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        presentButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        presentButtenLabel.setText("PRESENT");
        presentButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout presentButtonPanelLayout = new javax.swing.GroupLayout(presentButtonPanel);
        presentButtonPanel.setLayout(presentButtonPanelLayout);
        presentButtonPanelLayout.setHorizontalGroup(
            presentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presentButtonPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(presentButtenLabel)
                .addGap(8, 8, 8))
        );
        presentButtonPanelLayout.setVerticalGroup(
            presentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(presentButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        dateOfAttendance.setBackground(utilities.colorutil.bodypanelcolor);
        dateOfAttendance.setForeground(utilities.colorutil.primarytextcolor);
        dateOfAttendance.getComponent(0).setBackground(utilities.colorutil.bodypanelcolor);
        dateOfAttendance.setDate(new Date());
        dateOfAttendance.setMaxSelectableDate(new Date());
        dateOfAttendance.setPreferredSize(new java.awt.Dimension(108, 28));
        for(Component c : dateOfAttendance.getComponents()){
            ((JComponent)c).setBackground(utilities.colorutil.bodypanelcolor);
            ((JComponent)c).setForeground(utilities.colorutil.primarytextcolor);
            ((JComponent)c).setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0,utilities.colorutil.initialBorder));
            if(((JComponent)c) instanceof JTextField){
                ((JTextField)c).setEnabled(false);
                ((JTextField)c).setDisabledTextColor(utilities.colorutil.primarytextcolor);
                ((JTextField)c).setBackground(utilities.colorutil.bodypanelcolor);
            }
            ((JComponent)c).addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    ((JComponent)c).setForeground(utilities.colorutil.primarytextcolor);
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    ((JComponent)c).setForeground(utilities.colorutil.primarytextcolor);
                }
            });
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(utilities.colorutil.primarytextcolor);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-left_4_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1getBack(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1backHover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1backHover1(evt);
            }
        });

        status.setBackground(utilities.colorutil.bodypanelcolor);
        status.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status.setForeground(utilities.colorutil.primarytextcolor);
        status.setText("Status : Connecting ...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(AteendanceMasterlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordlbl)
                            .addComponent(EmployeeIdlbl)
                            .addComponent(EmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(presentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(absentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateOfAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(status))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AteendanceMasterlbl)
                .addGap(18, 18, 18)
                .addComponent(EmployeeIdlbl)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(passwordlbl))
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addComponent(dateOfAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(absentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initConnection(){
        new Thread(){
                public void run(){
                    try{
                        dbaccesstocken = new DBAccessUtilities();
                        dboperation = new DBOperationUtilities(dbaccesstocken);
                        status.setText("Status : "+(dbaccesstocken.con.isClosed() ? "Not Connected" : "Connected"));
                    }catch(Exception e){                 
                        status.setText("Status : Not Connected");                        
                    }
                }
            }.start();
    }
    private void mouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseHoverminimmizeClose
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_mouseHoverminimmizeClose

    private void actionClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionClose
        utilities.actionClose(evt,dbaccesstocken);
    }//GEN-LAST:event_actionClose

    private void FocusTextFields(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FocusTextFields
        utilities.onFocusTextFields((JTextField)(evt.getSource()));
    }//GEN-LAST:event_FocusTextFields

    private void commonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commonHoverButtons
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_commonHoverButtons

    private void jLabel1getBack(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1getBack
        utilities.switchFromTo(this, new AdminOptions());
    }//GEN-LAST:event_jLabel1getBack

    private void jLabel1backHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1backHover
        utilities.backHover(evt);
    }//GEN-LAST:event_jLabel1backHover

    private void jLabel1backHover1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1backHover1
        utilities.backHover(evt);
    }//GEN-LAST:event_jLabel1backHover1

    private void markAttendance(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markAttendance
        String result;
        sdf = new SimpleDateFormat("YYYY-MM-dd");        
        if(EmployeeId.getText().length() == 10){
                try{
                result = dbaccesstocken.con.isClosed() ? "Database communication link failure" : dboperation.markAttendance(EmployeeId.getText(),sdf.format(dateOfAttendance.getDate()),((JLabel)(((JPanel)evt.getSource()).getComponent(0))).getText());
                if("success".equals(result)){
                    JOptionPane.showMessageDialog(this.getParent(),"Attendance successfully recorded", "Success",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_In_Progress_48px.png")));                
                    EmployeeId.setText("Employee Id");
                }else{
                    status.setText("Status : "+(dbaccesstocken.con.isClosed() ? "Not Connected" : "Connected"));
                    JOptionPane.showMessageDialog(this.getParent(),result, "Oops...... Error occurred",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
                }
                if(dbaccesstocken.con.isClosed()){                
                    initConnection();
                }
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(this.getParent(),"Database communication link failure", "Oops...... Error occurred",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
                initConnection();
            }catch(Exception e){}                    
        }else{
            JOptionPane.showMessageDialog(this.getParent(),"Invalid Employee Id. ( Employee Id should be a 10 digit number )", "Oops...... Error occurred",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
        }
    }//GEN-LAST:event_markAttendance

    private void minimize_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblMouseClicked
        utilities.actionMinimize((JFrame) SwingUtilities.getWindowAncestor(this));
    }//GEN-LAST:event_minimize_lblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AteendanceMasterlbl;
    private javax.swing.JTextField EmployeeId;
    private javax.swing.JLabel EmployeeIdlbl;
    private javax.swing.JLabel absentButtenLabel;
    private javax.swing.JPanel absentButtonPanel;
    private javax.swing.JLabel close_lbl;
    private com.toedter.calendar.JDateChooser dateOfAttendance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel presentButtenLabel;
    private javax.swing.JPanel presentButtonPanel;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
