package ifsc.poo.domain.clientes;

import java.time.LocalDate;

public class ClientePremium extends Cliente{
    private double pagamentoMensal;
    private LocalDate dataInicioPremium;

    public ClientePremium(String nome, String cpf, String sobrenome, int id, String endereco, String telefone,
                          String genero, LocalDate dataCadastro, double pagamentoMensal,
                          LocalDate dataInicioPremium, String... emails) {
        super(nome, cpf, sobrenome, id, endereco, telefone, genero, dataCadastro, emails);
        this.pagamentoMensal = pagamentoMensal;
        this.dataInicioPremium = dataInicioPremium;
    }
}
