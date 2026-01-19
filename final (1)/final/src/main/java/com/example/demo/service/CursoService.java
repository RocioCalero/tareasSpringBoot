package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Curso;
import com.example.demo.repository.CursoRepository;

@Service
public class CursoService {
	@Autowired
	private CursoRepository repo;
	
	public List<Curso> listar(){
		return repo.findAll();
	}
	public void guardar(Curso c) {
		repo.save(c);
	}
	
	public Curso obtenerPorId(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void eliminar(Long id) {
		repo.deleteById(id);
	}
}
