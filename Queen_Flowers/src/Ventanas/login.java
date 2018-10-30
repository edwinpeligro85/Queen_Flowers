package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);

        ImageIcon imgIcon = new ImageIcon(getClass().getResource("../Imagenes/User.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(lbImage.getWidth(),
                lbImage.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lbImage.setIcon(iconoEscalado);

        ImageIcon imgIc = new ImageIcon(getClass().getResource("../Imagenes/FLORES.png"));
        Image imgEs = imgIc.getImage().getScaledInstance(Fondo.getWidth(),
                Fondo.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEs = new ImageIcon(imgEs);
        Fondo.setIcon(iconoEs);

        ImageIcon imgI = new ImageIcon(getClass().getResource("../Imagenes/icons8-entrar-26.png"));
        Image imgE = imgI.getImage().getScaledInstance(entrar.getWidth(),
                entrar.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoE = new ImageIcon(imgE);
        entrar.setIcon(iconoE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        entrar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        lbImage.setDisabledIcon(null);
        lbImage.setIconTextGap(2);
        lbImage.setMaximumSize(new java.awt.Dimension(100, 100));
        lbImage.setMinimumSize(new java.awt.Dimension(100, 100));
        lbImage.setPreferredSize(new java.awt.Dimension(168, 168));
        getContentPane().add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Iniciar Sesiòn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        usuario.setText("Usuario");
        usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 160, -1));

        contraseña.setText("jPasswordField1");
        contraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 160, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jButton1.setText("Crear cuenta");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-entrar-26.png"))); // NOI18N
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
        });
        entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarKeyPressed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 40, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FLORES.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        register v2 = new register();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        char c[] = contraseña.getPassword();
        String clave = new String(c);
        if (usuario.getText().equals("Administrador") && clave.equals("12345")) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "Bienvenido\n"
                    + "Has ingresado satisfactoriamente al sistema", "Mensaje de bienvenida",
                    JOptionPane.INFORMATION_MESSAGE);

            home v2 = new home();
            v2.setVisible(true);
            this.setVisible(false);

        } else {

            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_entrarMouseClicked

    private void entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarKeyPressed

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
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel entrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JButton salir;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
