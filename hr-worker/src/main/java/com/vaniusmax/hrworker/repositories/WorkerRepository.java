package com.vaniusmax.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaniusmax.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
