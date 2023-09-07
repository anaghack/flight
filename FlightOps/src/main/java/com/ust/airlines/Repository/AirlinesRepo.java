package com.ust.airlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.airlines.Entity.AirlinesEntity;

@Repository
public interface AirlinesRepo extends JpaRepository <AirlinesEntity,Long> {

}
