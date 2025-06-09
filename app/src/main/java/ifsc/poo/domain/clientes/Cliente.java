package ifsc.poo.domain.clientes;

import ifsc.poo.domain.Pessoa;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private static int countTot;
    private int id;
    private String endereco;
    private String telefone;
    private String genero;
    private LocalDate dataCadastro;

    static {
        countTot = 0;
    }

    public Cliente(String nome, String cpf, String sobrenome, int id, String endereco, String telefone, String genero, LocalDate dataCadastro, String... emails) {
        super(nome, cpf, sobrenome, emails);
        this.id = ++countTot;
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.dataCadastro = LocalDate.now();
    }
}
