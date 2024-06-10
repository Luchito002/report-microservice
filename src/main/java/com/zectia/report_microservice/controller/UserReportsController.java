package com.zectia.report_microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zectia.report_microservice.dto.UserReportsDto;
import com.zectia.report_microservice.service.UserReportsService;

@RestController
@RequestMapping("usuarios-reportes")
public class UserReportsController {
  private final UserReportsService userReportsService;

  @Autowired
  public UserReportsController (UserReportsService userReportsService) {
    this.userReportsService = userReportsService;
  }

  @PostMapping("reportar")
  public String createUserReport(@RequestBody UserReportsDto userReportsDto) {
    return this.userReportsService.createUserReport(userReportsDto);
  }
}
