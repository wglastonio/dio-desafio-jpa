package br.com.dio.desafioacademiajpa.service;

import java.util.List;

import br.com.dio.desafioacademiajpa.entity.Aluno;
import br.com.dio.desafioacademiajpa.entity.form.AlunoForm;
import br.com.dio.desafioacademiajpa.entity.form.AlunoUpdateForm;

public interface IAlunoService {
    Aluno create(AlunoForm form);
    Aluno get(Long id);
    //List<Aluno> getAll();
    List<Aluno> getAll(String dataNascimento);
    Aluno update(Long id, AlunoUpdateForm formUpdate);
    void delete(Long id);
}
