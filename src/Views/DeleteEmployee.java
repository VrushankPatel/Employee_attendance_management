package Views;

import Utilities.DBAccessUtilities;
import Utilities.DBOperationUtilities;
import Utilities.UIComponentUtilities;
import javax.swing.*;

public class DeleteEmployee extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();
    private DBOperationUtilities dboperation;
    private DBAccessUtilities dbaccesstocken;
    public DeleteEmployee() {          
        initComponents();               
        initConnection();
    }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        EmployeeId = new javax.swing.JTextField();
        EmployeeIdLabel = new javax.swing.JLabel();
        deleteEmployeeLoginlbl = new javax.swing.JLabel();
        DeleteButtonPanel = new javax.swing.JPanel();
        DeleteButtenLabel = new javax.swing.JLabel();
        BackButtonPanel = new javax.swing.JPanel();
        BackButtenLabel = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

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

        EmployeeIdLabel.setBackground(utilities.colorutil.bodypanelcolor);
        EmployeeIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        EmployeeIdLabel.setForeground(utilities.colorutil.primarytextcolor);
        EmployeeIdLabel.setText("Employee ID");

        deleteEmployeeLoginlbl.setBackground(utilities.colorutil.bodypanelcolor);
        deleteEmployeeLoginlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deleteEmployeeLoginlbl.setForeground(utilities.colorutil.primarytextcolor);
        deleteEmployeeLoginlbl.setText("Delete Employee Details");

        DeleteButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        DeleteButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        DeleteButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        DeleteButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEmployee(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commonHoverButtons(evt);
            }
        });

        DeleteButtenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        DeleteButtenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DeleteButtenLabel.setForeground(utilities.colorutil.primarytextcolor);
        DeleteButtenLabel.setText("Delete");
        DeleteButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout DeleteButtonPanelLayout = new javax.swing.GroupLayout(DeleteButtonPanel);
        DeleteButtonPanel.setLayout(DeleteButtonPanelLayout);
        DeleteButtonPanelLayout.setHorizontalGroup(
            DeleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteButtonPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(DeleteButtenLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeleteButtonPanelLayout.setVerticalGroup(
            DeleteButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeleteButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        BackButtonPanel.setBackground(utilities.colorutil.bodypanelcolor);
        BackButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.initialBorder));
        BackButtonPanel.setForeground(utilities.colorutil.primarytextcolor);
        BackButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        BackButtenLabel.setText(" < Back");
        BackButtenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackButtonPanelLayout = new javax.swing.GroupLayout(BackButtonPanel);
        BackButtonPanel.setLayout(BackButtonPanelLayout);
        BackButtonPanelLayout.setHorizontalGroup(
            BackButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackButtonPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(BackButtenLabel)
                .addContainerGap())
        );
        BackButtonPanelLayout.setVerticalGroup(
            BackButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackButtenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
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
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmployeeIdLabel)
                            .addComponent(EmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(deleteEmployeeLoginlbl)))
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
                .addComponent(deleteEmployeeLoginlbl)
                .addGap(62, 62, 62)
                .addComponent(EmployeeIdLabel)
                .addGap(0, 0, 0)
                .addComponent(EmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        utilities.switchFromTo(this, new ManipulateEmployeeDetails());
    }//GEN-LAST:event_getBack

    private void deleteEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployee
        String result;
        try{
            result = dbaccesstocken.con.isClosed() ? "Database communication link failure" : dboperation.deleteEmployee(EmployeeId.getText());
            if("success".equals(result)){
                System.out.println(result);
                JOptionPane.showMessageDialog(this.getParent(),"Employee successfully deleted.", "Success",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_In_Progress_48px.png")));                    
            }else{
                status.setText("Status : "+(dbaccesstocken.con.isClosed() ? "Not Connected" : "Connected"));
                JOptionPane.showMessageDialog(this.getParent(),result, "Insertion error",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
            }  
            if(dbaccesstocken.con.isClosed()){                
                initConnection();
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this.getParent(),"Database communication link failure", "Oops...... Error occurred",JOptionPane.ERROR_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_ID_not_Verified_48px.png")));
            initConnection();
        }catch(Exception e){} 
    }//GEN-LAST:event_deleteEmployee

    private void minimize_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblMouseClicked
        utilities.actionMinimize((JFrame) SwingUtilities.getWindowAncestor(this));
    }//GEN-LAST:event_minimize_lblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButtenLabel;
    private javax.swing.JPanel BackButtonPanel;
    private javax.swing.JLabel DeleteButtenLabel;
    private javax.swing.JPanel DeleteButtonPanel;
    private javax.swing.JTextField EmployeeId;
    private javax.swing.JLabel EmployeeIdLabel;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel deleteEmployeeLoginlbl;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
