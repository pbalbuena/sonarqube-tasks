package com.oma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oma.model.Lote;

public interface LoteRepository extends JpaRepository<Lote, Long> {
}