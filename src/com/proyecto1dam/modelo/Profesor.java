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
public class Profesor extends Persona {
    
    private String usuario;
    private String contrasena;
    private String dni;
    private String segSocial;
    private String ccc;
    private String material;

    public Profesor(String usuario, String contrasena, String dni, String segSocial, String ccc, String material, int identificador, String nombre, String apellido1, String apellido2, String sexo, String direccion, String localidad, String fijo, String movil, String email) {
        super(identificador, nombre, apellido1, apellido2, sexo, direccion, localidad, fijo, movil, email);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.dni = dni;
        this.segSocial = segSocial;
        this.ccc = ccc;
        this.material = material;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSegSocial() {
        return segSocial;
    }

    public void setSegSocial(String segSocial) {
        this.segSocial = segSocial;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", dni=" + dni + ", segSocial=" + segSocial + ", ccc=" + ccc + ", material=" + material + '}';
    }
    
    
    
    
}
