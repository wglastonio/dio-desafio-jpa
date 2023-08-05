package br.com.dio.desafioacademiajpa.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.desafioacademiajpa.entity.Aluno;
import br.com.dio.desafioacademiajpa.entity.AvaliacaoFisica;
import br.com.dio.desafioacademiajpa.entity.form.AlunoForm;
import br.com.dio.desafioacademiajpa.entity.form.AlunoUpdateForm;
import br.com.dio.desafioacademiajpa.infra.jackson.utils.JavaTimeUtils;
import br.com.dio.desafioacademiajpa.repository.AlunoRepository;
import br.com.dio.desafioacademiajpa.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    // @Override
    // public List<Aluno> getAll() {
    //     return repository.findAll();
    // }

    @Override
    public List<Aluno> getAll(String dataNascimento) {
        if (dataNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataNascimento(localDate);
        }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }

}
