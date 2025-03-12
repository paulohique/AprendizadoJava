package AtividadeFelipe2.Package;

import java.util.Date;

public class Professor extends Pessoa{
    private float salario;
    private String disciplinas;

    public Professor(String nome, String cpf, int dataNascimento,float salario, String disciplinas) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }
}
