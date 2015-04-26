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
public class TipoCentro {
    
    private int tipoCentro;
    private String descripcion;
    private double importeProfesor;

    public TipoCentro(int tipoCentro, String descripcion, double importeProfesor) {
        this.tipoCentro = tipoCentro;
        this.descripcion = descripcion;
        this.importeProfesor = importeProfesor;
    }

    public int getTipoCentro() {
        return tipoCentro;
    }

    public void setTipoCentro(int tipoCentro) {
        this.tipoCentro = tipoCentro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporteProfesor() {
        return importeProfesor;
    }

    public void setImporteProfesor(double importeProfesor) {
        this.importeProfesor = importeProfesor;
    }

    @Override
    public String toString() {
        return "TipoCentro{" + "tipoCentro=" + tipoCentro + ", descripcion=" + descripcion + ", importeProfesor=" + importeProfesor + '}';
    }
    
    
    
}
