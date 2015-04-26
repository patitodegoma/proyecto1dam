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
public class ModoPago {
    
    private int tipoPago;
    private String descripcion;
    private double descuento;

    public ModoPago(int tipoPago, String descripcion, double descuento) {
        this.tipoPago = tipoPago;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "ModoPago{" + "tipoPago=" + tipoPago + ", descripcion=" + descripcion + ", descuento=" + descuento + '}';
    }
    
    
    
}
