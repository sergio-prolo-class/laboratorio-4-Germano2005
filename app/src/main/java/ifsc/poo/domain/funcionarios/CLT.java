package ifsc.poo.domain.funcionarios;

import java.time.LocalDate;
import java.util.Set;

public class CLT extends Funcionario{
    private double salario;
    private int cargaHoraria;
    private String carteiraTrabalho;
    private Set<String> habilidade;

    public CLT(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato,
               double salario, int cargaHoraria, String carteiraTrabalho,
               Set<String> habilidade, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, emails);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.carteiraTrabalho = carteiraTrabalho;
        this.habilidade = habilidade;
    }
}
