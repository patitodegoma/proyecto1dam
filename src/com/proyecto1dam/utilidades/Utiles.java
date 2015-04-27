/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.utilidades;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JPanel;

/**
 * 
 * @author amacias
 */
public class Utiles {
    /**
     * @deprecated Se logra el objetivo con getContentPane().removeAll;
     * @param padre 
     */
    public static void ocultarPaneles(Container padre) {
        Component[] components = padre.getComponents();

    if (components.length > 0) {
        for (Component component : components) {
            if (component instanceof JPanel) {
                ((JPanel) component).setVisible(false);
            }
        }
    }
    }
    
}
