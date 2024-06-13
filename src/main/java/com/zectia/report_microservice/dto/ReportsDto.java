package com.zectia.report_microservice.dto;

import java.util.Date;

public class ReportsDto {
  private Long id;
  private Long referenciaId;
  private String descripcion;
  private Date fechaEnvio;
  private String estado;
  private String tipo;

  // Default constructor
  public ReportsDto() {
  }

  // Constructor with all fields
  public ReportsDto(Long id, Long referenciaId, String descripcion, Date fechaEnvio, String estado, String tipo) {
    this.id = id;
    this.referenciaId = referenciaId;
    this.descripcion = descripcion;
    this.fechaEnvio = fechaEnvio;
    this.estado = estado;
    this.tipo = tipo;
  }

  // Getters and Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getReferenciaId() {
    return referenciaId;
  }

  public void setReferenciaId(Long referenciaId) {
    this.referenciaId = referenciaId;
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

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
