/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.controlador;

import com.proyecto1dam.modelo.Profesor;
import java.util.List;

/**
 *
 * @author andres
 */
public class Pruebas {
    
    public static void main (String [] args) {
        CrudProfesor cp = new CrudProfesor ();
        
        List <Profesor> lista = cp.findAll();
        
        for (Profesor p : lista) {
            System.out.println(p.toString());
        }
        
        
               
    }
    
}
