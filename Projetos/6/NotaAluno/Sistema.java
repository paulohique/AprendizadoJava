package NotaAluno;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        NotaAluno.Aluno aluno = new NotaAluno.Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        aluno.nota[0] = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        aluno.nota[1] = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        aluno.nota[2] = sc.nextDouble();

        double v = aluno.notaAluno();
        System.out.println("O aluno " + aluno.nome + " tem " + v + " pontos no total.");

        aluno.aprovado(v);
        sc.close();
    }
}
