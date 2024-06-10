package com.zectia.report_microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Document(collection = "usuario_reportes")
public class UserReports {

  @Transient
  public static final String SEQUENCE_NAME = "user_reports_sequence";

  @Id
  private Long id;

  @Field("descripcion")
  private String descripcion;

  @CreatedDate
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  @Field("fecha_envio")
  private Date fechaEnvio = new Date();

  @Field("estado")
  private String estado;

  // Default constructor
  public UserReports() {
  }

  // Constructor with all fields
  public UserReports(String descripcion, Date fechaEnvio, String estado) {
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
