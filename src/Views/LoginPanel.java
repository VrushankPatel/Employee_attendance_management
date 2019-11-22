package Views;

import Utilities.DBAccessUtilities;
import Utilities.DBOperationUtilities;
import Utilities.SessionUtilities;
import Utilities.UIComponentUtilities;
import javax.swing.*;

public class LoginPanel extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();
    private DBOperationUtilities dboperation;
    private DBAccessUtilities dbaccesstocken;
    public LoginPanel() {                   
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
        userName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        userNamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        administratorLoginlbl = new javax.swing.JLabel();
        LoginButtonPanel = new javax.swing.JPanel();
        LoginButtenLabel = new javax.swing.JLabel();
        SignupButtonPanel = new javax.swing.JPanel();
        SignupButtenLabel = new javax.swing.JLabel();
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

        passwordField.setBackground(utilities.colorutil.bodypanelcolor);
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordField.setForeground(utilities.colorutil.primarytextcolor);
        passwordField.setText("Password");
        passwordField.setToolTipText("Password");
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        passwordField.setCaretColor(utilities.colorutil.initialColor);
        passwordField.setPreferredSize(new java.awt.Dimension(55, 19));
        passwordField.setCaretColor(utilities.colorutil.initialColor);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
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

        passwordlbl.setBackground(utilities.colorutil.bodypanelcolor);
        passwordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordlbl.setForeground(utilities.colorutil.primarytextcolor);
        passwordlbl.setText("Password");

        administratorLoginlbl.setBackground(utilities.colorutil.bodypanelcolor);
        administratorLoginlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        administratorLoginlbl.setForeground(utilities.colorutil.primarytextcolor);
        administratorLoginlbl.setText("Administrator Login");

        LoginButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        LoginButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        LoginButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        LoginButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        LoginButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        LoginButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LoginButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
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

        SignupButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        SignupButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        SignupButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        SignupButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actionSignUp(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        SignupButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        SignupButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SignupButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        SignupButtenLabel.setText("Signup");
        SignupButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout SignupButtonPanelLayout = new javax.swing.GroupLayout(SignupButtonPanel);
        SignupButtonPanel.setLayout(SignupButtonPanelLayout);
        SignupButtonPanelLayout.setHorizontalGroup(
            SignupButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupButtonPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(SignupButtenLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SignupButtonPanelLayout.setVerticalGroup(
            SignupButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignupButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

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
                        .addComponent(administratorLoginlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordlbl)
                            .addComponent(userNamelbl)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SignupButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignupButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
        utilities.actionClose(evt);
    }//GEN-LAST:event_actionClose

    private void FocusTextFields(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FocusTextFields
        utilities.onFocusTextFields((JTextField)(evt.getSource()));
    }//GEN-LAST:event_FocusTextFields

    private void commonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commonHoverButtons
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_commonHoverButtons

    private void actionSignUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionSignUp
        utilities.switchFromTo(this,new SignupPanel());
    }//GEN-LAST:event_actionSignUp

    private void LoginButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonPanelMouseClicked
        String result;
        try{
            result = dbaccesstocken.con.isClosed() ? "Database communication link failure" : dboperation.getAdmin(userName.getText(),String.valueOf(passwordField.getPassword()));
            if("success".equals(result)){                
                JOptionPane.showMessageDialog(this.getParent(),"Login successful.", "Success",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_In_Progress_48px.png")));                                
                utilities.switchFromTo(this, new AdminOptions());
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
        }catch(Exception e){
        }
    }//GEN-LAST:event_LoginButtonPanelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginButtenLabel;
    private javax.swing.JPanel LoginButtonPanel;
    private javax.swing.JLabel SignupButtenLabel;
    private javax.swing.JPanel SignupButtonPanel;
    private javax.swing.JLabel administratorLoginlbl;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNamelbl;
    // End of variables declaration//GEN-END:variables
}
