package com.example.model;


import jakarta.persistence.*;

@Entity
@Table(name = "CURSO")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_curso;
	
	@Column(nullable = false, length = 100)
	private String nombre;
	
	@Column(columnDefinition = "TEXT")
	private String descripcion;

	
}
