/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author Vikrant
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form optionFrame
     */
    public AdminOptionsFrame() {
        initComponents();
                lblUsername.setText("Hello "+UserProfile.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbSetPaper = new javax.swing.JRadioButton();
        jrbEditPaper = new javax.swing.JRadioButton();
        jrRegister = new javax.swing.JRadioButton();
        jrbViewScores = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("                                          ONLINE QUIZ ADMINISTRATOPN PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Make a choice");

        jrbSetPaper.setBackground(new java.awt.Color(0, 0, 0));
        jrbSetPaper.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSetPaper.setForeground(new java.awt.Color(255, 102, 0));
        jrbSetPaper.setText("set a paper");

        jrbEditPaper.setBackground(new java.awt.Color(0, 0, 0));
        jrbEditPaper.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbEditPaper.setForeground(new java.awt.Color(255, 102, 0));
        jrbEditPaper.setText("Edit paper");
        jrbEditPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditPaperActionPerformed(evt);
            }
        });

        jrRegister.setBackground(new java.awt.Color(0, 0, 0));
        jrRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrRegister.setForeground(new java.awt.Color(255, 102, 0));
        jrRegister.setText("Register Student");
        jrRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRegisterActionPerformed(evt);
            }
        });

        jrbViewScores.setBackground(new java.awt.Color(0, 0, 0));
        jrbViewScores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbViewScores.setForeground(new java.awt.Color(255, 102, 0));
        jrbViewScores.setText("View Score");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 153, 0));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lblUsername.setForeground(new java.awt.Color(255, 102, 0));

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 102, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbViewScores, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrRegister)
                    .addComponent(jrbEditPaper)
                    .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbSetPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSetPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbEditPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbViewScores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbEditPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditPaperActionPerformed

    private void jrRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRegisterActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
                this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);

    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
                                         
         lblLogout.setForeground(new Color(255,153,0));
         Font f=new Font("Tahoma",Font.BOLD,12);
         lblLogout.setFont(f);

    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,12);
        lblLogout.setFont(f);

    }//GEN-LAST:event_lblLogoutMouseEntered

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
                
        if(jrbSetPaper.isSelected())
        {
            SetPaperFrame setPaperFrame=new SetPaperFrame();
            setPaperFrame.setVisible(true);
        }
        else if(jrbEditPaper.isSelected())
        {
            EditPaperFrame editPaperFrame=new EditPaperFrame();
            editPaperFrame.setVisible(true);
        }
        else if(jrRegister.isSelected())
        {
            RegisterStudentFrame regFrame=new RegisterStudentFrame();
            regFrame.setVisible(true);
        }
        else if(jrbViewScores.isSelected())
        {
            ViewScoresFrame viewScoresFrame=new ViewScoresFrame();
            viewScoresFrame.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Choose An Option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dispose();
        

    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrRegister;
    private javax.swing.JRadioButton jrbEditPaper;
    private javax.swing.JRadioButton jrbSetPaper;
    private javax.swing.JRadioButton jrbViewScores;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
