package Aula2POO;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sistem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do aluno " + (i + 1) + ":");

            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Digite o CPF do aluno (somente números): ");
            Integer cpf = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite a Data de nascimento do aluno (dd/MM/yyyy): ");
            Date dataNascimento = null;
            while (dataNascimento == null) {
                String dataNascimentoStr = sc.nextLine();
                try {
                    dataNascimento = sdf.parse(dataNascimentoStr);
                } catch (Exception e) {
                    System.out.println("Formato de data inválido! Use dd/MM/yyyy:");
                }
            }

            System.out.print("Digite o email do aluno: ");
            String email = sc.nextLine();


            alunos[i] = new Aluno(nome, cpf, dataNascimento, email);
        }


        System.out.println("\nAlunos cadastrados:"+ alunos);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " | CPF: " + aluno.getCpf() +
                    " | Nascimento: " + sdf.format(aluno.getDataNascimento()) +
                    " | Email: " + aluno.getEmail());
        }

        sc.close();
    }
}
