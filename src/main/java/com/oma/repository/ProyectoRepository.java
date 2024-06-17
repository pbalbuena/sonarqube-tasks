package com.oma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oma.model.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}