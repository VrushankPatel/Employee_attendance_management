package Views;

import Utilities.*;
import java.awt.*;
import javax.swing.*;

public class AddNewEmployee extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities;        
    private final ValidationUtilities validation;
    public AddNewEmployee() { 
        utilities = new UIComponentUtilities();
        validation = new ValidationUtilities();        
        initComponents();
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
        userName1 = new javax.swing.JTextField();
        userNamelbl1 = new javax.swing.JLabel();
        userName2 = new javax.swing.JTextField();
        userNamelbl2 = new javax.swing.JLabel();
        userName3 = new javax.swing.JTextField();
        userNamelbl3 = new javax.swing.JLabel();
        userName4 = new javax.swing.JTextField();
        userNamelbl4 = new javax.swing.JLabel();

        setBackground(utilities.colorutil.bodypanelcolor);
        setForeground(utilities.colorutil.primarytextcolor);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(527, 509));

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
                actionSignu(evt);
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

        userName1.setBackground(utilities.colorutil.bodypanelcolor);
        userName1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userName1.setForeground(utilities.colorutil.primarytextcolor);
        userName1.setText("Employee Name");
        userName1.setToolTipText("Employee Name");
        userName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        userName1.setCaretColor(utilities.colorutil.initialColor);
        userName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        userNamelbl1.setBackground(utilities.colorutil.bodypanelcolor);
        userNamelbl1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userNamelbl1.setForeground(utilities.colorutil.primarytextcolor);
        userNamelbl1.setText("Employee Name");

        userName2.setBackground(utilities.colorutil.bodypanelcolor);
        userName2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userName2.setForeground(utilities.colorutil.primarytextcolor);
        userName2.setText("Employee Id");
        userName2.setToolTipText("Employee Id");
        userName2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        userName2.setCaretColor(utilities.colorutil.initialColor);
        userName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        userNamelbl2.setBackground(utilities.colorutil.bodypanelcolor);
        userNamelbl2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userNamelbl2.setForeground(utilities.colorutil.primarytextcolor);
        userNamelbl2.setText("Employee Id");

        userName3.setBackground(utilities.colorutil.bodypanelcolor);
        userName3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userName3.setForeground(utilities.colorutil.primarytextcolor);
        userName3.setText("Address");
        userName3.setToolTipText("Address");
        userName3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        userName3.setCaretColor(utilities.colorutil.initialColor);
        userName3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        userNamelbl3.setBackground(utilities.colorutil.bodypanelcolor);
        userNamelbl3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userNamelbl3.setForeground(utilities.colorutil.primarytextcolor);
        userNamelbl3.setText("Address");

        userName4.setBackground(utilities.colorutil.bodypanelcolor);
        userName4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userName4.setForeground(utilities.colorutil.primarytextcolor);
        userName4.setText("Phone no.");
        userName4.setToolTipText("Phone no.");
        userName4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
        userName4.setCaretColor(utilities.colorutil.initialColor);
        userName4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusTextFields(evt);
            }
        });

        userNamelbl4.setBackground(utilities.colorutil.bodypanelcolor);
        userNamelbl4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userNamelbl4.setForeground(utilities.colorutil.primarytextcolor);
        userNamelbl4.setText("Phone no.");

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
                                    .addComponent(userNamelbl1)
                                    .addComponent(userName1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNamelbl2)
                                    .addComponent(userName2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNamelbl3)
                                    .addComponent(userName3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNamelbl4)
                                    .addComponent(userName4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(userNamelbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNamelbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNamelbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNamelbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void commonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commonHoverButtons
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_commonHoverButtons

    private void getBack(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBack
        utilities.switchFromTo(this, new LoginPanel());
    }//GEN-LAST:event_getBack

    private void hoverButtonicLabels(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverButtonicLabels
        utilities.hoverGeneralButtonicPanels((JPanel)(((JLabel)(evt.getSource())).getParent()));
    }//GEN-LAST:event_hoverButtonicLabels

    private void actionSignu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionSignu
        
    }//GEN-LAST:event_actionSignu

    private void focusTextFields(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusTextFields
        utilities.onFocusTextFields((JTextField)(evt.getSource()));
    }//GEN-LAST:event_focusTextFields

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButtenLabel;
    private javax.swing.JPanel BackButtonPanel;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel eddNewEmployeeLabel;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JLabel nextButtenLabel;
    private javax.swing.JPanel nextButtonPanel;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userName1;
    private javax.swing.JTextField userName2;
    private javax.swing.JTextField userName3;
    private javax.swing.JTextField userName4;
    private javax.swing.JLabel userNamelbl1;
    private javax.swing.JLabel userNamelbl2;
    private javax.swing.JLabel userNamelbl3;
    private javax.swing.JLabel userNamelbl4;
    // End of variables declaration//GEN-END:variables
}
