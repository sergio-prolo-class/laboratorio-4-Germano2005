package ifsc.poo.domain.funcionarios.tiposCLT;

import ifsc.poo.domain.funcionarios.CLT;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Pleno extends CLT {
    private Set<Junior> orientados;
    private Senior chefe;

    public Pleno(String nome, String cpf, String sobrenome, int id, LocalDate dataContrato, double salario,
                 int cargaHoraria, String carteiraTrabalho, Set<String> habilidade, String... emails) {
        super(nome, cpf, sobrenome, id, dataContrato, salario, cargaHoraria, carteiraTrabalho, habilidade, emails);
        orientados = new HashSet<>();
    }

    public void addOrientado(Junior junior){
        this.orientados.add(junior);
        junior.setOrientador(this);
    }

    public Senior getChefe() {
        return chefe;
    }

    public void setChefe(Senior chefe) {
        this.chefe = chefe;
    }
}
