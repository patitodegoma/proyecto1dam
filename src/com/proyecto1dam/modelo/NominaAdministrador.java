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
public class NominaAdministrador extends Nomina {
    
    private int idAdministrador;

    public NominaAdministrador(int idAdministrador, int idNomina, int mes, int anyo, double importe) {
        super(idNomina, mes, anyo, importe);
        this.idAdministrador = idAdministrador;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "NominaAdministrador{" + "idAdministrador=" + idAdministrador + '}';
    }
    
    
    
}
