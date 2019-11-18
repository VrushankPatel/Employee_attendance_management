package Views;

import Utilities.UIComponentUtilities;
import javax.swing.*;

public class AdminOptions extends javax.swing.JPanel {    
    UIComponentUtilities utilities = new UIComponentUtilities();
    public AdminOptions() {           
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        adminoptionsLoginlbl = new javax.swing.JLabel();
        manipulateemployeemasterpanel = new javax.swing.JPanel();
        iconlabel = new javax.swing.JLabel();
        marklabel1 = new javax.swing.JLabel();
        markattendancemasterpanel = new javax.swing.JPanel();
        marklabel = new javax.swing.JLabel();
        iconlabel2 = new javax.swing.JLabel();
        reportmasterpanel = new javax.swing.JPanel();
        generatelabel = new javax.swing.JLabel();
        iconlabel3 = new javax.swing.JLabel();

        setBackground(utilities.bodypanelcolor);
        setForeground(utilities.primarytextcolor);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        panelHead.setBackground(utilities.headpanelcolor);
        panelHead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 62, 80)));
        panelHead.setForeground(utilities.primarytextcolor);

        title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        title.setForeground(utilities.primarytextcolor);
        title.setText("Employee Attendance Management System");

        minimize_lbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minimize_lbl.setForeground(utilities.primarytextcolor);
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
        close_lbl.setForeground(utilities.primarytextcolor);
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
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
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

        adminoptionsLoginlbl.setBackground(new java.awt.Color(44, 62, 80));
        adminoptionsLoginlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminoptionsLoginlbl.setForeground(utilities.primarytextcolor);
        adminoptionsLoginlbl.setText("Admin Options");

        manipulateemployeemasterpanel.setBackground(utilities.bodypanelcolor);
        manipulateemployeemasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        manipulateemployeemasterpanel.setForeground(utilities.primarytextcolor);
        manipulateemployeemasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manipulateemployeemasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
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

        iconlabel.setBackground(utilities.bodypanelcolor);
        iconlabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel.setForeground(utilities.primarytextcolor);
        iconlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/manipulation.jpg"))); // NOI18N
        iconlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        marklabel1.setBackground(utilities.bodypanelcolor);
        marklabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        marklabel1.setForeground(utilities.primarytextcolor);
        marklabel1.setText("<html><body><center>Manipulate</center><center>Employee Data</center></body></html>");
        marklabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout manipulateemployeemasterpanelLayout = new javax.swing.GroupLayout(manipulateemployeemasterpanel);
        manipulateemployeemasterpanel.setLayout(manipulateemployeemasterpanelLayout);
        manipulateemployeemasterpanelLayout.setHorizontalGroup(
            manipulateemployeemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manipulateemployeemasterpanelLayout.createSequentialGroup()
                .addGroup(manipulateemployeemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(manipulateemployeemasterpanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(marklabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        manipulateemployeemasterpanelLayout.setVerticalGroup(
            manipulateemployeemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manipulateemployeemasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marklabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        markattendancemasterpanel.setBackground(utilities.bodypanelcolor);
        markattendancemasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        markattendancemasterpanel.setForeground(utilities.primarytextcolor);
        markattendancemasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        markattendancemasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        marklabel.setBackground(utilities.bodypanelcolor);
        marklabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        marklabel.setForeground(utilities.primarytextcolor);
        marklabel.setText("<html><body><center>Mark</center><center>Attendance</center></body></html>");
        marklabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iconlabel2.setBackground(utilities.bodypanelcolor);
        iconlabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel2.setForeground(utilities.primarytextcolor);
        iconlabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CUSTOM_ICON_96e189ba-8c77-496c-b3fd-c37d23f55978.png"))); // NOI18N
        iconlabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout markattendancemasterpanelLayout = new javax.swing.GroupLayout(markattendancemasterpanel);
        markattendancemasterpanel.setLayout(markattendancemasterpanelLayout);
        markattendancemasterpanelLayout.setHorizontalGroup(
            markattendancemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(markattendancemasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, markattendancemasterpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(marklabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        markattendancemasterpanelLayout.setVerticalGroup(
            markattendancemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, markattendancemasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marklabel)
                .addGap(5, 5, 5))
        );

        reportmasterpanel.setBackground(utilities.bodypanelcolor);
        reportmasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        reportmasterpanel.setForeground(utilities.primarytextcolor);
        reportmasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportmasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportmasterpanelactionSignUp(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        generatelabel.setBackground(utilities.bodypanelcolor);
        generatelabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        generatelabel.setForeground(utilities.primarytextcolor);
        generatelabel.setText("<html><body><center>Generate</center><center>Report</center></body></html>");
        generatelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iconlabel3.setBackground(utilities.bodypanelcolor);
        iconlabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel3.setForeground(utilities.primarytextcolor);
        iconlabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CUSTOM_ICON_69e24ca2-7388-4e3c-8649-50e0aaa6aaa8.png"))); // NOI18N
        iconlabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout reportmasterpanelLayout = new javax.swing.GroupLayout(reportmasterpanel);
        reportmasterpanel.setLayout(reportmasterpanelLayout);
        reportmasterpanelLayout.setHorizontalGroup(
            reportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportmasterpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generatelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        reportmasterpanelLayout.setVerticalGroup(
            reportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generatelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manipulateemployeemasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(markattendancemasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(reportmasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adminoptionsLoginlbl)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminoptionsLoginlbl)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manipulateemployeemasterpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(reportmasterpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(markattendancemasterpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseHoverminimmizeClose
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_mouseHoverminimmizeClose

    private void actionClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionClose
        utilities.actionClose(evt);
    }//GEN-LAST:event_actionClose

    private void commonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commonHoverButtons
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_commonHoverButtons

    private void actionSignUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionSignUp
        System.out.println("Views.LoginPanel.FocusTextFields() 2222");
        utilities.switchFromTo(this,new SignupPanel());
    }//GEN-LAST:event_actionSignUp

    private void reportmasterpanelactionSignUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportmasterpanelactionSignUp
        // TODO add your handling code here:
    }//GEN-LAST:event_reportmasterpanelactionSignUp
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminoptionsLoginlbl;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel generatelabel;
    private javax.swing.JLabel iconlabel;
    private javax.swing.JLabel iconlabel2;
    private javax.swing.JLabel iconlabel3;
    private javax.swing.JLabel loginButtenLabel;
    private javax.swing.JPanel loginButtonPanel;
    private javax.swing.JPanel manipulateemployeemasterpanel;
    private javax.swing.JPanel markattendancemasterpanel;
    private javax.swing.JLabel marklabel;
    private javax.swing.JLabel marklabel1;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JPanel reportmasterpanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
