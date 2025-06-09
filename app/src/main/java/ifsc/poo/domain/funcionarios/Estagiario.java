package ifsc.poo.domain.funcionarios;

import java.time.LocalDate;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, emails);
    }
}
