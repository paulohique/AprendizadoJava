package AtividadeFelipe2.Package;

import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int dataNascimento;

    public Pessoa(String nome, String cpf, int dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double tirarCopias(int numeroCopias){
        return numeroCopias * 0.10;
    }
}

