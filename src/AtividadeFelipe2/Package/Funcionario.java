package AtividadeFelipe2.Package;

import java.util.Date;

public class Funcionario extends Pessoa{
    private float salario;
    private int dataAdimicao;
    private String cargo;


    public Funcionario(String nome, String cpf, int dataNascimento,float salario, int dataAdimicao, String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdimicao = dataAdimicao;
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getDataAdimicao() {
        return dataAdimicao;
    }

    public void setDataAdimicao(int dataAdimicao) {
        this.dataAdimicao = dataAdimicao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
