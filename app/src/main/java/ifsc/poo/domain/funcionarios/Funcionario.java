package ifsc.poo.domain.funcionarios;

import ifsc.poo.domain.Pessoa;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa {
    private static int countTot;

    static {
        countTot = 0;
    }

    private int id;
    private LocalDate dataContrato;

    public Funcionario(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, String... emails) {
        super(nome, cpf, sobrenome, emails);
        this.id = ++countTot;
        this.dataContrato = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Funcionario that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
