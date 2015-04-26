/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.modelo;

/**
 *
 * @author andres
 */
public class Centro {
    
    private int idCentro;
    private String nombre;
    private String direccion;
    private String localidad;
    private int fijo;
    private String email;
    private int tipoCentro;
    private double cuota;
    private int idResponsable;

    public Centro(int idCentro, String nombre, String direccion, String localidad, int fijo, String email, int tipoCentro, double cuota, int idResponsable) {
        this.idCentro = idCentro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fijo = fijo;
        this.email = email;
        this.tipoCentro = tipoCentro;
        this.cuota = cuota;
        this.idResponsable = idResponsable;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getFijo() {
        return fijo;
    }

    public void setFijo(int fijo) {
        this.fijo = fijo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoCentro() {
        return tipoCentro;
    }

    public void setTipoCentro(int tipoCentro) {
        this.tipoCentro = tipoCentro;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    @Override
    public String toString() {
        return "Centro{" + "idCentro=" + idCentro + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", fijo=" + fijo + ", email=" + email + ", tipoCentro=" + tipoCentro + ", cuota=" + cuota + ", idResponsable=" + idResponsable + '}';
    }
    
    
    
}
