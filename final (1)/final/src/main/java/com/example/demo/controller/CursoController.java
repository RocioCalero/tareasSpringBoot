package com.example.demo.controller;

import com.example.demo.model.Curso;
import com.example.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cursos") // Esta es la URL base para entrar
public class CursoController {

    @Autowired
    private CursoService service;

    // 1. Listar todos los cursos
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cursos", service.listar());
        return "listado"; // Busca el archivo listado.html
    }

    // 2. Mostrar formulario para crear nuevo curso
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("curso", new Curso());
        return "formulario"; // Busca el archivo formulario.html
    }

    // 3. Guardar el curso (Crear o Actualizar)
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("curso") Curso curso) {
        service.guardar(curso);
        return "redirect:/cursos"; // Redirige al listado tras guardar
    }

    // 4. Eliminar un curso
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        service.eliminar(id);
        return "redirect:/cursos";
    }
}