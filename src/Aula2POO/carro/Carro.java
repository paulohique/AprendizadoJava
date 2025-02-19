package Aula2POO.carro;

import java.util.Date;
import java.util.Objects;

public class Carro {
    private int ano;
    private String nome;
    private String marca;
    private int km;
    private String cor;
    private double potencia;
    private static int quantidadeCarros = 0;


    public Carro(int ano, String nome, String marca, int km, String cor, double potencia){
        this.ano = ano;
        this.nome = nome;
        this.marca = marca;
        this.km = km;
        this.cor = cor;
        this.potencia = potencia;
        quantidadeCarros = quantidadeCarros + 1;
    }

    public int getQuantidadeCarros() {
        return quantidadeCarros;
    }

    public void setQuantidadeCarros(int quantidadeCarros) {
        this.quantidadeCarros = quantidadeCarros;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void verificaAnoCarro(){
        if (this.ano<2010){
            System.out.println("O carro "+ this.nome + "ano "+this.ano+"é antijo");

        }
        else {
            System.out.println("O carro "+ this.nome + "ano "+this.ano+"é recente");
        }
    }
    public static void jetQuantidadeCarros(){
        System.out.println("A Quantidade de carros são: " + quantidadeCarros);
    }
    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", km=" + km +
                ", cor='" + cor + '\'' +
                ", potencia='" + potencia + '\'' +
                ", quantidadeCarros=" + quantidadeCarros +
                '}';
    }
}
