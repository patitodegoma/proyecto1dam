/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.vista;

import com.proyecto1dam.inicio.*;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.BorderFactory;

/**
 *
 * @author andres
 */
public class LoginForm extends javax.swing.JFrame {
    
    Carga hilo;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        iniciarVentana();
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        //MiCursor();
        
    }
    
    public void iniciarVentana () {
        setLocationRelativeTo(null);
        hilo = new Carga (getBarraCarga(), 10);
        getBarraCarga().setVisible(false);
        hilo.start();
        hilo = null;
    }
    
    
    public void MiCursor () {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("cursor.gif");
        Point p = new Point (0, 0);
        Cursor cursor = tk.createCustomCursor(img, p, "Cursor");
        
        setCursor(cursor);
        this.setVisible(true);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        globalPanel = new javax.swing.JPanel();
        entrarButton = new javax.swing.JButton();
        empresaLabel = new javax.swing.JLabel();
        forgotUserLabel = new javax.swing.JLabel();
        barraVLabel = new javax.swing.JLabel();
        RememberPWLabel = new javax.swing.JLabel();
        esalogo = new javax.swing.JLabel();
        etiquetasCampos = new javax.swing.JPanel();
        nomUsuarioLabel = new javax.swing.JLabel();
        contrasLabel = new javax.swing.JLabel();
        campos = new javax.swing.JPanel();
        nomUserField = new javax.swing.JTextField();
        contrasField = new javax.swing.JPasswordField();
        salirButton = new javax.swing.JButton();
        bgLabel = new javax.swing.JLabel();
        barraCarga = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        globalPanel.setBackground(getBackground());
        globalPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        globalPanel.setName(""); // NOI18N
        globalPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        globalPanel.setLayout(null);

        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        globalPanel.add(entrarButton);
        entrarButton.setBounds(220, 220, 90, 23);

        empresaLabel.setFont(new java.awt.Font("Ubuntu", 3, 40)); // NOI18N
        empresaLabel.setForeground(new java.awt.Color(0, 0, 128));
        empresaLabel.setText("Escuela Sevillana de Ajedrez");
        globalPanel.add(empresaLabel);
        empresaLabel.setBounds(20, 30, 560, 70);

        forgotUserLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        forgotUserLabel.setText("Olvidé mi usuario");
        globalPanel.add(forgotUserLabel);
        forgotUserLabel.setBounds(80, 290, 96, 16);

        barraVLabel.setText("|");
        globalPanel.add(barraVLabel);
        barraVLabel.setBounds(190, 290, 4, 14);

        RememberPWLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        RememberPWLabel.setText("Recordar contraseña");
        globalPanel.add(RememberPWLabel);
        RememberPWLabel.setBounds(210, 290, 130, 16);

        esalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoESA.png"))); // NOI18N
        esalogo.setText("jLabel1");
        esalogo.setMaximumSize(new java.awt.Dimension(150, 125));
        esalogo.setMinimumSize(new java.awt.Dimension(150, 125));
        esalogo.setPreferredSize(new java.awt.Dimension(150, 125));
        globalPanel.add(esalogo);
        esalogo.setBounds(620, 10, 150, 125);

        etiquetasCampos.setLayout(new java.awt.BorderLayout(0, 5));

        nomUsuarioLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        nomUsuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomUsuarioLabel.setText("Nombre de Usuario");
        nomUsuarioLabel.setMaximumSize(new java.awt.Dimension(34, 25));
        nomUsuarioLabel.setMinimumSize(new java.awt.Dimension(34, 25));
        nomUsuarioLabel.setPreferredSize(new java.awt.Dimension(34, 25));
        etiquetasCampos.add(nomUsuarioLabel, java.awt.BorderLayout.CENTER);

        contrasLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        contrasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        contrasLabel.setText("Contraseña");
        contrasLabel.setMaximumSize(new java.awt.Dimension(34, 25));
        contrasLabel.setMinimumSize(new java.awt.Dimension(34, 25));
        contrasLabel.setName(""); // NOI18N
        contrasLabel.setPreferredSize(new java.awt.Dimension(34, 20));
        etiquetasCampos.add(contrasLabel, java.awt.BorderLayout.PAGE_END);

        globalPanel.add(etiquetasCampos);
        etiquetasCampos.setBounds(110, 143, 100, 45);

        campos.setLayout(new java.awt.BorderLayout(0, 5));
        campos.add(nomUserField, java.awt.BorderLayout.PAGE_START);
        campos.add(contrasField, java.awt.BorderLayout.CENTER);

        globalPanel.add(campos);
        campos.setBounds(220, 143, 200, 45);

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        globalPanel.add(salirButton);
        salirButton.setBounds(330, 220, 90, 23);

        bgLabel.setBackground(new java.awt.Color(255, 204, 204));
        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background_home.jpg"))); // NOI18N
        bgLabel.setText("jLabel1");
        globalPanel.add(bgLabel);
        bgLabel.setBounds(0, 0, 838, 600);

        barraCarga.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraCargaStateChanged(evt);
            }
        });
        globalPanel.add(barraCarga);
        barraCarga.setBounds(30, 360, 30, 14);
        setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(globalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(globalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        MarcoBase mb = new MarcoBase();
        mb.setVisible(true);
        MenuPrincipal mp = new MenuPrincipal();
        mp.setLayout(null);
        mb.add(mp);
        mp.setBounds(0, 150, 800, 450);
        mp.setPreferredSize(new Dimension(800,450));
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void barraCargaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraCargaStateChanged
        String opacidad;
        
        if (getBarraCarga().getValue() < 10) {
            opacidad = "0.0" + getBarraCarga().getValue();
        } else if (getBarraCarga().getValue() < 100) {
            opacidad = "0." + getBarraCarga().getValue();
        } else {
            opacidad = "1";
        }
        
        Float valorOpacidad = Float.parseFloat(opacidad);
        AWTUtilities.setWindowOpacity(this, Float.valueOf(valorOpacidad));
    }//GEN-LAST:event_barraCargaStateChanged

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RememberPWLabel;
    private javax.swing.JProgressBar barraCarga;
    private javax.swing.JLabel barraVLabel;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JPanel campos;
    private javax.swing.JPasswordField contrasField;
    private javax.swing.JLabel contrasLabel;
    private javax.swing.JLabel empresaLabel;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel esalogo;
    private javax.swing.JPanel etiquetasCampos;
    private javax.swing.JLabel forgotUserLabel;
    private javax.swing.JPanel globalPanel;
    private javax.swing.JTextField nomUserField;
    private javax.swing.JLabel nomUsuarioLabel;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the BarraInicial
     */
    public javax.swing.JProgressBar getBarraCarga() {
        return barraCarga;
    }

    
    /**
     * @param barraCarga the barraCarga to set
     */
    public void setBarraCarga(javax.swing.JProgressBar barraCarga) {
        this.barraCarga = barraCarga;
    }
}
