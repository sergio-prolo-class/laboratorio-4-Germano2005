package ifsc.poo.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String sobrenome;
    protected Set<String> emails;

    public Pessoa(String nome, String cpf, String sobrenome, String... emails) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.emails = new HashSet<>(Arrays.asList(emails));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
