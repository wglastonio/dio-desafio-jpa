package br.com.dio.desafioacademiajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.desafioacademiajpa.entity.Matricula;
import br.com.dio.desafioacademiajpa.entity.form.MatriculaForm;
import br.com.dio.desafioacademiajpa.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl service;
    
    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
      return service.create(form);
    }
  
    // @GetMapping
    // public List<Matricula> getAll() {
    //   return service.getAll();
    // }
    
    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
      return service.getAll(bairro);
    }
}
