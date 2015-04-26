/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.inicio;

import javax.swing.JProgressBar;

/**
 *
 * @author andres
 */
public class Carga extends Thread {
    
    private JProgressBar barraSwing;
    private int velocidad;
    
    public Carga (JProgressBar progreso, int velocidad) {
        super ();
        this.barraSwing = progreso;
        this.velocidad = velocidad;
    }
    
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            barraSwing.setValue(i + 1);
            pausar(this.velocidad);
        }
    }
    
    public void pausar (int milis) {
        try {
            Thread.sleep(milis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
