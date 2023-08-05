package br.com.dio.desafioacademiajpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.desafioacademiajpa.entity.Aluno;
import br.com.dio.desafioacademiajpa.entity.Matricula;
import br.com.dio.desafioacademiajpa.entity.form.MatriculaForm;
import br.com.dio.desafioacademiajpa.repository.AlunoRepository;
import br.com.dio.desafioacademiajpa.repository.MatriculaRepository;
import br.com.dio.desafioacademiajpa.service.IMatriculaService;
import jakarta.validation.Valid;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    public Matricula create(@Valid MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);
        return matriculaRepository.save(matricula);
    }

    // public List<Matricula> getAll() {
    //     return matriculaRepository.findAll();
    // }

    public List<Matricula> getAll(String bairro) {
        if (bairro == null) {
            return matriculaRepository.findAll();
        } else {
            return matriculaRepository.findByAlunoBairro(bairro);
        }
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
    }

}
