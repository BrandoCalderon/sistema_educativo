package com.edu.sistema_educativo.models;

import java.util.Date;

public class Alumno extends Persona {
    private int id;

    public Alumno(String dni, String apellidoPaterno, String getApellidoMaterno, String nombres, String sexo, String estadoCivil, Date fechaNacimiento, boolean estado, String direccion, String ubigeo, String email, String celular) {
        super(dni, apellidoPaterno, getApellidoMaterno, nombres, sexo, estadoCivil, fechaNacimiento, estado, direccion, ubigeo, email, celular);
    }

    public Alumno(String dni, String apellidoPaterno, String getApellidoMaterno, String nombres, String sexo, String estadoCivil, Date fechaNacimiento, boolean estado, String direccion, String ubigeo, String email, String celular, int id) {
        super(dni, apellidoPaterno, getApellidoMaterno, nombres, sexo, estadoCivil, fechaNacimiento, estado, direccion, ubigeo, email, celular);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}