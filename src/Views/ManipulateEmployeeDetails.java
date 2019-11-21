package Views;

import Utilities.UIColorUtilities;
import Utilities.UIComponentUtilities;
import javax.swing.*;

public class ManipulateEmployeeDetails extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();    
    public ManipulateEmployeeDetails() {           
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
        addemployeemasterpanel = new javax.swing.JPanel();
        iconlabel = new javax.swing.JLabel();
        addemployeelabel = new javax.swing.JLabel();
        removeemployeemasterpanel = new javax.swing.JPanel();
        removeemployeelabel = new javax.swing.JLabel();
        iconlabel2 = new javax.swing.JLabel();
        moddifyemployeedetailsmasterpanel = new javax.swing.JPanel();
        modifyemployeelabel = new javax.swing.JLabel();
        iconlabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(utilities.colorutil.bodypanelcolor);
        setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
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
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
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

        adminoptionsLoginlbl.setBackground(utilities.colorutil.bodypanelcolor);
        adminoptionsLoginlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminoptionsLoginlbl.setForeground(utilities.colorutil.primarytextcolor);
        adminoptionsLoginlbl.setText("Manipulate Employee Details");

        addemployeemasterpanel.setBackground(utilities.colorutil.bodypanelcolor);
        addemployeemasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        addemployeemasterpanel.setForeground(utilities.colorutil.primarytextcolor);
        addemployeemasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addemployeemasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
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

        iconlabel.setBackground(utilities.colorutil.bodypanelcolor);
        iconlabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel.setForeground(utilities.colorutil.primarytextcolor);
        iconlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/4621_13544_add_female_user.png"))); // NOI18N
        iconlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addemployeelabel.setBackground(utilities.colorutil.bodypanelcolor);
        addemployeelabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addemployeelabel.setForeground(utilities.colorutil.primarytextcolor);
        addemployeelabel.setText("<html><body><center>Add</center><center>Employee</center></body></html>");
        addemployeelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout addemployeemasterpanelLayout = new javax.swing.GroupLayout(addemployeemasterpanel);
        addemployeemasterpanel.setLayout(addemployeemasterpanelLayout);
        addemployeemasterpanelLayout.setHorizontalGroup(
            addemployeemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addemployeemasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addemployeemasterpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addemployeelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addemployeemasterpanelLayout.setVerticalGroup(
            addemployeemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addemployeemasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addemployeelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        removeemployeemasterpanel.setBackground(utilities.colorutil.bodypanelcolor);
        removeemployeemasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        removeemployeemasterpanel.setForeground(utilities.colorutil.primarytextcolor);
        removeemployeemasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeemployeemasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeEmployee(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        removeemployeelabel.setBackground(utilities.colorutil.bodypanelcolor);
        removeemployeelabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        removeemployeelabel.setForeground(utilities.colorutil.primarytextcolor);
        removeemployeelabel.setText("<html><body><center>Remove</center><center>Employee</center></body></html>");
        removeemployeelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iconlabel2.setBackground(utilities.colorutil.bodypanelcolor);
        iconlabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel2.setForeground(utilities.colorutil.primarytextcolor);
        iconlabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/4608_13453_female_remove_user.png"))); // NOI18N
        iconlabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout removeemployeemasterpanelLayout = new javax.swing.GroupLayout(removeemployeemasterpanel);
        removeemployeemasterpanel.setLayout(removeemployeemasterpanelLayout);
        removeemployeemasterpanelLayout.setHorizontalGroup(
            removeemployeemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeemployeemasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(removeemployeemasterpanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(removeemployeelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        removeemployeemasterpanelLayout.setVerticalGroup(
            removeemployeemasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeemployeemasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeemployeelabel)
                .addGap(5, 5, 5))
        );

        moddifyemployeedetailsmasterpanel.setBackground(utilities.colorutil.bodypanelcolor);
        moddifyemployeedetailsmasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        moddifyemployeedetailsmasterpanel.setForeground(utilities.colorutil.primarytextcolor);
        moddifyemployeedetailsmasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moddifyemployeedetailsmasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyEmployee(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        modifyemployeelabel.setBackground(utilities.colorutil.bodypanelcolor);
        modifyemployeelabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        modifyemployeelabel.setForeground(utilities.colorutil.primarytextcolor);
        modifyemployeelabel.setText("<html><body><center>Modify</center><center>Employee Data</center></body></html>");
        modifyemployeelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iconlabel3.setBackground(utilities.colorutil.bodypanelcolor);
        iconlabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel3.setForeground(utilities.colorutil.primarytextcolor);
        iconlabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CUSTOM_ICON_69e24ca2-7388-4e3c-8649-50e0aaa6aaa8 - Copy.png"))); // NOI18N
        iconlabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout moddifyemployeedetailsmasterpanelLayout = new javax.swing.GroupLayout(moddifyemployeedetailsmasterpanel);
        moddifyemployeedetailsmasterpanel.setLayout(moddifyemployeedetailsmasterpanelLayout);
        moddifyemployeedetailsmasterpanelLayout.setHorizontalGroup(
            moddifyemployeedetailsmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconlabel3)
            .addGroup(moddifyemployeedetailsmasterpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifyemployeelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        moddifyemployeedetailsmasterpanelLayout.setVerticalGroup(
            moddifyemployeedetailsmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moddifyemployeedetailsmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyemployeelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(utilities.colorutil.primarytextcolor);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-left_4_1.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBack(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backHover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backHover(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(adminoptionsLoginlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addemployeemasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(removeemployeemasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(moddifyemployeedetailsmasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminoptionsLoginlbl)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addemployeemasterpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moddifyemployeedetailsmasterpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeemployeemasterpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
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

    private void backHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHover
        utilities.backHover(evt);
    }//GEN-LAST:event_backHover

    private void getBack(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBack
        utilities.switchFromTo(this, new AdminOptions());
    }//GEN-LAST:event_getBack

    private void addEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployee
        utilities.switchFromTo(this, new AddNewEmployee());
    }//GEN-LAST:event_addEmployee

    private void removeEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeEmployee
        utilities.switchFromTo(this, new DeleteEmployee());
    }//GEN-LAST:event_removeEmployee

    private void modifyEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyEmployee
       
    }//GEN-LAST:event_modifyEmployee
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addemployeelabel;
    private javax.swing.JPanel addemployeemasterpanel;
    private javax.swing.JLabel adminoptionsLoginlbl;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel iconlabel;
    private javax.swing.JLabel iconlabel2;
    private javax.swing.JLabel iconlabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel moddifyemployeedetailsmasterpanel;
    private javax.swing.JLabel modifyemployeelabel;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel removeemployeelabel;
    private javax.swing.JPanel removeemployeemasterpanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
