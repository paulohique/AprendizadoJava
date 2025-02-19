package Atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Coloque o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Nome do dono da conta:");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Terá depósito inicial? (S/N)");
        char deposito = sc.next().charAt(0);

        if (deposito == 's' || deposito == 'S') {
            System.out.println("Coloque o valor do depósito inicial: ");
            double valor = sc.nextDouble();
            conta = new Conta(numero, nome, valor);
        } else {
            conta = new Conta(numero, nome);
        }

        System.out.println("Conta criada com sucesso: " + conta);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor para depositar: ");
                double valor = sc.nextDouble();
                conta.depositar(valor);
                System.out.printf("Depósito realizado! Saldo atual: %.2f%n", conta.getSaldo());
                System.out.println(conta);
            }
            else if (opcao == 2) {
                System.out.println("Digite o valor para saque: ");
                double valor = sc.nextDouble();
                conta.sacar(valor);
                System.out.printf("Saque realizado! Saldo atual: %.2f%n", conta.getSaldo());
                System.out.println(conta);
            }
            else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("Obrigado por usar nosso sistema!");
        sc.close();
    }
}
