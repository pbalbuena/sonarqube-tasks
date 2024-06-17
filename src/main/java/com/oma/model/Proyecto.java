package com.oma.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "lote_id")
	private Lote lote;
	String nombre;
	String clave;
	
	@OneToMany(mappedBy = "proyecto")
    private Set<ProyectoTecnologia> proyectosTecnologias;
}
