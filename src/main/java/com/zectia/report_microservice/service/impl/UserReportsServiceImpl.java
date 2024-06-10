package com.zectia.report_microservice.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zectia.report_microservice.dto.UserReportsDto;
import com.zectia.report_microservice.model.UserReports;
import com.zectia.report_microservice.repository.UserReportsRepository;
import com.zectia.report_microservice.service.UserReportsService;
import com.zectia.report_microservice.utils.DtoEntityConverter;
import com.zectia.report_microservice.utils.SequenceGeneratorService;

@Service
public class UserReportsServiceImpl implements UserReportsService {
  private final UserReportsRepository userReportsRepository;
  private final SequenceGeneratorService sequenceGenerator;

  @Autowired
  public UserReportsServiceImpl(UserReportsRepository userReportsRepository, SequenceGeneratorService sequenceGenerator) {
    this.userReportsRepository = userReportsRepository;
    this.sequenceGenerator = sequenceGenerator;
  }

  @Override
  public String createUserReport(UserReportsDto userReportsDto) {
    if(userReportsDto.getDescripcion().length() == 0 || userReportsDto.getDescripcion() == null) {
      return "Debes llenar la descripción";
    }

    UserReports newUserReports = DtoEntityConverter.dtoToEntity(userReportsDto, UserReports.class);
    newUserReports.setId(sequenceGenerator.generateSequence(UserReports.SEQUENCE_NAME));
    newUserReports.setEstado("revision");
    newUserReports.setFechaEnvio(new Date());
    userReportsRepository.save(newUserReports);
    return "Reportado con exito";
  }
}
