package GestaoEstoque.mercadorias;

public class Mercadorias {
        private int quantidadeEstoque;
        private String nome;
        private double preco;
        private int quantidadeTotal;

    public Mercadorias(int quantidadeEstoque, String nome, double preco, int quantidadeTotal) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeTotal = quantidadeTotal;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }
}
