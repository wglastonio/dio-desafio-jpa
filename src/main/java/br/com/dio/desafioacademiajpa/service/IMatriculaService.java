package br.com.dio.desafioacademiajpa.service;

import java.util.List;

import br.com.dio.desafioacademiajpa.entity.Matricula;
import br.com.dio.desafioacademiajpa.entity.form.MatriculaForm;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    //List<Matricula> getAll();
    List<Matricula> getAll(String bairro);
    void delete(Long id);
}
