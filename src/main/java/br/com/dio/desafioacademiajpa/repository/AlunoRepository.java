package br.com.dio.desafioacademiajpa.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.desafioacademiajpa.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByDataNascimento(LocalDate dataNascimento);
}
