package br.com.dio.desafioacademiajpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.desafioacademiajpa.entity.Aluno;
import br.com.dio.desafioacademiajpa.entity.AvaliacaoFisica;
import br.com.dio.desafioacademiajpa.entity.form.AvaliacaoFisicaForm;
import br.com.dio.desafioacademiajpa.entity.form.AvaliacaoFisicaUpdateForm;
import br.com.dio.desafioacademiajpa.repository.AlunoRepository;
import br.com.dio.desafioacademiajpa.repository.AvaliacaoFisicaRepository;
import br.com.dio.desafioacademiajpa.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());
        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

}
