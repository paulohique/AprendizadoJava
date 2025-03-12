package AtividadeFelipe2.Package;

public class Aluno  extends Pessoa{
    private int matricula;



    public Aluno(String nome, String cpf, int dataNascimento, int matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    @Override
    public double tirarCopias(int numeroCopias){
        return numeroCopias * 0.5;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
