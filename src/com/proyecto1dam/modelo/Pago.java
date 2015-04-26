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
public class Pago {
    
    private int idPago;
    private int idAlumno;
    private int mes;
    private int anyo;
    private Date fechaPago;
    private double cantidad;
    private int tipoPago;

    public Pago(int idPago, int idAlumno, int mes, int anyo, Date fechaPago, double cantidad, int tipoPago) {
        this.idPago = idPago;
        this.idAlumno = idAlumno;
        this.mes = mes;
        this.anyo = anyo;
        this.fechaPago = fechaPago;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", idAlumno=" + idAlumno + ", mes=" + mes + ", anyo=" + anyo + ", fechaPago=" + fechaPago + ", cantidad=" + cantidad + ", tipoPago=" + tipoPago + '}';
    }
    
    
    
}
