package Atividade1;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;



    public Conta(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        depositar(depositoInicial);
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= (valor + 5);
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }

    public  String toString(){
        return "Dados bancarios: Conta numero= " + numero + ", nome= " + nome + ", saldo= " + saldo ;
    }

}
