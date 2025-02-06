package BancoPOO.Estoque;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public  double totalValorStock(Produto produto){
        return preco*quantidade;

    }
    public  void addProduto(int quantidade){
        this.quantidade += quantidade;

    }
    public void removeProduto(int quantidade){
        this.quantidade -= quantidade;

    }
}
