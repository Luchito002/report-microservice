package com.zectia.report_microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Document(collection = "reportes")
public class Reports {

  @Transient
  public static final String SEQUENCE_NAME = "reports_sequence";

  @Id
  private Long id;

  @Field("referencia_id")
  private Long referenciaId;

  @Field("descripcion")
  private String descripcion;

  @CreatedDate
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  @Field("fecha_envio")
  private Date fechaEnvio = new Date();

  @Field("tipo")
  private String tipo;

  @Field("estado")
  private String estado;

  // Default constructor
  public Reports() {
  }

  // Constructor with all fields
  public Reports(Long referenciaId, String descripcion, Date fechaEnvio, String estado, String tipo) {
    this.referenciaId = referenciaId;
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
