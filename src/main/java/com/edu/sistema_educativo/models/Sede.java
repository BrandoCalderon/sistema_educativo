package com.edu.sistema_educativo.models;

public class Sede {
    private int id;
    private String codigo;
    private String descripcion;
    private String direccion;
    private String distrito;
    private String telefono;
    private String observacion;
    private boolean estado;


    public Sede() {
    }

    public Sede(String codigo, String descripcion, String direccion, String distrito, String telefono, String observacion, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telefono = telefono;
        this.observacion = observacion;
        this.estado = estado;
    }

    public Sede(int id, String codigo, String descripcion, String direccion, String distrito, String telefono, String observacion, boolean estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telefono = telefono;
        this.observacion = observacion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
}
