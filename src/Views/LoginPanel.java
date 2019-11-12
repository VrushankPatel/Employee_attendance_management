package Views;

import Utilities.UIComponentEventUtilities;
import java.awt.*;

public class LoginPanel extends javax.swing.JPanel {    
    UIComponentEventUtilities utilities = new UIComponentEventUtilities();
    public LoginPanel() {           
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelHead = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Minimize_lbl = new javax.swing.JLabel();
        Close_lbl = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        UserNamelbl = new javax.swing.JLabel();
        Passwordlbl = new javax.swing.JLabel();
        AdministratorLoginlbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 62, 80));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        PanelHead.setBackground(new java.awt.Color(248, 148, 6));
        PanelHead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 62, 80)));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Employee Attendance Management System");

        Minimize_lbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Minimize_lbl.setForeground(Color.WHITE);
        Minimize_lbl.setText("-");
        Minimize_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseHoverminimmizeClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseHoverminimmizeClose(evt);
            }
        });

        Close_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Close_lbl.setForeground(Color.WHITE);
        Close_lbl.setText("X");
        Close_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actionClose(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseHoverminimmizeClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseHoverminimmizeClose(evt);
            }
        });

        javax.swing.GroupLayout PanelHeadLayout = new javax.swing.GroupLayout(PanelHead);
        PanelHead.setLayout(PanelHeadLayout);
        PanelHeadLayout.setHorizontalGroup(
            PanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimize_lbl)
                .addGap(18, 18, 18)
                .addComponent(Close_lbl)
                .addContainerGap())
        );
        PanelHeadLayout.setVerticalGroup(
            PanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHeadLayout.createSequentialGroup()
                .addGroup(PanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Minimize_lbl))
                .addGap(70, 70, 70))
            .addGroup(PanelHeadLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserName.setBackground(new java.awt.Color(44, 62, 80));
        UserName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserName.setForeground(new java.awt.Color(162, 160, 162));
        UserName.setText("UserName");
        UserName.setToolTipText("UserName");
        UserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(192, 192, 192)));
        UserName.addFocusListener(new java.awt.event.FocusAdapter() {
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

        UserNamelbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        UserNamelbl.setForeground(new java.awt.Color(255, 255, 255));
        UserNamelbl.setText("UserName");

        Passwordlbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        Passwordlbl.setText("Password");

        AdministratorLoginlbl.setBackground(new java.awt.Color(44, 62, 80));
        AdministratorLoginlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AdministratorLoginlbl.setForeground(new java.awt.Color(254, 254, 254));
        AdministratorLoginlbl.setText("Administrator Login");

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(AdministratorLoginlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Passwordlbl)
                            .addComponent(UserNamelbl)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdministratorLoginlbl)
                .addGap(18, 18, 18)
                .addComponent(UserNamelbl)
                .addGap(0, 0, 0)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Passwordlbl)
                .addGap(0, 0, 0)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseHoverminimmizeClose
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_MouseHoverminimmizeClose

    private void actionClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionClose
        utilities.actionClose(evt);
    }//GEN-LAST:event_actionClose

    private void FocusTextFields(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FocusTextFields
        utilities.onFocusTextFields(evt);
    }//GEN-LAST:event_FocusTextFields

    private void commonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commonHoverButtons
        utilities.hoverGeneralButtons(evt);
    }//GEN-LAST:event_commonHoverButtons

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministratorLoginlbl;
    private javax.swing.JLabel Close_lbl;
    private javax.swing.JLabel Minimize_lbl;
    private javax.swing.JPanel PanelHead;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel UserNamelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
