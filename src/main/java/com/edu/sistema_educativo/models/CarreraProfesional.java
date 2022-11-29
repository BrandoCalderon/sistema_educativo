package com.edu.sistema_educativo.models;

import jakarta.faces.model.DataModelEvent;

public class CarreraProfesional {
    private int id;
    private String codigo;
    private String descripcion;
    private String observacion;
    private boolean estado;


    public CarreraProfesional() {
    }

    public CarreraProfesional(String codigo, String descripcion, String observacion, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.observacion = observacion;
        this.estado = estado;
    }


    public CarreraProfesional(int id, String codigo, String descripcion, String observacion, boolean estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.observacion = observacion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
