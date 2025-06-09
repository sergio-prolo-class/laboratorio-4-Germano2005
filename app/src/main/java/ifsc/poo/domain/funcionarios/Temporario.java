package ifsc.poo.domain.funcionarios;

import java.time.LocalDate;

public class Temporario extends Funcionario{

    public Temporario(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, emails);
    }
}
