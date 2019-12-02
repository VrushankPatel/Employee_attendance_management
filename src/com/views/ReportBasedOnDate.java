package com.views;

import com.pojo.ReportBasedOnDatePojo;
import com.utilities.Constants;
import com.utilities.DBAccessUtilities;
import com.utilities.DBOperationUtilities;
import com.utilities.UIComponentUtilities;
import com.utilities.ValidationUtilities;
import java.util.Date;
import javax.swing.*;
import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;

public class ReportBasedOnDate extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();    
    private final ValidationUtilities valid = new ValidationUtilities();
    private final ReportBasedOnDatePojo POJO = new ReportBasedOnDatePojo();
    private DBOperationUtilities dboperation;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public ReportBasedOnDate() {          
        initComponents(); 
        initConnection();
        FromDate.getComponent(0).setBackground(utilities.colorutil.bodypanelcolor);
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
        FromDateLabel = new javax.swing.JLabel();
        ReportBasedOnDatelbl = new javax.swing.JLabel();
        FromDate = new com.toedter.calendar.JDateChooser();
        ToDateLabel = new javax.swing.JLabel();
        ToDate = new com.toedter.calendar.JDateChooser();
        GenerateButtonPanel = new javax.swing.JPanel();
        GenerateButtenLabel = new javax.swing.JLabel();
        BackButtonPanel = new javax.swing.JPanel();
        BackButtenLabel = new javax.swing.JLabel();
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

        EmployeeId.setBackground(utilities.colorutil.bodypanelcolor);
        EmployeeId.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        EmployeeId.setForeground(utilities.colorutil.primarytextcolor);
        EmployeeId.setText("Employee Id");
        EmployeeId.setToolTipText("Employee Id");
        EmployeeId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, utilities.colorutil.initialBorder));
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

        FromDateLabel.setBackground(utilities.colorutil.bodypanelcolor);
        FromDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        FromDateLabel.setForeground(utilities.colorutil.primarytextcolor);
        FromDateLabel.setText("From");

        ReportBasedOnDatelbl.setBackground(utilities.colorutil.bodypanelcolor);
        ReportBasedOnDatelbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ReportBasedOnDatelbl.setForeground(utilities.colorutil.primarytextcolor);
        ReportBasedOnDatelbl.setText("Customized Report");

        FromDate.setBackground(utilities.colorutil.bodypanelcolor);
        FromDate.setForeground(utilities.colorutil.primarytextcolor);
        FromDate.setDate(new Date());
        FromDate.setMaxSelectableDate(new Date());
        FromDate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        FromDate.setPreferredSize(new java.awt.Dimension(108, 28));
        for(Component c : FromDate.getComponents()){
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

        ToDateLabel.setBackground(utilities.colorutil.bodypanelcolor);
        ToDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ToDateLabel.setForeground(utilities.colorutil.primarytextcolor);
        ToDateLabel.setText("To");

        ToDate.setBackground(utilities.colorutil.bodypanelcolor);
        ToDate.setForeground(utilities.colorutil.primarytextcolor);
        ToDate.setDate(new Date());
        ToDate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ToDate.setPreferredSize(new java.awt.Dimension(108, 28));
        for(Component c : ToDate.getComponents()){
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

        GenerateButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        GenerateButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        GenerateButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        GenerateButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GenerateButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateReport(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GenerateButtonPanelcommonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GenerateButtonPanelcommonHoverButtons1(evt);
            }
        });

        GenerateButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        GenerateButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        GenerateButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        GenerateButtenLabel.setText("Generate");
        GenerateButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout GenerateButtonPanelLayout = new javax.swing.GroupLayout(GenerateButtonPanel);
        GenerateButtonPanel.setLayout(GenerateButtonPanelLayout);
        GenerateButtonPanelLayout.setHorizontalGroup(
            GenerateButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerateButtonPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(GenerateButtenLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GenerateButtonPanelLayout.setVerticalGroup(
            GenerateButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GenerateButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        BackButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        BackButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        BackButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        BackButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonPanelcommonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonPanelcommonHoverButtons1(evt);
            }
        });

        BackButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        BackButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BackButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        BackButtenLabel.setText(" < Back");
        BackButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackButtonPanelLayout = new javax.swing.GroupLayout(BackButtonPanel);
        BackButtonPanel.setLayout(BackButtonPanelLayout);
        BackButtonPanelLayout.setHorizontalGroup(
            BackButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButtenLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        BackButtonPanelLayout.setVerticalGroup(
            BackButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

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
                        .addComponent(ReportBasedOnDatelbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmployeeIdlbl)
                            .addComponent(EmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FromDateLabel)
                                    .addComponent(FromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ToDateLabel)
                                    .addComponent(ToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GenerateButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(status)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReportBasedOnDatelbl)
                .addGap(18, 18, 18)
                .addComponent(EmployeeIdlbl)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(FromDateLabel)
                        .addGap(0, 0, 0)
                        .addComponent(FromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ToDateLabel)
                        .addGap(0, 0, 0)
                        .addComponent(ToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenerateButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initConnection(){
        new Thread(){
            public void run(){
                try{
                    dboperation = new DBOperationUtilities();
                    status.setText("Status : "+(DBAccessUtilities.con.isClosed() ? "Not Connected" : "Connected"));
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

    private void GenerateButtonPanelcommonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateButtonPanelcommonHoverButtons
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_GenerateButtonPanelcommonHoverButtons

    private void GenerateButtonPanelcommonHoverButtons1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateButtonPanelcommonHoverButtons1
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_GenerateButtonPanelcommonHoverButtons1

    private void BackButtonPanelcommonHoverButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonPanelcommonHoverButtons
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_BackButtonPanelcommonHoverButtons

    private void BackButtonPanelcommonHoverButtons1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonPanelcommonHoverButtons1
        utilities.hoverGeneralButtonicPanels((JPanel)(evt.getSource()));
    }//GEN-LAST:event_BackButtonPanelcommonHoverButtons1

    private void BackButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonPanelMouseClicked
        utilities.switchFromTo(this, new GenerateReport());
    }//GEN-LAST:event_BackButtonPanelMouseClicked

    private void generateReport(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateReport
        try{
            POJO.setEmployeeId(EmployeeId.getText());
            if(valid.validateEmployeeId(EmployeeId.getText())){
                String result = dboperation.isEmployeeExists(EmployeeId.getText());
                if(Constants.SUCCESS.equals(result)){
                    POJO.setFromDate(FromDate.getDate());
                    POJO.setToDate(ToDate.getDate());
                    POJO.setTotalWorkingDays((int) valid.getWorkingDays(POJO.getFromDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), POJO.getToDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));                    
                    POJO.setPresentDays(dboperation.getPresentDays(EmployeeId.getText(),sdf.format(POJO.getFromDate()),sdf.format(POJO.getToDate())));                   
                    POJO.setTotalDays((int) valid.getTotalDays(POJO.getFromDate(),POJO.getToDate()));                                                            
                    
                    ResultSet rs = dboperation.getReportFromToDate(EmployeeId.getText(),sdf.format(POJO.getFromDate()),sdf.format(POJO.getToDate()));
                    String datefromto = new SimpleDateFormat("dd MMM yyyy").format(POJO.getFromDate()) + " to " +new SimpleDateFormat("dd MMM yyyy").format(POJO.getToDate());
                    utilities.switchFromTo(this,new ReportWindow(EmployeeId.getText(),datefromto,POJO.getTotalWorkingDays(),POJO.getPresentDays(),POJO.getTotalDays(),rs));              
                }else{
                    initConnection();                    
                    JOptionPane.showMessageDialog(this.getParent(),result, "Error",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
                }
            }
        }catch(HeadlessException | SQLException e){
        }catch(Exception e){
        }        
    }//GEN-LAST:event_generateReport

    private void minimize_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblMouseClicked
        utilities.actionMinimize((JFrame) SwingUtilities.getWindowAncestor(this));
    }//GEN-LAST:event_minimize_lblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButtenLabel;
    private javax.swing.JPanel BackButtonPanel;
    private javax.swing.JTextField EmployeeId;
    private javax.swing.JLabel EmployeeIdlbl;
    private com.toedter.calendar.JDateChooser FromDate;
    private javax.swing.JLabel FromDateLabel;
    private javax.swing.JLabel GenerateButtenLabel;
    private javax.swing.JPanel GenerateButtonPanel;
    private javax.swing.JLabel ReportBasedOnDatelbl;
    private com.toedter.calendar.JDateChooser ToDate;
    private javax.swing.JLabel ToDateLabel;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
