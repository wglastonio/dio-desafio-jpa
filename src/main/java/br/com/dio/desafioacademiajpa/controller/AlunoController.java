package br.com.dio.desafioacademiajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.desafioacademiajpa.entity.Aluno;
import br.com.dio.desafioacademiajpa.entity.AvaliacaoFisica;
import br.com.dio.desafioacademiajpa.entity.form.AlunoForm;
import br.com.dio.desafioacademiajpa.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    // @GetMapping
    // public List<Aluno> getAll() {
    //     return service.getAll();
    // }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataNascimento", required = false) String dataNascimento) {
        return service.getAll(dataNascimento);
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }
}
