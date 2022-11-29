package com.edu.sistema_educativo.models;

public class SemestreAcademico {
    private int id;
    private String codigo;
    private String descripcion;
    private boolean estado;

    public SemestreAcademico() {
    }

    public SemestreAcademico(String codigo, String descripcion, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public SemestreAcademico(int id, String codigo, String descripcion, boolean estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
