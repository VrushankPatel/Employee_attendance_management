package Views;

import Utilities.UIColorUtilities;
import Utilities.UIComponentUtilities;
import javax.swing.*;

public class GenerateReport extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();    
    public GenerateReport() {           
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        GenerateReportlbl = new javax.swing.JLabel();
        MonthlyReportmasterpanel = new javax.swing.JPanel();
        iconlabel = new javax.swing.JLabel();
        MonthlyReportlabel = new javax.swing.JLabel();
        DatedReportmasterpanel = new javax.swing.JPanel();
        DatedReportlabel = new javax.swing.JLabel();
        iconlabel2 = new javax.swing.JLabel();
        OverallReportmasterpanel = new javax.swing.JPanel();
        OverallReportlabel = new javax.swing.JLabel();
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

        GenerateReportlbl.setBackground(utilities.colorutil.bodypanelcolor);
        GenerateReportlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GenerateReportlbl.setForeground(utilities.colorutil.primarytextcolor);
        GenerateReportlbl.setText("Generate Report");

        MonthlyReportmasterpanel.setBackground(utilities.colorutil.bodypanelcolor);
        MonthlyReportmasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        MonthlyReportmasterpanel.setForeground(utilities.colorutil.primarytextcolor);
        MonthlyReportmasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MonthlyReportmasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthlyReport(evt);
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
        iconlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/3904_11793_calendar_month_selection.png"))); // NOI18N
        iconlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MonthlyReportlabel.setBackground(utilities.colorutil.bodypanelcolor);
        MonthlyReportlabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MonthlyReportlabel.setForeground(utilities.colorutil.primarytextcolor);
        MonthlyReportlabel.setText("<html><body><center>Monthly</center><center>Report</center></body></html>");
        MonthlyReportlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout MonthlyReportmasterpanelLayout = new javax.swing.GroupLayout(MonthlyReportmasterpanel);
        MonthlyReportmasterpanel.setLayout(MonthlyReportmasterpanelLayout);
        MonthlyReportmasterpanelLayout.setHorizontalGroup(
            MonthlyReportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonthlyReportmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MonthlyReportmasterpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MonthlyReportlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MonthlyReportmasterpanelLayout.setVerticalGroup(
            MonthlyReportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MonthlyReportmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MonthlyReportlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        DatedReportmasterpanel.setBackground(utilities.colorutil.bodypanelcolor);
        DatedReportmasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        DatedReportmasterpanel.setForeground(utilities.colorutil.primarytextcolor);
        DatedReportmasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DatedReportmasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datedReport(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        DatedReportlabel.setBackground(utilities.colorutil.bodypanelcolor);
        DatedReportlabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DatedReportlabel.setForeground(utilities.colorutil.primarytextcolor);
        DatedReportlabel.setText("<html><body><center>Report based</center><center>on dates</center></body></html>");
        DatedReportlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iconlabel2.setBackground(utilities.colorutil.bodypanelcolor);
        iconlabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel2.setForeground(utilities.colorutil.primarytextcolor);
        iconlabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/17979_38746_calendar_date_full.png"))); // NOI18N
        iconlabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout DatedReportmasterpanelLayout = new javax.swing.GroupLayout(DatedReportmasterpanel);
        DatedReportmasterpanel.setLayout(DatedReportmasterpanelLayout);
        DatedReportmasterpanelLayout.setHorizontalGroup(
            DatedReportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatedReportmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DatedReportmasterpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatedReportlabel)
                .addContainerGap())
        );
        DatedReportmasterpanelLayout.setVerticalGroup(
            DatedReportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatedReportmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatedReportlabel)
                .addGap(5, 5, 5))
        );

        OverallReportmasterpanel.setBackground(utilities.colorutil.bodypanelcolor);
        OverallReportmasterpanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        OverallReportmasterpanel.setForeground(utilities.colorutil.primarytextcolor);
        OverallReportmasterpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OverallReportmasterpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overallReport(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        OverallReportlabel.setBackground(utilities.colorutil.bodypanelcolor);
        OverallReportlabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OverallReportlabel.setForeground(utilities.colorutil.primarytextcolor);
        OverallReportlabel.setText("<html><body><center>Overall</center><center>Report</center></body></html>");
        OverallReportlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iconlabel3.setBackground(utilities.colorutil.bodypanelcolor);
        iconlabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        iconlabel3.setForeground(utilities.colorutil.primarytextcolor);
        iconlabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/23901_51690_analytics_report_analyze.png"))); // NOI18N
        iconlabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout OverallReportmasterpanelLayout = new javax.swing.GroupLayout(OverallReportmasterpanel);
        OverallReportmasterpanel.setLayout(OverallReportmasterpanelLayout);
        OverallReportmasterpanelLayout.setHorizontalGroup(
            OverallReportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconlabel3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverallReportmasterpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OverallReportlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        OverallReportmasterpanelLayout.setVerticalGroup(
            OverallReportmasterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverallReportmasterpanelLayout.createSequentialGroup()
                .addComponent(iconlabel3)
                .addGap(0, 0, 0)
                .addComponent(OverallReportlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(168, 168, 168)
                .addComponent(GenerateReportlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MonthlyReportmasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(DatedReportmasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(OverallReportmasterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenerateReportlbl)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MonthlyReportmasterpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OverallReportmasterpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatedReportmasterpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
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

    private void getBack(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBack
        utilities.switchFromTo(this, new AdminOptions());
    }//GEN-LAST:event_getBack

    private void backHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHover
        utilities.backHover(evt);
    }//GEN-LAST:event_backHover

    private void monthlyReport(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthlyReport
        utilities.switchFromTo(this, new GenerateMonthlyReport());
    }//GEN-LAST:event_monthlyReport

    private void datedReport(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datedReport
        utilities.switchFromTo(this, new ReportBasedOnDate());
    }//GEN-LAST:event_datedReport

    private void overallReport(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overallReport
        utilities.switchFromTo(this, new GenerateOverallReport());
    }//GEN-LAST:event_overallReport
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatedReportlabel;
    private javax.swing.JPanel DatedReportmasterpanel;
    private javax.swing.JLabel GenerateReportlbl;
    private javax.swing.JLabel MonthlyReportlabel;
    private javax.swing.JPanel MonthlyReportmasterpanel;
    private javax.swing.JLabel OverallReportlabel;
    private javax.swing.JPanel OverallReportmasterpanel;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel iconlabel;
    private javax.swing.JLabel iconlabel2;
    private javax.swing.JLabel iconlabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
