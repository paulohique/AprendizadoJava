package AtividadeFelipe2;

import AtividadeFelipe2.Package.Aluno;
import AtividadeFelipe2.Package.Professor;
import AtividadeFelipe2.Package.Funcionario;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", "12345678900", 20030612, 210321);
        Professor professor = new Professor("Carlos", "98765432100", 19801205, 5000.00f, "Matemática");
        Funcionario funcionario = new Funcionario("Maria", "45678912300", 19951015, 2500.00f, 20220110, "Secretária");


        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Valor para 1000 cópias: " + aluno.tirarCopias(1000) + " R$");
        System.out.println();

        // Impressão dos dados do Professor
        System.out.println("Dados do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Data de Nascimento: " + professor.getDataNascimento());
        System.out.println("Salário: " + professor.getSalario()+ " R$");
        System.out.println("Disciplinas: " + professor.getDisciplinas());
        System.out.println("Valor para 1000 cópias: " + professor.tirarCopias(1000) + " R$");
        System.out.println();

        // Impressão dos dados do Funcionário
        System.out.println("Dados do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Salário: " + funcionario.getSalario()+ " R$");
        System.out.println("Data de Admissão: " + funcionario.getDataAdimicao());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Valor para 1000 cópias: " + funcionario.tirarCopias(1000) + " R$");
    }
}
