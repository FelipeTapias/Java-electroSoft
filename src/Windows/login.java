/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    private final String userAdmin = "tapias";
    private final String passAdmin = "tapias";

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/iconLogo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPassLogin = new javax.swing.JPasswordField();
        jTextFieldUserLogin = new javax.swing.JTextField();
        jButtonSession = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jPasswordFieldPassLogin.setBackground(new java.awt.Color(0, 102, 102));
        jPasswordFieldPassLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPasswordFieldPassLogin.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPasswordFieldPassLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 300, 50));

        jTextFieldUserLogin.setBackground(new java.awt.Color(0, 102, 102));
        jTextFieldUserLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUserLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextFieldUserLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 300, 50));

        jButtonSession.setBackground(new java.awt.Color(0, 102, 102));
        jButtonSession.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSession.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSession.setText("Iniciar Sesión");
        jButtonSession.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jButtonSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSessionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 220, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 390, 380));

        jLabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoDesk.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 832, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldPassLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassLoginActionPerformed

    private void jTextFieldUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserLoginActionPerformed

    private void jButtonSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSessionActionPerformed
        
        String textUser = jTextFieldUserLogin.getText();
        String textPassword = new String((jPasswordFieldPassLogin.getPassword()));
        
        if((textUser.equals(userAdmin)) && (textPassword.equals(passAdmin))) {
             JOptionPane.showMessageDialog(null,"Bienvenido " + textUser);
             dispose(); 
             new register().setVisible(true);
        }else {
            System.out.println("Usuario no encontrado");
            jTextFieldUserLogin.setText("");
            jPasswordFieldPassLogin.setText("");
            JOptionPane.showMessageDialog(null,"Las credenciales ingresadas son incorrectas");
        }
        
        
    }//GEN-LAST:event_jButtonSessionActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSession;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassLogin;
    private javax.swing.JTextField jTextFieldUserLogin;
    // End of variables declaration//GEN-END:variables
}
