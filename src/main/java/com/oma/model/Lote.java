package com.oma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Lote {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	int numero;
	String nombre;
}
