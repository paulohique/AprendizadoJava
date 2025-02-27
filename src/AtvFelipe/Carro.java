package AtvFelipe;

import java.util.ArrayList;
import java.util.Scanner;

import static AtvFelipe.Cliente.encontrarClientePorCPF;
import static AtvFelipe.Main.clientes;
import static AtvFelipe.Main.scanner;

public class Carro {
    private String placa;
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private String cor;
    private int potencia;
    private double valorMercado;

    public Carro(String placa, String modelo, String marca, int anoFabricacao, String cor, int potencia, double valorMercado) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.potencia = potencia;
        this.valorMercado = valorMercado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }
    public void imprimirInfo(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println(("Ano Fabricacao: " + this.anoFabricacao));
        System.out.println("Cor: " + this.cor);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Valor Mercado: " + this.valorMercado);

    }
    public static void listarCarros() {

        System.out.print("Digite o CPF do cliente: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = encontrarClientePorCPF(cpf, clientes);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.println(cliente.listarCarros());
    }
}
