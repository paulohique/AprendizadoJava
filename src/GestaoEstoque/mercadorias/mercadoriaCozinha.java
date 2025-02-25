package GestaoEstoque.mercadorias;

public class mercadoriaCozinha extends Mercadorias{
    private String categoria;
    private int id;

    public mercadoriaCozinha(int quantidadeEstoque, String nome, double preco, int quantidadeTotal, String categoria, int id) {
        super(quantidadeEstoque, nome, preco, quantidadeTotal);
        this.categoria = categoria;
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
