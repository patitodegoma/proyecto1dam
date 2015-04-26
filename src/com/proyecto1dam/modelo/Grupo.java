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
public class Grupo {
    
    private int idGrupo;
    private int idCentro;
    private String horario;
    private int idProfesor;

    public Grupo(int idGrupo, int idCentro, String horario, int idProfesor) {
        this.idGrupo = idGrupo;
        this.idCentro = idCentro;
        this.horario = horario;
        this.idProfesor = idProfesor;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return "Grupo{" + "idGrupo=" + idGrupo + ", idCentro=" + idCentro + ", horario=" + horario + ", idProfesor=" + idProfesor + '}';
    }
    
    
    
}
