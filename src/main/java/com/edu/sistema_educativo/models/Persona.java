package com.edu.sistema_educativo.models;

import java.util.Date;

abstract class Persona {
    private String dni;
    private String apellidoPaterno;
    private String getApellidoMaterno;
    private String nombres;
    private String sexo;
    private String estadoCivil;
    private Date fechaNacimiento;
    private boolean estado;
    private String direccion;
    private String ubigeo;
    private String email;
    private String celular;

    public Persona(String dni, String apellidoPaterno, String getApellidoMaterno, String nombres, String sexo, String estadoCivil, Date fechaNacimiento, boolean estado, String direccion, String ubigeo, String email, String celular) {
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.getApellidoMaterno = getApellidoMaterno;
        this.nombres = nombres;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.direccion = direccion;
        this.ubigeo = ubigeo;
        this.email = email;
        this.celular = celular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getGetApellidoMaterno() {
        return getApellidoMaterno;
    }

    public void setGetApellidoMaterno(String getApellidoMaterno) {
        this.getApellidoMaterno = getApellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
