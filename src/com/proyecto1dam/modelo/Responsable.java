/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.modelo;

import com.proyecto1dam.modelo.Persona;

/**
 *
 * @author andres
 */
public class Responsable extends Persona {
    
    private String dni;
    private String vinculacion;

    public Responsable(String dni, String vinculacion, int identificador, String nombre, String apellido1, String apellido2, String sexo, String direccion, String localidad, String fijo, String movil, String email) {
        super(identificador, nombre, apellido1, apellido2, sexo, direccion, localidad, fijo, movil, email);
        this.dni = dni;
        this.vinculacion = vinculacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(String vinculacion) {
        this.vinculacion = vinculacion;
    }

    @Override
    public String toString() {
        return "Responsable{" + "dni=" + dni + ", vinculacion=" + vinculacion + '}';
    }
    
    
    
    
}
