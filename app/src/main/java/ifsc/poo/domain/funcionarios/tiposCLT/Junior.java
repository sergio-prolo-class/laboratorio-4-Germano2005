package ifsc.poo.domain.funcionarios.tiposCLT;

import ifsc.poo.domain.funcionarios.CLT;

import java.time.LocalDate;
import java.util.Set;

public class Junior extends CLT {
    private Pleno orientador;


    public Junior(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, double salario,
                  int cargaHoraria, String carteiraTrabalho, Set<String> habilidade, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, salario, cargaHoraria, carteiraTrabalho, habilidade, emails);
    }

    public Pleno getOrientador() {
        return orientador;
    }

    public void setOrientador(Pleno orientador) {
        this.orientador = orientador;
    }
}
