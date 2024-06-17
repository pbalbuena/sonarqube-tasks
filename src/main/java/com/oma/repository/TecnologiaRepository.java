package com.oma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oma.model.Tecnologia;

public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long> {
}