package com.views;

import com.utilities.ValidationUtilities;
import com.utilities.UIComponentUtilities;
import com.utilities.DBAccessUtilities;
import com.utilities.DBOperationUtilities;
import javax.swing.*;

public class AddNewEmployee extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities;        
    private final ValidationUtilities validation;
    private DBOperationUtilities dboperation;
    private DBAccessUtilities dbaccesstocken;
    public AddNewEmployee() { 
        utilities = new UIComponentUtilities();
        validation = new ValidationUtilities();        
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
        eddNewEmployeeLabel = new javax.swing.JLabel();
        BackButtonPanel = new javax.swing.JPanel();
        BackButtenLabel = new javax.swing.JLabel();
        nextButtonPanel = new javax.swing.JPanel();
        nextButtenLabel = new javax.swing.JLabel();
        employeeName = new javax.swing.JTextField();
        employeeNameLabel = new javax.swing.JLabel();
        employeeId = new javax.swing.JTextField();
        employeeIdLabel = new javax.swing.JLabel();
        employeeAddress = new javax.swing.JTextField();
        employeeAddressLabel = new javax.swing.JLabel();
        employeePhone = new javax.swing.JTextField();
        employeePhoneLabel = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setBackground(utilities.colorutil.bodypanelcolor);
        setForeground(utilities.colorutil.primarytextcolor);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(527, 500));

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

        eddNewEmployeeLabel.setBackground(utilities.colorutil.bodypanelcolor);
        eddNewEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        eddNewEmployeeLabel.setForeground(utilities.colorutil.primarytextcolor);
        eddNewEmployeeLabel.setText("Add new Employee");

        BackButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        BackButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        BackButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        BackButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButtonPanel.setFocusCycleRoot(true);
        BackButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBack(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        BackButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        BackButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BackButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        BackButtenLabel.setText("< Back");
        BackButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButtenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBack(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverButtonicLabels(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverButtonicLabels(evt);
            }
        });

        javax.swing.GroupLayout BackButtonPanelLayout = new javax.swing.GroupLayout(BackButtonPanel);
        BackButtonPanel.setLayout(BackButtonPanelLayout);
        BackButtonPanelLayout.setHorizontalGroup(
            BackButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButtenLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackButtonPanelLayout.setVerticalGroup(
            BackButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        nextButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        nextButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        nextButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        nextButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployee(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        nextButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        nextButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nextButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        nextButtenLabel.setText("Next >");
        nextButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButtenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployee(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverButtonicLabels(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverButtonicLabels(evt);
            }
        });

        javax.swing.GroupLayout nextButtonPanelLayout = new javax.swing.GroupLayout(nextButtonPanel);
        nextButtonPanel.setLayout(nextButtonPanelLayout);
        nextButtonPanelLayout.setHorizontalGroup(
            nextButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextButtonPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(nextButtenLabel)
                .addContainerGap())
        );
        nextButtonPanelLayout.setVerticalGroup(
            nextButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        employeeName.setBackground(utilities.colorutil.bodypanelcolor);
        employeeName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        employeeName.setForeground(utilities.colorutil.primarytextcolor);
        employeeName.setText("Employee Name");
        employeeName.setToolTipText("Employee Name");
        employeeName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        employeeName.setCaretColor(utilities.colorutil.primarytextcolor);
        employeeName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        employeeNameLabel.setBackground(utilities.colorutil.bodypanelcolor);
        employeeNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        employeeNameLabel.setForeground(utilities.colorutil.primarytextcolor);
        employeeNameLabel.setText("Employee Name");

        employeeId.setBackground(utilities.colorutil.bodypanelcolor);
        employeeId.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        employeeId.setForeground(utilities.colorutil.primarytextcolor);
        employeeId.setText("Employee Id");
        employeeId.setToolTipText("Employee Id");
        employeeId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        employeeId.setCaretColor(utilities.colorutil.primarytextcolor);
        employeeId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        employeeIdLabel.setBackground(utilities.colorutil.bodypanelcolor);
        employeeIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        employeeIdLabel.setForeground(utilities.colorutil.primarytextcolor);
        employeeIdLabel.setText("Employee Id");

        employeeAddress.setBackground(utilities.colorutil.bodypanelcolor);
        employeeAddress.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        employeeAddress.setForeground(utilities.colorutil.primarytextcolor);
        employeeAddress.setText("Address");
        employeeAddress.setToolTipText("Address");
        employeeAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        employeeAddress.setCaretColor(utilities.colorutil.primarytextcolor);
        employeeAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        employeeAddressLabel.setBackground(utilities.colorutil.bodypanelcolor);
        employeeAddressLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        employeeAddressLabel.setForeground(utilities.colorutil.primarytextcolor);
        employeeAddressLabel.setText("Address");

        employeePhone.setBackground(utilities.colorutil.bodypanelcolor);
        employeePhone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        employeePhone.setForeground(utilities.colorutil.primarytextcolor);
        employeePhone.setText("Phone no.");
        employeePhone.setToolTipText("Phone no.");
        employeePhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        employeePhone.setCaretColor(utilities.colorutil.primarytextcolor);
        employeePhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        employeePhoneLabel.setBackground(utilities.colorutil.bodypanelcolor);
        employeePhoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        employeePhoneLabel.setForeground(utilities.colorutil.primarytextcolor);
        employeePhoneLabel.setText("Phone no.");

        status.setBackground(utilities.colorutil.bodypanelcolor);
        status.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status.setForeground(utilities.colorutil.primarytextcolor);
        status.setText("Status : Connecting ...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(eddNewEmployeeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)
                                .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeNameLabel)
                                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeIdLabel)
                                    .addComponent(employeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeAddressLabel)
                                    .addComponent(employeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeePhoneLabel)
                                    .addComponent(employeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eddNewEmployeeLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeePhoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void commonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commonHoverButtons
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_commonHoverButtons

    private void getBack(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBack
        utilities.switchFromTo(this, new ManipulateEmployeeDetails());
    }//GEN-LAST:event_getBack

    private void hoverButtonicLabels(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverButtonicLabels
        utilities.hoverGeneralButtonicPanels((JPanel)(((JLabel)(evt.getSource())).getParent()));
    }//GEN-LAST:event_hoverButtonicLabels

    private void focusTextFields(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusTextFields
        utilities.onFocusTextFields((JTextField)(evt.getSource()));
    }//GEN-LAST:event_focusTextFields

    private void addEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployee
        String result;
        try{
            if(validation.validateEmployee(employeeName.getText(),employeeAddress.getText(), employeeId.getText(),employeePhone.getText())){
                result = dbaccesstocken.con.isClosed() ? "Database communication link failure" : dboperation.addEmployee(employeeName.getText(),employeeAddress.getText(), employeeId.getText(),employeePhone.getText());
                if("success".equals(result)){
                    JOptionPane.showMessageDialog(this.getParent(),"Successfully Added Employee.", "Success",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_In_Progress_48px.png")));                    
                    utilities.switchFromTo(this, new AddNewEmployee());
                }else{
                    status.setText("Status : "+(dbaccesstocken.con.isClosed() ? "Not Connected" : "Connected"));
                    JOptionPane.showMessageDialog(this.getParent(),result, "Insertion error",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
                }  
                if(dbaccesstocken.con.isClosed()){                
                    initConnection();
                }
            }else{            
                JOptionPane.showMessageDialog(this.getParent(),"Please enter valid credentials.\nId and phone number should be in the form of 10 digits", "Invalid Credentials",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8-s.h.i.e.l.d.png")));
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this.getParent(),"Database communication link failure", "Oops...... Error occurred",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
            initConnection();
        }catch(Exception e){
            System.out.println("unknown exception : ");
            System.out.println(e.getClass());
        }                
    }//GEN-LAST:event_addEmployee

    private void minimize_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblMouseClicked
        utilities.actionMinimize((JFrame) SwingUtilities.getWindowAncestor(this));
    }//GEN-LAST:event_minimize_lblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButtenLabel;
    private javax.swing.JPanel BackButtonPanel;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel eddNewEmployeeLabel;
    private javax.swing.JTextField employeeAddress;
    private javax.swing.JLabel employeeAddressLabel;
    private javax.swing.JTextField employeeId;
    private javax.swing.JLabel employeeIdLabel;
    private javax.swing.JTextField employeeName;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JTextField employeePhone;
    private javax.swing.JLabel employeePhoneLabel;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JLabel nextButtenLabel;
    private javax.swing.JPanel nextButtonPanel;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
