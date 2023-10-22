package com.globonatics.Bike.repository;

import com.globonatics.Bike.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
