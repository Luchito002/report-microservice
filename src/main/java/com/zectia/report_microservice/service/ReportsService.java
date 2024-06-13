package com.zectia.report_microservice.service;

import java.util.List;

import com.zectia.report_microservice.dto.ReportsDto;
import com.zectia.report_microservice.model.Reports;

public interface ReportsService {
  String createUserReport(ReportsDto userReportsDto);

  List<Reports> getReportsByType(String tipo);
}
