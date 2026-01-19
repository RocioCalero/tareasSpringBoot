package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CURSO")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_curso;
	
	@Column(nullable = false, length = 100)
	private String nombre;
	
	@Column(columnDefinition = "TEXT") //Mapeo para una descripción larga
	private String descripcion;
	
	

	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
