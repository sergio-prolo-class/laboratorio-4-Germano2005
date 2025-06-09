package ifsc.poo.domain.funcionarios.tiposCLT;

import ifsc.poo.domain.funcionarios.CLT;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Senior extends CLT {
    private double bonificacao;
    private Set<Pleno> subordinados;

    public Senior(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, double salario,
                  int cargaHoraria, String carteiraTrabalho, Set<String> habilidade,
                  double bonificacao, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, salario, cargaHoraria, carteiraTrabalho, habilidade, emails);
        this.bonificacao = bonificacao;
        subordinados = new HashSet<>();
    }

    public void addSubordinados(Pleno pleno){
        this.subordinados.add(pleno);
        pleno.setChefe(this);
    }

}
