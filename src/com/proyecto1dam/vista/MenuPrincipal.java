/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.vista;

import java.awt.Dimension;

/**
 *
 * @author amacias
 */
public class MenuPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        menuLabel = new javax.swing.JLabel();
        botonesMenu = new javax.swing.JPanel();
        alumnosButton = new javax.swing.JButton();
        profesoresButton = new javax.swing.JButton();
        gruposButton = new javax.swing.JButton();
        centrosButton = new javax.swing.JButton();
        adminButtons = new javax.swing.JButton();
        ayudaButton = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        setLayout(null);

        menuLabel.setFont(new java.awt.Font("Ubuntu Light", 3, 24)); // NOI18N
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("MENÚ PRINCIPAL");
        add(menuLabel);
        menuLabel.setBounds(0, 0, 800, 50);

        botonesMenu.setPreferredSize(new java.awt.Dimension(300, 200));
        botonesMenu.setLayout(null);

        alumnosButton.setText("Alumnos");
        alumnosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnosButtonActionPerformed(evt);
            }
        });
        botonesMenu.add(alumnosButton);
        alumnosButton.setBounds(0, 0, 160, 160);

        profesoresButton.setText("Profesores");
        profesoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesoresButtonActionPerformed(evt);
            }
        });
        botonesMenu.add(profesoresButton);
        profesoresButton.setBounds(160, 0, 160, 160);

        gruposButton.setText("Grupos");
        gruposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposButtonActionPerformed(evt);
            }
        });
        botonesMenu.add(gruposButton);
        gruposButton.setBounds(320, 0, 160, 160);

        centrosButton.setText("Centros");
        centrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centrosButtonActionPerformed(evt);
            }
        });
        botonesMenu.add(centrosButton);
        centrosButton.setBounds(0, 160, 160, 160);

        adminButtons.setText("Administradores");
        adminButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonsActionPerformed(evt);
            }
        });
        botonesMenu.add(adminButtons);
        adminButtons.setBounds(160, 160, 160, 160);

        ayudaButton.setText("Acerca de...");
        botonesMenu.add(ayudaButton);
        ayudaButton.setBounds(320, 160, 160, 160);

        add(botonesMenu);
        botonesMenu.setBounds(160, 50, 480, 320);

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background_homeb.png"))); // NOI18N
        add(fondoLabel);
        fondoLabel.setBounds(0, 0, 800, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void alumnosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosButtonActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        MarcoBase mb = new MarcoBase();
        
        AlumnosBuscar alb = new AlumnosBuscar();
        alb.setLayout(null);
        mb.add(alb);
        alb.setBounds(0, 150, 800, 450);
        alb.setPreferredSize(new Dimension(800,450));
        alb.setVisible(true);
        
    }//GEN-LAST:event_alumnosButtonActionPerformed

    private void profesoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesoresButtonActionPerformed
        // TODO add your handling code here:
        ProfesoresBuscar pb = new ProfesoresBuscar();
        pb.setLayout(null);
        this.add(pb);
        pb.setBounds(0, 150, 800, 450);
        pb.setPreferredSize(new Dimension(800,450));
        pb.setVisible(true);
    }//GEN-LAST:event_profesoresButtonActionPerformed

    private void adminButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonsActionPerformed
        // TODO add your handling code here:
        AdministradoresBuscar adb = new AdministradoresBuscar();
        adb.setLayout(null);
        this.add(adb);
        adb.setBounds(0, 150, 800, 450);
        adb.setPreferredSize(new Dimension(800,450));
        adb.setVisible(true);
    }//GEN-LAST:event_adminButtonsActionPerformed

    private void centrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centrosButtonActionPerformed
        // TODO add your handling code here:
        CentrosBuscar cb = new CentrosBuscar();
        cb.setLayout(null);
        this.add(cb);
        cb.setBounds(0, 150, 800, 450);
        cb.setPreferredSize(new Dimension(800,450));
        cb.setVisible(true);
    }//GEN-LAST:event_centrosButtonActionPerformed

    private void gruposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposButtonActionPerformed
        // TODO add your handling code here:
        GruposBuscar gf = new GruposBuscar();
        gf.setLayout(null);
        this.add(gf);
        gf.setBounds(0, 150, 800, 450);
        gf.setPreferredSize(new Dimension(800,450));
        gf.setVisible(true);
    }//GEN-LAST:event_gruposButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButtons;
    private javax.swing.JButton alumnosButton;
    private javax.swing.JButton ayudaButton;
    private javax.swing.JPanel botonesMenu;
    private javax.swing.JButton centrosButton;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JButton gruposButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton profesoresButton;
    // End of variables declaration//GEN-END:variables
}
