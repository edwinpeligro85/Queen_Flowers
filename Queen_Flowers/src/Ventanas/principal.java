package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
@author edwin
 */
public class principal extends javax.swing.JFrame {
    
    public principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon imgIc = new ImageIcon(getClass().getResource("../Imagenes/FLORES.png"));
        Image imgEs = imgIc.getImage().getScaledInstance(fondo.getWidth(),
                fondo.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEs = new ImageIcon(imgEs);
        fondo.setIcon(iconoEs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FLORES.png"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(2000, 2000));
        getContentPane().add(fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
