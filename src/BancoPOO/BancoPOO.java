package BancoPOO;

public class BancoPOO {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criar contas
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
    }
}
