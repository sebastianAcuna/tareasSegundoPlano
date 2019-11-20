package com.example.tareasensegundoplanoprofesor.clases;

public class Tareas {

    private int idTarea;
    private String nombreTarea;
    private double nota;
    private int idEstudiante;
    private int idAsignatura;


    public Tareas() {
    }

    public Tareas(int idTarea, String nombreTarea, double nota, int idEstudiante, int idAsignatura) {
        this.idTarea = idTarea;
        this.nombreTarea = nombreTarea;
        this.nota = nota;
        this.idEstudiante = idEstudiante;
        this.idAsignatura = idAsignatura;
    }


    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }
}
