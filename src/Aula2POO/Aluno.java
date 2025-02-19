package Aula2POO;

import java.util.Date;

public class Aluno {
    private String nome;
    private Integer cpf;
    private Date dataNascimento;
    private String email;

    public Aluno(String nome, Integer cpf, Date dataNascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", dataNascimento=" + dataNascimento +
                ", email='" + email + '\'' +
                '}';
    }
}
