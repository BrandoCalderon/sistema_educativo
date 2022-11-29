package com.edu.sistema_educativo.models;

import java.util.Date;

public class SemestreAnual {
    private int id;
    private String codigo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private String observacion;
    private boolean estado;

    public SemestreAnual() {
    }

    public SemestreAnual(String codigo, String descripcion, Date fechaInicio, Date fechaFin, String observacion, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observacion = observacion;
        this.estado = estado;
    }

    public SemestreAnual(int id, String codigo, String descripcion, Date fechaInicio, Date fechaFin, String observacion, boolean estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
