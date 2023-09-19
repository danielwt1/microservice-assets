package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor,Long> {
}
