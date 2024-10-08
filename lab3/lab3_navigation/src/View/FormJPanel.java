/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Patient;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yashu
 */
public class FormJPanel extends javax.swing.JPanel {

    ImageIcon profilePicture;
    JPanel bottomjPanel;
    /**
     * Creates new form FormJPanel
     */
    public FormJPanel(JPanel bottomjPanel) {
        this.bottomjPanel = bottomjPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelFirstname = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFirstName = new javax.swing.JTextField();
        jLabelLastname = new javax.swing.JLabel();
        jTextLastname = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOthers = new javax.swing.JRadioButton();
        jTextAge = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelpatienttype = new javax.swing.JLabel();
        patientTypejComboBox = new javax.swing.JComboBox<>();
        jLabelImage = new javax.swing.JLabel();
        jButtonImage = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jButtonSubmit = new javax.swing.JButton();
        imgJLabel = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabelFirstname.setText("FIRST NAME:");

        jLabelTitle.setText("Patient Registration Form");

        jTextFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFirstNameActionPerformed(evt);
            }
        });

        jLabelLastname.setText("LAST NAME:");

        jLabelGender.setText("GENDER:");

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setActionCommand("male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setActionCommand("female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButtonOthers);
        jRadioButtonOthers.setText("Others");
        jRadioButtonOthers.setActionCommand("others");
        jRadioButtonOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOthersActionPerformed(evt);
            }
        });

        jLabelAge.setText("AGE:");

        jLabelEmail.setText("EMAIL:");

        jLabelpatienttype.setText("PATIENT TYPE:");

        patientTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "appointment", "virtual", "walk-in" }));
        patientTypejComboBox.setSelectedIndex(-1);
        patientTypejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypejComboBoxActionPerformed(evt);
            }
        });

        jLabelImage.setText("SELECT IMAGE:");

        jButtonImage.setText("choose image");
        jButtonImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImageActionPerformed(evt);
            }
        });

        jLabelMessage.setText("MESSAGE:");

        jTextMessage.setColumns(20);
        jTextMessage.setRows(5);
        jScrollPane1.setViewportView(jTextMessage);

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelDate.setText("DATE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMessage)
                    .addComponent(jLabelImage)
                    .addComponent(jLabelpatienttype)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelAge)
                    .addComponent(jLabelGender)
                    .addComponent(jLabelLastname)
                    .addComponent(jLabelFirstname)
                    .addComponent(jLabelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTitle)
                        .addGap(149, 149, 149))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonOthers)
                                    .addComponent(jRadioButtonFemale)
                                    .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonMale)
                                    .addComponent(jTextAge, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonImage)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonSubmit)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstname)
                    .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastname)
                    .addComponent(jTextLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jRadioButtonMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOthers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(jTextAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelpatienttype, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelImage)
                                    .addComponent(jButtonImage))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDate))
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMessage)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButtonSubmit)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFirstNameActionPerformed

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jRadioButtonOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOthersActionPerformed

    private void patientTypejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientTypejComboBoxActionPerformed

    private void jButtonImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImageActionPerformed
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    this.imgJLabel.setText(file.getSelectedFile().getAbsolutePath());
                    this.imgJLabel.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = (new ImageIcon(edited_image));
                    //this.userInfo.setPic(new ImageIcon(edited_image));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonImageActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
    try
    {
        String firstname = this.jTextFirstName.getText();
        String lastname = this.jTextLastname.getText();
        String gender = this.buttonGroupGender.getSelection().getActionCommand();
        String age = this.jTextAge.getText();
        String email = this.jTextEmail.getText();
        String message = this.jTextMessage.getText();
        Date date = this.jDateChooser.getDate();
        String patientType = this.patientTypejComboBox.getSelectedItem().toString();
        String displayMessage = "First name: "+firstname+" Last Name: "+lastname+" Gender: "+gender+" age: "+age+" Email: "+email+" Date: "+date+" Patient Type: "+patientType+" Message: "+message;
        System.out.println(this.jTextFirstName.getText());
        System.out.println(this.jTextLastname.getText());
        System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
        System.out.println(this.jTextAge.getText());
        System.out.println(this.jTextEmail.getText());
        System.out.println(this.jTextMessage.getText());
        System.out.println(this.jDateChooser.getDate());
        JOptionPane.showMessageDialog(this, displayMessage, "success", HEIGHT, profilePicture);
        Patient p1 = new Patient();
        p1.setFirstname(firstname);
        p1.setLastname(lastname);
        p1.setGender(gender);
        p1.setPatientType(patientType);
        p1.setProfilePicture(profilePicture);
        p1.setAge(age);
        p1.setEmail(email);
        p1.setMessage(message);
        p1.setDate(date);
        
        ViewJPanel newViewJPanel = new ViewJPanel(p1);
        this.bottomjPanel.add(newViewJPanel);
        CardLayout layout = (CardLayout) this.bottomjPanel.getLayout();
        layout.next(bottomjPanel);
    }  
    catch(NullPointerException ne){
            String errorMessage = "You must enter values";
            JOptionPane.showMessageDialog(this,errorMessage);        
    }
    catch(Exception e){
            System.out.println("Exception has occured");
            JOptionPane.showMessageDialog(this,"exception occured");
            System.out.println(e);
    }
    
    }//GEN-LAST:event_jButtonSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JButton jButtonImage;
    private javax.swing.JButton jButtonSubmit;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelLastname;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelpatienttype;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLastname;
    private javax.swing.JTextArea jTextMessage;
    private javax.swing.JComboBox<String> patientTypejComboBox;
    // End of variables declaration//GEN-END:variables
}
