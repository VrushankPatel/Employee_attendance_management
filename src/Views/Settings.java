package Views;

import Utilities.JsonParsingUtilities;
import Utilities.UIComponentUtilities;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Settings extends javax.swing.JPanel {
    private final UIComponentUtilities utilities;        
    private final JsonParsingUtilities json; 
    public Settings() {
        utilities = new UIComponentUtilities();
        json = newJsonParsingUtilities("Properties.json");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAnAccountLabel = new javax.swing.JLabel();
        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        choicesFields = new javax.swing.JComboBox<>();
        enterChoiceLabel = new javax.swing.JLabel();
        redSlider = new javax.swing.JSlider();
        greenSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        outputColorPanel = new javax.swing.JPanel();
        redLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        redLabel1 = new javax.swing.JLabel();
        greenLabel1 = new javax.swing.JLabel();
        blueLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(utilities.colorutil.bodypanelcolor);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        createAnAccountLabel.setBackground(utilities.colorutil.bodypanelcolor);
        createAnAccountLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createAnAccountLabel.setForeground(utilities.colorutil.primarytextcolor);
        createAnAccountLabel.setText("Theme settings");

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
                minimize_lblmouseHoverminimmizeClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_lblmouseHoverminimmizeClose1(evt);
            }
        });

        close_lbl.setBackground(utilities.colorutil.headpanelandhovercolor);
        close_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close_lbl.setForeground(utilities.colorutil.primarytextcolor);
        close_lbl.setText("X");
        close_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lblactionClose(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_lblmouseHoverminimmizeClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_lblmouseHoverminimmizeClose1(evt);
            }
        });

        javax.swing.GroupLayout panelHeadLayout = new javax.swing.GroupLayout(panelHead);
        panelHead.setLayout(panelHeadLayout);
        panelHeadLayout.setHorizontalGroup(
            panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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

        choicesFields.setBackground(utilities.colorutil.primarytextcolor);
        choicesFields.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        try{
            choicesFields.setForeground(utilities.colorutil.bodypanelcolor);
            choicesFields.setModel(new javax.swing.DefaultComboBoxModel<>(json.getKeys("Properties.json")));
            choicesFields.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.primarytextcolor));
        }catch(Exception e){}
        choicesFields.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                getFieldData(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                getFieldData(evt);
            }
        });

        enterChoiceLabel.setBackground(utilities.colorutil.bodypanelcolor);
        enterChoiceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enterChoiceLabel.setForeground(utilities.colorutil.primarytextcolor);
        enterChoiceLabel.setText("Enter your choice : ");

        redSlider.setBackground(utilities.colorutil.bodypanelcolor);
        redSlider.setMaximum(255);
        redSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });

        greenSlider.setBackground(utilities.colorutil.bodypanelcolor);
        greenSlider.setMaximum(255);
        greenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });

        blueSlider.setBackground(utilities.colorutil.bodypanelcolor);
        blueSlider.setMaximum(255);
        blueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });

        outputColorPanel.setBackground(utilities.colorutil.bodypanelcolor);
        outputColorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.primarytextcolor));
        outputColorPanel.setForeground(utilities.colorutil.primarytextcolor);

        javax.swing.GroupLayout outputColorPanelLayout = new javax.swing.GroupLayout(outputColorPanel);
        outputColorPanel.setLayout(outputColorPanelLayout);
        outputColorPanelLayout.setHorizontalGroup(
            outputColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        outputColorPanelLayout.setVerticalGroup(
            outputColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        redLabel.setBackground(utilities.colorutil.bodypanelcolor);
        redLabel.setForeground(utilities.colorutil.primarytextcolor);
        redLabel.setText("RED");

        greenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        greenLabel.setForeground(utilities.colorutil.primarytextcolor);
        greenLabel.setText("GREEN");

        blueLabel.setBackground(utilities.colorutil.bodypanelcolor);
        blueLabel.setForeground(utilities.colorutil.primarytextcolor);
        blueLabel.setText("BLUE");

        redLabel1.setBackground(utilities.colorutil.bodypanelcolor);
        redLabel1.setForeground(utilities.colorutil.primarytextcolor);
        redLabel1.setText("0");

        greenLabel1.setBackground(utilities.colorutil.bodypanelcolor);
        greenLabel1.setForeground(utilities.colorutil.primarytextcolor);
        greenLabel1.setText("0");

        blueLabel1.setBackground(utilities.colorutil.bodypanelcolor);
        blueLabel1.setForeground(utilities.colorutil.primarytextcolor);
        blueLabel1.setText("0");

        jButton1.setText("Restore Defaults");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Apply");

        jButton3.setText("< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greenLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(blueLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greenSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blueSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greenLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(blueLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(createAnAccountLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(enterChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choicesFields, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAnAccountLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choicesFields, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(redSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(redLabel))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(greenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(greenLabel))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(blueLabel)))
                        .addComponent(outputColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(greenLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(blueLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void minimize_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblMouseClicked
        utilities.actionMinimize((JFrame) SwingUtilities.getWindowAncestor(this));
    }//GEN-LAST:event_minimize_lblMouseClicked

    private void minimize_lblmouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblmouseHoverminimmizeClose
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_minimize_lblmouseHoverminimmizeClose

    private void minimize_lblmouseHoverminimmizeClose1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_lblmouseHoverminimmizeClose1
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_minimize_lblmouseHoverminimmizeClose1

    private void close_lblactionClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblactionClose
        utilities.actionClose(evt);
    }//GEN-LAST:event_close_lblactionClose

    private void close_lblmouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblmouseHoverminimmizeClose
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_close_lblmouseHoverminimmizeClose

    private void close_lblmouseHoverminimmizeClose1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblmouseHoverminimmizeClose1
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_close_lblmouseHoverminimmizeClose1

    private void getFieldData(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_getFieldData
        Color color = utilities.colorutil.getColorProperty(choicesFields.getSelectedItem().toString());
        outputColorPanel.setBackground(color);
        redSlider.setValue(color.getRed());
        greenSlider.setValue(color.getGreen());
        blueSlider.setValue(color.getBlue());
        redLabel1.setText(String.valueOf(redSlider.getValue()));
        greenLabel1.setText(String.valueOf(greenSlider.getValue()));
        blueLabel1.setText(String.valueOf(blueSlider.getValue()));
    }//GEN-LAST:event_getFieldData

    private void redSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        redLabel1.setText(String.valueOf(redSlider.getValue()));
        greenLabel1.setText(String.valueOf(greenSlider.getValue()));
        blueLabel1.setText(String.valueOf(blueSlider.getValue()));
        outputColorPanel.setBackground(new Color(redSlider.getValue(),greenSlider.getValue(),blueSlider.getValue()));
    }//GEN-LAST:event_redSliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        utilities.switchFromTo(this, new LoginPanel());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueLabel;
    private javax.swing.JLabel blueLabel1;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JComboBox<String> choicesFields;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel createAnAccountLabel;
    private javax.swing.JLabel enterChoiceLabel;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JLabel greenLabel1;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel minimize_lbl;
    private javax.swing.JPanel outputColorPanel;
    private javax.swing.JPanel panelHead;
    private javax.swing.JLabel redLabel;
    private javax.swing.JLabel redLabel1;
    private javax.swing.JSlider redSlider;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
