package com.views;

import com.utilities.JsonParsingUtilities;
import com.utilities.UIComponentUtilities;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class SettingsWindow extends javax.swing.JPanel {    
    private final UIComponentUtilities utilities = new UIComponentUtilities();    
    private final JsonParsingUtilities json; 
    public SettingsWindow() {    
        json = new JsonParsingUtilities();
        initComponents();        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize_lbl = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        redLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        greenLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        choicesFields = new javax.swing.JComboBox<>();
        blueLabel = new javax.swing.JLabel();
        redLabel1 = new javax.swing.JLabel();
        greenLabel1 = new javax.swing.JLabel();
        enterChoiceLabel = new javax.swing.JLabel();
        blueLabel1 = new javax.swing.JLabel();
        redSlider = new javax.swing.JSlider();
        createAnAccountLabel = new javax.swing.JLabel();
        greenSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        outputColorPanel = new javax.swing.JPanel();

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeWindow(evt);
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

        jButton1.setText("Restore Defaults");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        redLabel.setBackground(utilities.colorutil.bodypanelcolor);
        redLabel.setForeground(utilities.colorutil.primarytextcolor);
        redLabel.setText("RED");

        jButton2.setText("Apply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        greenLabel.setBackground(utilities.colorutil.bodypanelcolor);
        greenLabel.setForeground(utilities.colorutil.primarytextcolor);
        greenLabel.setText("GREEN");

        jButton3.setText("< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        choicesFields.setBackground(utilities.colorutil.primarytextcolor);
        choicesFields.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        choicesFields.setForeground(utilities.colorutil.bodypanelcolor);
        try{
            choicesFields.setModel(new javax.swing.DefaultComboBoxModel<>(json.getKeys("./Properties/Properties.json")));
            choicesFields.setBorder(javax.swing.BorderFactory.createLineBorder(utilities.colorutil.primarytextcolor));
        }catch(Exception e){}
        choicesFields.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                choicesFieldsgetFieldData(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                choicesFieldsgetFieldData(evt);
            }
        });

        blueLabel.setBackground(utilities.colorutil.bodypanelcolor);
        blueLabel.setForeground(utilities.colorutil.primarytextcolor);
        blueLabel.setText("BLUE");

        redLabel1.setBackground(utilities.colorutil.bodypanelcolor);
        redLabel1.setForeground(utilities.colorutil.primarytextcolor);
        redLabel1.setText("0");

        greenLabel1.setBackground(utilities.colorutil.bodypanelcolor);
        greenLabel1.setForeground(utilities.colorutil.primarytextcolor);
        greenLabel1.setText("0");

        enterChoiceLabel.setBackground(utilities.colorutil.bodypanelcolor);
        enterChoiceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enterChoiceLabel.setForeground(utilities.colorutil.primarytextcolor);
        enterChoiceLabel.setText("Enter your choice : ");

        blueLabel1.setBackground(utilities.colorutil.bodypanelcolor);
        blueLabel1.setForeground(utilities.colorutil.primarytextcolor);
        blueLabel1.setText("0");

        redSlider.setBackground(utilities.colorutil.bodypanelcolor);
        redSlider.setMaximum(255);
        redSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });

        createAnAccountLabel.setBackground(utilities.colorutil.bodypanelcolor);
        createAnAccountLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createAnAccountLabel.setForeground(utilities.colorutil.primarytextcolor);
        createAnAccountLabel.setText("Theme settings");

        greenSlider.setBackground(utilities.colorutil.bodypanelcolor);
        greenSlider.setMaximum(255);
        greenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderredSliderStateChanged(evt);
            }
        });

        blueSlider.setBackground(utilities.colorutil.bodypanelcolor);
        blueSlider.setMaximum(255);
        blueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderredSliderStateChanged(evt);
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
            .addGap(0, 112, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
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
                        .addComponent(outputColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(createAnAccountLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choicesFields, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAnAccountLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choicesFields, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(outputColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void mouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseHoverminimmizeClose
        utilities.onHoverTitleBarButtons(evt);
    }//GEN-LAST:event_mouseHoverminimmizeClose

    private void actionClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionClose
        utilities.actionClose(evt);
    }//GEN-LAST:event_actionClose

    private void minimizeWindow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindow
        utilities.actionMinimize((JFrame) SwingUtilities.getWindowAncestor(this));
    }//GEN-LAST:event_minimizeWindow

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            json.restoreDefaults();
            JOptionPane.showMessageDialog(this.getParent(),"Restored defaulted successfully.", "Success",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_In_Progress_48px.png")));
            utilities.switchFromTo(this, new SettingsWindow());
        }catch(Exception e){
            utilities.logger.severe(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        utilities.switchFromTo(this, new LoginPanel());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void choicesFieldsgetFieldData(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_choicesFieldsgetFieldData
        Color color;
        try {
            color = utilities.colorutil.getColorProperty(choicesFields.getSelectedItem().toString());
            outputColorPanel.setBackground(color);
            redSlider.setValue(color.getRed());
            greenSlider.setValue(color.getGreen());
            blueSlider.setValue(color.getBlue());
        } catch (IOException ex) {
            utilities.logger.info(ex.getMessage());
        } catch (ParseException ex) {
            utilities.logger.warning(ex.getMessage());
        } catch(Exception e){
            utilities.logger.severe(e.getMessage());
        }
        redLabel1.setText(String.valueOf(redSlider.getValue()));
        greenLabel1.setText(String.valueOf(greenSlider.getValue()));
        blueLabel1.setText(String.valueOf(blueSlider.getValue()));
    }//GEN-LAST:event_choicesFieldsgetFieldData

    private void redSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        redLabel1.setText(String.valueOf(redSlider.getValue()));
        greenLabel1.setText(String.valueOf(greenSlider.getValue()));
        blueLabel1.setText(String.valueOf(blueSlider.getValue()));
        outputColorPanel.setBackground(new Color(redSlider.getValue(),greenSlider.getValue(),blueSlider.getValue()));
    }//GEN-LAST:event_redSliderStateChanged

    private void greenSliderredSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderredSliderStateChanged
        redLabel1.setText(String.valueOf(redSlider.getValue()));
        greenLabel1.setText(String.valueOf(greenSlider.getValue()));
        blueLabel1.setText(String.valueOf(blueSlider.getValue()));
        outputColorPanel.setBackground(new Color(redSlider.getValue(),greenSlider.getValue(),blueSlider.getValue()));
    }//GEN-LAST:event_greenSliderredSliderStateChanged

    private void blueSliderredSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderredSliderStateChanged
        redLabel1.setText(String.valueOf(redSlider.getValue()));
        greenLabel1.setText(String.valueOf(greenSlider.getValue()));
        blueLabel1.setText(String.valueOf(blueSlider.getValue()));
        outputColorPanel.setBackground(new Color(redSlider.getValue(),greenSlider.getValue(),blueSlider.getValue()));
    }//GEN-LAST:event_blueSliderredSliderStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            if(json.setValue(choicesFields.getSelectedItem().toString(), redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()) == 1){
                JOptionPane.showMessageDialog(this.getParent(),"Changes applied successfully.", "Success",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/Icons/icons8_In_Progress_48px.png")));
            }
        }catch(Exception e){
            utilities.logger.severe(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
