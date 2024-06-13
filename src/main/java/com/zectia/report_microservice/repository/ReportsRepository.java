package com.zectia.report_microservice.repository;

import com.zectia.report_microservice.model.Reports;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository extends MongoRepository<Reports, Long> {
  List<Reports> findByTipo(String tipo);
}
