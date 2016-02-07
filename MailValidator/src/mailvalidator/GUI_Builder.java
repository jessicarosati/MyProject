/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailvalidator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jessica Rosati
 */
public class GUI_Builder extends javax.swing.JFrame {
    private File fileInput;
    private File folderOutput;
    private BufferedReader br;
    private BufferedWriter valid_Output_file;
    private BufferedWriter invalid_Output_file;

    /**
     * Creates new form GUI_Builder
     */
    public GUI_Builder() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Email Validator,  © Jessica_Rosati");
        setPreferredSize(new java.awt.Dimension(550, 330));
        setResizable(false);

        jLabel1.setText("Input File");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Output Folder");

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("About");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Start");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // jButton3 just prints a message with Copyright Information and the github repository address
        JComponent.setDefaultLocale(java.util.Locale.ENGLISH);
        JOptionPane.showMessageDialog(null,"© 2016, Jessica_Rosati, https://github.com/jessicarosati/MyProject.git");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // jButton1 lets to select an Inut File and write its name into jTextField1
        JComponent.setDefaultLocale(java.util.Locale.ENGLISH);
		    	JFileChooser fileChooser = new JFileChooser();
		    	int returnVal = fileChooser.showOpenDialog(fileChooser);
		    	if (returnVal == JFileChooser.APPROVE_OPTION) {
		    	     fileInput = fileChooser.getSelectedFile();
                             // if the selected input file is not a .txt, a message appears;
                             // otherwise the input file path is written in jTextField1
                             if (fileInput.toString().endsWith(".txt")) {
                                jTextField1.setText(fileInput.toString());
                            } else {
                               JOptionPane.showMessageDialog(null,"Select a .txt file please");  
                            }
		    	     
		    	}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // jButton2 lets to select the output folder and write its name into jTextField2
        JComponent.setDefaultLocale(java.util.Locale.ENGLISH);
		    	JFileChooser fileChooser = new JFileChooser();
                        // we set DIRECTORIES_ONLY mode
		    	fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    	int returnVal = fileChooser.showOpenDialog(fileChooser);
		    	if (returnVal == JFileChooser.APPROVE_OPTION) {
		    	     folderOutput = fileChooser.getSelectedFile();
		    	     jTextField2.setText(folderOutput.toString());
		    	}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // jButton4 launches the email validator
                        if(jTextField1.getText().isEmpty()){ //Error message if the Input File has not been selected
                            JOptionPane.showMessageDialog(null,"Select the Input File Please");
                        }
                        else if(jTextField2.getText().isEmpty()){//Error message if the Output Folder has not been selected
                            JOptionPane.showMessageDialog(null,"Select the Output Folder Please");
                        }
                        else if((fileInput==null&&!jTextField1.getText().isEmpty())||(folderOutput==null&&!jTextField2.getText().isEmpty())) {
                            //if the users manually adds the input file or the folder I have to check their existence
                            fileInput= new File(jTextField1.getText());
                            folderOutput= new File(jTextField2.getText());
                            if (!fileInput.exists()) {//Error message if the Input File is not a valid file
                                JOptionPane.showMessageDialog(null,"Input File not valid");
                            } else if(!folderOutput.exists()) {//Error message if the Output Folder is not a valid folder
                                JOptionPane.showMessageDialog(null,"Output Folder not valid");
                            } else {
                            String OutputFolderName = jTextField2.getText();
                            validateAddresses(fileInput,OutputFolderName);
                            JOptionPane.showMessageDialog(null,"Validation Successfully Completed");
                            }                           
                        }else{
                            String OutputFolderName = jTextField2.getText();
                            validateAddresses(fileInput,OutputFolderName);
                            JOptionPane.showMessageDialog(null,"Validation Successfully Completed");
                            }    
                        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Builder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void validateAddresses(File fileInput, String OutputFolderName) {
        try {
            try {
                String name_file = fileInput.toString();
                // name_file is what follows the last "\", without the file exstension
                name_file= name_file.substring(name_file.lastIndexOf("\\")).replace(".txt", "");
                try {
                    br = new BufferedReader(new FileReader(fileInput.toString()));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GUI_Builder.class.getName()).log(Level.SEVERE, "Input File not found", ex);
                }
                try {
                    // the file for valid mail addresses is written inside the output folder;
                    // its name is the name of the input file with _valid
                    valid_Output_file = new BufferedWriter(new FileWriter(OutputFolderName+"/"+name_file+"_valid.txt") );
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Builder.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    // the file for invalid mail addresses is written inside the output folder;
                    // its name is the name of the input file with _invalid
                    invalid_Output_file = new BufferedWriter(new FileWriter(OutputFolderName+"/"+name_file+"_invalid.txt") );
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Builder.class.getName()).log(Level.SEVERE, null, ex);
                }
                String line;
                while ((line = br.readLine()) != null) {
                    boolean valid= isValidEmailAddress(line);
                    if (valid==true) {
                        System.out.println("valid"+line);
                        valid_Output_file.append(line);
                        valid_Output_file.newLine();
                        
                    } else {
                        System.out.println("invalid"+line);
                        invalid_Output_file.append(line);
                        invalid_Output_file.newLine();
                        
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(GUI_Builder.class.getName()).log(Level.SEVERE, null, ex);
            }
            valid_Output_file.close();
            invalid_Output_file.close();
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Builder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean isValidEmailAddress(String mail) {
        /*
        ^ matches beginning of line
        [a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+ means one or more of the previous symbols
        @ (which is compusory)
        (([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,})
        - [a-zA-Z\\-0-9]+\\. means: one or more of symbols [a-zA-Z\\-0-9] followed by "." (\\. means exactly ".")
        - pay attention to \\- which means that the "-" symbol is allowed
        - the former structure could be repeated if needed, because of "+"
        - at least two characters in [a-zA-Z] after the "."
        $ matches end of line
        */
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,})$";
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
    java.util.regex.Matcher m = p.matcher(mail);
    return m.matches(); 
    }
}
