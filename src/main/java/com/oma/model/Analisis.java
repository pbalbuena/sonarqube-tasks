package com.oma.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Analisis {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long id_proyecto;
	Date fecha;
	int incidenciasSeguridad;
	int incidenciasConfiabilidad;
	int incidenciasMantenibilidad;
	double coberturaTests;
	double codigoDuplicado;
	int securityHotspots;
	
	@OneToMany(mappedBy = "analisis")
    private Set<AnalisisRegla> analisisReglas;
}
