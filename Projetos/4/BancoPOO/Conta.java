package BancoPOO;

public class Conta {
    private double saldo; // Saldo
    private int numero;

    // Construtor
    public Conta(double saldoInicial, int numeroConta) {
        this.saldo = saldoInicial;
        this.numero = numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! R$ " + valor + " na conta " + numero);
        } else {
            System.out.println("Não foi possível fazer o depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! R$ " + valor + " da conta " + numero);
        } else {
            System.out.println("Não foi possível fazer o saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
