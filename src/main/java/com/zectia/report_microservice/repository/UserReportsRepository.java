package com.zectia.report_microservice.repository;

import com.zectia.report_microservice.model.UserReports;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReportsRepository extends MongoRepository<UserReports, Long> {
}
