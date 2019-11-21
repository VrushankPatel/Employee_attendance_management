package Views;

import Utilities.UIComponentUtilities;
import java.awt.Color;
import java.util.Date;
import javax.swing.*;
import java.awt.Component;

public class MarkAttendance extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();
    public MarkAttendance() {          
        initComponents();       
        dateOfAttendance.getComponent(0).setBackground(utilities.colorutil.bodypanelcolor);
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

        setBackground(utilities.colorutil.bodypanelcolor);
        setForeground(utilities.colorutil.primarytextcolor);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        panelHead.setBackground(utilities.colorutil.headpanelandhovercolor);
        panelHead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 62, 80)));
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

        EmployeeId.setBackground(utilities.colorutil.bodypanelcolor);
        EmployeeId.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        EmployeeId.setForeground(utilities.colorutil.primarytextcolor);
        EmployeeId.setText("Employee Id");
        EmployeeId.setToolTipText("Employee Id");
        EmployeeId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(192, 192, 192)));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(AteendanceMasterlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordlbl)
                            .addComponent(EmployeeIdlbl)
                            .addComponent(EmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(presentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(absentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateOfAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(EmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passwordlbl)
                .addGap(0, 0, 0)
                .addComponent(dateOfAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(absentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AteendanceMasterlbl;
    private javax.swing.JTextField EmployeeId;
    private javax.swing.JLabel EmployeeIdlbl;
    private javax.swing.JLabel absentButtenLabel;
    private javax.swing.JPanel absentButtonPanel;
    private javax.swing.JLabel close_lbl;
    private com.toedter.calendar.JDateChooser dateOfAttendance;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel presentButtenLabel;
    private javax.swing.JPanel presentButtonPanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
