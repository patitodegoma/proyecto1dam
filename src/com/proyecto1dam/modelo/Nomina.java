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
public class Nomina {
    
    private int idNomina;
    private int mes;
    private int anyo;
    private double importe;

    public Nomina(int idNomina, int mes, int anyo, double importe) {
        this.idNomina = idNomina;
        this.mes = mes;
        this.anyo = anyo;
        this.importe = importe;
    }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
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

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Nomina{" + "idNomina=" + idNomina + ", mes=" + mes + ", anyo=" + anyo + ", importe=" + importe + '}';
    }
    
    
    
}
