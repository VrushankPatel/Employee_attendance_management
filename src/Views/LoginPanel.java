package Views;

import Utilities.UIComponentEventUtilities;
import java.awt.*;
import javax.swing.*;

public class LoginPanel extends javax.swing.JPanel {    
    UIComponentEventUtilities utilities = new UIComponentEventUtilities();
    public LoginPanel() {           
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        userNamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        administratorLoginlbl = new javax.swing.JLabel();
        LoginButtonPanel = new javax.swing.JPanel();
        LoginButtenLabel = new javax.swing.JLabel();
        SignupButtonPanel = new javax.swing.JPanel();
        SignupButtenLabel = new javax.swing.JLabel();

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
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(44, 62, 80));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(162, 160, 162));
        jPasswordField1.setText("Password");
        jPasswordField1.setToolTipText("Password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(192, 192, 192)));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(55, 19));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusTextFields(evt);
            }
        });

        userNamelbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userNamelbl.setForeground(new java.awt.Color(255, 255, 255));
        userNamelbl.setText("UserName");

        passwordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordlbl.setText("Password");

        administratorLoginlbl.setBackground(new java.awt.Color(44, 62, 80));
        administratorLoginlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        administratorLoginlbl.setForeground(new java.awt.Color(254, 254, 254));
        administratorLoginlbl.setText("Administrator Login");

        LoginButtonPanel.setBackground(new java.awt.Color(44, 62, 80));
        LoginButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LoginButtonPanel.setForeground(new java.awt.Color(255, 255, 255));
        LoginButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        LoginButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LoginButtenLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginButtenLabel.setText("Login");
        LoginButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout LoginButtonPanelLayout = new javax.swing.GroupLayout(LoginButtonPanel);
        LoginButtonPanel.setLayout(LoginButtonPanelLayout);
        LoginButtonPanelLayout.setHorizontalGroup(
            LoginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginButtonPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LoginButtenLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        LoginButtonPanelLayout.setVerticalGroup(
            LoginButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SignupButtonPanel.setBackground(new java.awt.Color(44, 62, 80));
        SignupButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        SignupButtonPanel.setForeground(new java.awt.Color(255, 255, 255));
        SignupButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actionSignUp(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        SignupButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SignupButtenLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignupButtenLabel.setText("Signup");
        SignupButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout SignupButtonPanelLayout = new javax.swing.GroupLayout(SignupButtonPanel);
        SignupButtonPanel.setLayout(SignupButtonPanelLayout);
        SignupButtonPanelLayout.setHorizontalGroup(
            SignupButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupButtonPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(SignupButtenLabel)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        SignupButtonPanelLayout.setVerticalGroup(
            SignupButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignupButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(administratorLoginlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordlbl)
                            .addComponent(userNamelbl)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SignupButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(administratorLoginlbl)
                .addGap(18, 18, 18)
                .addComponent(userNamelbl)
                .addGap(0, 0, 0)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passwordlbl)
                .addGap(0, 0, 0)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignupButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void actionSignUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionSignUp
        System.out.println("Views.LoginPanel.FocusTextFields() 2222");
        utilities.switchFromTo(this,new SignupPanel());
    }//GEN-LAST:event_actionSignUp

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginButtenLabel;
    private javax.swing.JPanel LoginButtonPanel;
    private javax.swing.JLabel SignupButtenLabel;
    private javax.swing.JPanel SignupButtonPanel;
    private javax.swing.JLabel administratorLoginlbl;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNamelbl;
    // End of variables declaration//GEN-END:variables
}
