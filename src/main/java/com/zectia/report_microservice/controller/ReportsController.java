package com.zectia.report_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zectia.report_microservice.dto.ReportsDto;
import com.zectia.report_microservice.model.Reports;
import com.zectia.report_microservice.service.ReportsService;

@RestController
@RequestMapping("reportes")
public class ReportsController {
  private final ReportsService reportsService;

  @Autowired
  public ReportsController(ReportsService reportsService) {
    this.reportsService = reportsService;
  }

  @PostMapping("reportar")
  public String createUserReport(@RequestBody ReportsDto reportsDto) {
    return this.reportsService.createUserReport(reportsDto);
  }

  @GetMapping("obtener-reportes-segun-tipo/{tipo}")
  public List<Reports> getReportsByType(@PathVariable String tipo) {
    return this.reportsService.getReportsByType(tipo);
  }
}
