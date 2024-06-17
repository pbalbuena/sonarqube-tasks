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
public class Tecnologia {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nombre;
	
	@OneToMany(mappedBy = "tecnologia")
    private Set<ProyectoTecnologia> proyectosTecnologias;
}