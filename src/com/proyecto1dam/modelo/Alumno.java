/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.modelo;

import java.util.Date;


/**
 *
 * @author andres
 */
public class Alumno extends Persona {
   
    private String usuario;
    private String pass;
    private Date fechaAlta;
    private Date fechaBaja;
    private double bonificacion;
    private double cuota;
    private String ccc;
    private int tipoPago;
    private int idGrupo;
    private int idResponsable;

    public Alumno (String usuario, String pass, Date fechaAlta, Date fechaBaja, double bonificacion, double cuota, String ccc, int tipoPago, int idGrupo, int idResponsable, int identificador, String nombre, String apellido1, String apellido2, String sexo, String direccion, String localidad, String fijo, String movil, String email) {
        super(identificador, nombre, apellido1, apellido2, sexo, direccion, localidad, fijo, movil, email);
        this.usuario = usuario;
        this.pass = pass;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.bonificacion = bonificacion;
        this.cuota = cuota;
        this.ccc = ccc;
        this.tipoPago = tipoPago;
        this.idGrupo = idGrupo;
        this.idResponsable = idResponsable;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    @Override
    public String toString() {
        return "Alumno{" + "usuario=" + usuario + ", pass=" + pass + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + ", bonificacion=" + bonificacion + ", cuota=" + cuota + ", ccc=" + ccc + ", tipoPago=" + tipoPago + ", idGrupo=" + idGrupo + ", idResponsable=" + idResponsable + '}';
    } 
    
}
