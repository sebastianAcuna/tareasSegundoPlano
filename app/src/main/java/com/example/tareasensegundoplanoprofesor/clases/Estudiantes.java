package com.example.tareasensegundoplanoprofesor.clases;

public class Estudiantes {

    private int idEstudiante;
    private String descEstudiantes;

    public Estudiantes(int idEstudiante, String descEstudiantes) {
        this.idEstudiante = idEstudiante;
        this.descEstudiantes = descEstudiantes;
    }

    public Estudiantes() {
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getDescEstudiantes() {
        return descEstudiantes;
    }

    public void setDescEstudiantes(String descEstudiantes) {
        this.descEstudiantes = descEstudiantes;
    }
}
