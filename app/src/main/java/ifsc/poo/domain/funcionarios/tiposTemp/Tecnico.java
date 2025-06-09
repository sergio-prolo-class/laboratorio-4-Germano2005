package ifsc.poo.domain.funcionarios.tiposTemp;

import ifsc.poo.domain.funcionarios.Temporario;

import java.time.LocalDate;

public class Tecnico extends Temporario {

    public Tecnico(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, emails);
    }
}
