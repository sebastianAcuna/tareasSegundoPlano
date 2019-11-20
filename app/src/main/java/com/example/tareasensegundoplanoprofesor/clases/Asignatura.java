package com.example.tareasensegundoplanoprofesor.clases;

public class Asignatura {

    private int idAsignatura;
    private String descAsignatura;


    public Asignatura(int idAsignatura, String descAsignatura) {
        this.idAsignatura = idAsignatura;
        this.descAsignatura = descAsignatura;
    }

    public Asignatura() {
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getDescAsignatura() {
        return descAsignatura;
    }

    public void setDescAsignatura(String descAsignatura) {
        this.descAsignatura = descAsignatura;
    }
}
