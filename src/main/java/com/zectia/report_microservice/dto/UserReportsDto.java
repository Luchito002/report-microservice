package com.zectia.report_microservice.dto;

import java.util.Date;

public class UserReportsDto {
    private Long id;
    private String descripcion;
    private Date fechaEnvio;
    private String estado;

    // Default constructor
    public UserReportsDto() {
    }

    // Constructor with all fields
    public UserReportsDto(Long id, String descripcion, Date fechaEnvio, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
