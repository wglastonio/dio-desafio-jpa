package br.com.dio.desafioacademiajpa.service;

import java.util.List;

import br.com.dio.desafioacademiajpa.entity.AvaliacaoFisica;
import br.com.dio.desafioacademiajpa.entity.form.AvaliacaoFisicaForm;
import br.com.dio.desafioacademiajpa.entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica> getAll();
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
    void delete(Long id);
}
