package com.oma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class AnalisisRegla {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
    @JoinColumn(name = "id_analisis")
    private Analisis analisis;
    @ManyToOne
    @JoinColumn(name = "id_regla")
    private Regla regla;
	String fichero;
	int linea;
}
