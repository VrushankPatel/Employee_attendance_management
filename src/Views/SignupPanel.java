package Views;

import Utilities.UIComponentEventUtilities;
import java.awt.*;
import javax.swing.*;
//Signuppanel

public class SignupPanel extends javax.swing.JPanel {    
    UIComponentEventUtilities utilities = new UIComponentEventUtilities();
    public SignupPanel() {           
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        CompanyIdTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        CompanyIdLabel = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        createAnAccountLabel = new javax.swing.JLabel();
        loginButtonPanel = new javax.swing.JPanel();
        loginButtenLabel = new javax.swing.JLabel();
        nextButtonPanel = new javax.swing.JPanel();
        nextButtenLabel = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        userNamelbl = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        confirmPasswordlbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 62, 80));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        panelHead.setBackground(new java.awt.Color(248, 148, 6));
        panelHead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 62, 80)));

        title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Employee Attendance Management System");

        minimize_lbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minimize_lbl.setForeground(Color.WHITE);
        minimize_lbl.setText("-");
        minimize_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseHoverminimmizeClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseHoverminimmizeClose(evt);
            }
        });

        close_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close_lbl.setForeground(Color.WHITE);
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

        CompanyIdTextField.setEditable(false);
        CompanyIdTextField.setBackground(new java.awt.Color(44, 62, 80));
        CompanyIdTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        CompanyIdTextField.setForeground(new java.awt.Color(162, 160, 162));
        CompanyIdTextField.setText("Company_Id");
        CompanyIdTextField.setToolTipText("Company_Id");
        CompanyIdTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(192, 192, 192)));
        CompanyIdTextField.setDisabledTextColor(new java.awt.Color(162, 160, 162));
        CompanyIdTextField.setEnabled(false);
        CompanyIdTextField.setFocusable(false);
        CompanyIdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(44, 62, 80));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordField.setForeground(new java.awt.Color(162, 160, 162));
        passwordField.setText("Password");
        passwordField.setToolTipText("Password");
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(192, 192, 192)));
        passwordField.setPreferredSize(new java.awt.Dimension(55, 19));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        CompanyIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CompanyIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        CompanyIdLabel.setText("Company_id");

        passwordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordlbl.setText("Password");

        createAnAccountLabel.setBackground(new java.awt.Color(44, 62, 80));
        createAnAccountLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createAnAccountLabel.setForeground(new java.awt.Color(254, 254, 254));
        createAnAccountLabel.setText("Create an account");

        loginButtonPanel.setBackground(new java.awt.Color(44, 62, 80));
        loginButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loginButtonPanel.setForeground(new java.awt.Color(255, 255, 255));
        loginButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtonPanel.setFocusCycleRoot(true);
        loginButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBack(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        loginButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginButtenLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginButtenLabel.setText("< Back");
        loginButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBack(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverButtonicLabels(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverButtonicLabels(evt);
            }
        });

        javax.swing.GroupLayout loginButtonPanelLayout = new javax.swing.GroupLayout(loginButtonPanel);
        loginButtonPanel.setLayout(loginButtonPanelLayout);
        loginButtonPanelLayout.setHorizontalGroup(
            loginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButtenLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        loginButtonPanelLayout.setVerticalGroup(
            loginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        nextButtonPanel.setBackground(new java.awt.Color(44, 62, 80));
        nextButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nextButtonPanel.setForeground(new java.awt.Color(255, 255, 255));
        nextButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actionSignup(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        nextButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nextButtenLabel.setForeground(new java.awt.Color(255, 255, 255));
        nextButtenLabel.setText("Next >");
        nextButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButtenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actionSignup(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverButtonicLabels(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
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
                .addComponent(nextButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        userName.setBackground(new java.awt.Color(44, 62, 80));
        userName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userName.setForeground(new java.awt.Color(162, 160, 162));
        userName.setText("UserName");
        userName.setToolTipText("UserName");
        userName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(192, 192, 192)));
        userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        userNamelbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userNamelbl.setForeground(new java.awt.Color(255, 255, 255));
        userNamelbl.setText("UserName");

        confirmPasswordField.setBackground(new java.awt.Color(44, 62, 80));
        confirmPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(162, 160, 162));
        confirmPasswordField.setText("Confirm Password");
        confirmPasswordField.setToolTipText("Confirm Password");
        confirmPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(192, 192, 192)));
        confirmPasswordField.setPreferredSize(new java.awt.Dimension(55, 19));
        confirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        confirmPasswordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        confirmPasswordlbl.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordlbl.setText("Confirm Password");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(loginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(CompanyIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CompanyIdLabel)
                                        .addGap(106, 106, 106)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNamelbl)
                                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordlbl)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(confirmPasswordlbl)
                                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAnAccountLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CompanyIdLabel)
                    .addComponent(userNamelbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseHoverminimmizeClose
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_mouseHoverminimmizeClose

    private void actionClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionClose
        utilities.actionClose(evt);
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
        System.out.println(String.valueOf(passwordField.getPassword()).equals(String.valueOf(confirmPasswordField.getPassword())));
    }//GEN-LAST:event_actionSignup

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompanyIdLabel;
    private javax.swing.JTextField CompanyIdTextField;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordlbl;
    private javax.swing.JLabel createAnAccountLabel;
    private javax.swing.JLabel loginButtenLabel;
    private javax.swing.JPanel loginButtonPanel;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JLabel nextButtenLabel;
    private javax.swing.JPanel nextButtonPanel;
    private javax.swing.JPanel panelHead;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNamelbl;
    // End of variables declaration//GEN-END:variables
}
