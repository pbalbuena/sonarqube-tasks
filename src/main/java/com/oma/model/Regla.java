package com.oma.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Regla {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long id_tecnologia;
	String codigo;
	String tipo;
	String descripcion;
	
	@OneToMany(mappedBy = "regla")
    private Set<AnalisisRegla> analisisReglas;
}
