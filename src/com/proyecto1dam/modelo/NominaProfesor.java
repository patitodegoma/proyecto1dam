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
public class NominaProfesor extends Nomina {
    
    private int idProfesor;

    public NominaProfesor(int idProfesor, int idNomina, int mes, int anyo, double importe) {
        super(idNomina, mes, anyo, importe);
        this.idProfesor = idProfesor;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return "NominaProfesor{" + "idProfesor=" + idProfesor + '}';
    }
    
    
    
}
