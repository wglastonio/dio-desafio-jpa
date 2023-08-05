package br.com.dio.desafioacademiajpa.entity.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    @NotEmpty(message = "Preencha o campo Nome corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;
    
    @NotEmpty(message = "Preencha o campo CPF corretamente.")
    private String cpf;
    
    @NotEmpty(message = "Preencha o campo Bairro corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;
    
    @NotNull(message = "Prencha o campo Data de Nascimento corretamente.")
    @Past(message = "Data '${validatedValue}' é inválida.")
    private LocalDate dataNascimento;
}
