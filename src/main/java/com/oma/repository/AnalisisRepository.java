package com.oma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oma.model.Analisis;

public interface AnalisisRepository extends JpaRepository<Analisis, Long> {
}