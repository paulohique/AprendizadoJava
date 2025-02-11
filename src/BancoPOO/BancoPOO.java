package BancoPOO;

import java.util.Scanner;

public class BancoPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Gostaria de criar uma conta? (sim/não)");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Informe o nome da conta: ");
            String nomeConta = sc.nextLine();

            System.out.println("Informe o número da conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do Scanner

            // Criar a conta com saldo inicial 0
            Conta novaConta = new Conta(0, numeroConta);
            banco.adicionarConta(novaConta);
            System.out.println("Conta criada com sucesso para " + nomeConta + "!");
        }

        // Criar contas pré-existentes
        Conta conta1 = new Conta(1000, 1203);
        Conta conta2 = new Conta(500, 120);

        // Adicionar contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Realizar operações
        conta1.depositar(200);
        conta2.sacar(100);

        // Exibir saldos
        banco.exibirSaldo();

        sc.close(); // Fechar o Scanner ao final
    }
}
