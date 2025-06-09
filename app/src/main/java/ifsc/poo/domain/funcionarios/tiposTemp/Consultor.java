package ifsc.poo.domain.funcionarios.tiposTemp;

import ifsc.poo.domain.funcionarios.Temporario;

import java.time.LocalDate;

public class Consultor extends Temporario {
    public Consultor(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, emails);
    }
}
