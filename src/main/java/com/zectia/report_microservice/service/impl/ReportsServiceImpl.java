package com.zectia.report_microservice.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zectia.report_microservice.dto.ReportsDto;
import com.zectia.report_microservice.model.Reports;
import com.zectia.report_microservice.repository.ReportsRepository;
import com.zectia.report_microservice.service.ReportsService;
import com.zectia.report_microservice.utils.DtoEntityConverter;
import com.zectia.report_microservice.utils.SequenceGeneratorService;

@Service
public class ReportsServiceImpl implements ReportsService {
  private final ReportsRepository reportsRepository;
  private final SequenceGeneratorService sequenceGenerator;

  @Autowired
  public ReportsServiceImpl(ReportsRepository reportsRepository, SequenceGeneratorService sequenceGenerator) {
    this.reportsRepository = reportsRepository;
    this.sequenceGenerator = sequenceGenerator;
  }

  @Override
  public String createUserReport(ReportsDto reportsDto) {
    if (reportsDto.getDescripcion().length() == 0 || reportsDto.getDescripcion() == null) {
      return "Debes llenar la descripción";
    }

    if (reportsDto.getTipo().length() == 0 || reportsDto.getTipo() == null) {
      return "Debes indicar el tipo";
    }

    if (reportsDto.getReferenciaId() == null) {
      return "Debes indicar el id de referencia";
    }

    Reports newReport = DtoEntityConverter.dtoToEntity(reportsDto, Reports.class);
    newReport.setId(sequenceGenerator.generateSequence(Reports.SEQUENCE_NAME));
    newReport.setEstado("revision");
    newReport.setFechaEnvio(new Date());
    reportsRepository.save(newReport);
    return "Reportado con exito";
  }

  @Override
  public List<Reports> getReportsByType(String tipo) {
    return reportsRepository.findByTipo(tipo);
  }
}
