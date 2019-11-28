package com.views;

import com.utilities.ValidationUtilities;
import com.utilities.UIComponentUtilities;
import com.utilities.DBAccessUtilities;
import com.utilities.DBOperationUtilities;
import javax.swing.*;

public class SignupPanel extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities;        
    private final ValidationUtilities validation;   
    private DBOperationUtilities dboperation;
    private DBAccessUtilities dbaccesstocken;    
    public SignupPanel() { 
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
        passwordField = new javax.swing.JPasswordField();
        passwordlbl = new javax.swing.JLabel();
        createAnAccountLabel = new javax.swing.JLabel();
        BackButtonPanel = new javax.swing.JPanel();
        BackButtenLabel = new javax.swing.JLabel();
        nextButtonPanel = new javax.swing.JPanel();
        nextButtenLabel = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        userNamelbl = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        confirmPasswordlbl = new javax.swing.JLabel();
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

        passwordField.setBackground(utilities.colorutil.bodypanelcolor);
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordField.setForeground(utilities.colorutil.primarytextcolor);
        passwordField.setText("Password");
        passwordField.setToolTipText("Password");
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        passwordField.setCaretColor(utilities.colorutil.initialColor);
        passwordField.setPreferredSize(new java.awt.Dimension(55, 19));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        passwordlbl.setBackground(utilities.colorutil.bodypanelcolor);
        passwordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordlbl.setForeground(utilities.colorutil.primarytextcolor);
        passwordlbl.setText("Password");

        createAnAccountLabel.setBackground(utilities.colorutil.bodypanelcolor);
        createAnAccountLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createAnAccountLabel.setForeground(utilities.colorutil.primarytextcolor);
        createAnAccountLabel.setText("Create an account");

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
                actionSignup(evt);
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
                actionSignup(evt);
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

        userName.setBackground(utilities.colorutil.bodypanelcolor);
        userName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userName.setForeground(utilities.colorutil.primarytextcolor);
        userName.setText("UserName");
        userName.setToolTipText("UserName");
        userName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        userName.setCaretColor(utilities.colorutil.initialColor);
        userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        userNamelbl.setBackground(utilities.colorutil.bodypanelcolor);
        userNamelbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userNamelbl.setForeground(utilities.colorutil.primarytextcolor);
        userNamelbl.setText("UserName");

        confirmPasswordField.setBackground(utilities.colorutil.bodypanelcolor);
        confirmPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        confirmPasswordField.setForeground(utilities.colorutil.primarytextcolor);
        confirmPasswordField.setText("Confirm Password");
        confirmPasswordField.setToolTipText("Confirm Password");
        confirmPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        confirmPasswordField.setCaretColor(utilities.colorutil.initialColor);
        confirmPasswordField.setPreferredSize(new java.awt.Dimension(55, 19));
        confirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        confirmPasswordlbl.setBackground(utilities.colorutil.bodypanelcolor);
        confirmPasswordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        confirmPasswordlbl.setForeground(utilities.colorutil.primarytextcolor);
        confirmPasswordlbl.setText("Confirm Password");

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
                        .addComponent(createAnAccountLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordlbl)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(confirmPasswordlbl)
                                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(userNamelbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userName, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(status)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAnAccountLabel)
                .addGap(28, 28, 28)
                .addComponent(userNamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordlbl)
                        .addGap(0, 0, 0)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmPasswordlbl)
                        .addGap(0, 0, 0)
                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void getBack(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBack
        utilities.switchFromTo(this, new LoginPanel());
    }//GEN-LAST:event_getBack

    private void hoverButtonicLabels(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverButtonicLabels
        utilities.hoverGeneralButtonicPanels((JPanel)(((JLabel)(evt.getSource())).getParent()));
    }//GEN-LAST:event_hoverButtonicLabels

    private void actionSignup(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionSignup
        String result;
        try{
            if((String.valueOf(passwordField.getPassword())).equals((String.valueOf(confirmPasswordField.getPassword()))) && validation.validateUserNameAndPassword(new String[]{userName.getText(),String.valueOf(passwordField.getPassword())})){
                result = dbaccesstocken.con.isClosed() ? "Database communication link failure" : dboperation.insertEmployee(userName.getText(),String.valueOf(passwordField.getPassword()));           
                if("success".equals(result)){
                    JOptionPane.showMessageDialog(this.getParent(),"Successfully created account, please sign in to continue", "Success",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_In_Progress_48px.png")));
                    utilities.switchFromTo(this, new LoginPanel());
                }else{
                    status.setText("Status : "+(dbaccesstocken.con.isClosed() ? "Not Connected" : "Connected"));
                    JOptionPane.showMessageDialog(this.getParent(),result, "Insertion error",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
                }  
                if(dbaccesstocken.con.isClosed()){                
                    initConnection();
                }
            }else{            
                String errormessage = validation.validateUserNameAndPassword(new String[]{userName.getText(),String.valueOf(passwordField.getPassword())}) ? "Password doesn't match" : "> Invalid username or password."
                        + "\n> Username and password should be of minimum 8 characters and should be in \nthe form of one uppercase, one lowercase, one special character and one number."
                        + "\nEx. : John@1234";
                JOptionPane.showMessageDialog(this.getParent(),errormessage, "Invalid Credentials",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8-s.h.i.e.l.d.png")));
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this.getParent(),"Database communication link failure", "Oops...... Error occurred",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
            initConnection();
        }catch(Exception e){
            System.out.println("unknown exception : ");
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_actionSignup

    private void minimize_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblMouseClicked
        utilities.actionMinimize((JFrame) SwingUtilities.getWindowAncestor(this));
    }//GEN-LAST:event_minimize_lblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButtenLabel;
    private javax.swing.JPanel BackButtonPanel;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordlbl;
    private javax.swing.JLabel createAnAccountLabel;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JLabel nextButtenLabel;
    private javax.swing.JPanel nextButtonPanel;
    private javax.swing.JPanel panelHead;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNamelbl;
    // End of variables declaration//GEN-END:variables
}
