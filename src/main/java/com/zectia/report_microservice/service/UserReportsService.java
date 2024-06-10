package com.zectia.report_microservice.service;

import com.zectia.report_microservice.dto.UserReportsDto;

public interface UserReportsService {
  String createUserReport(UserReportsDto userReportsDto);
}
