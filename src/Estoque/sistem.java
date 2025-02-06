package Estoque;
import java.util.Scanner;
import java.util.Locale;
public class sistem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Digite o nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        produto.preco = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        produto.quantidade = sc.nextInt();
        System.out.println("O produto " + produto.nome + " tem " + produto.quantidade + " no valor de: "+produto.preco);
        System.out.println("Gostaria de alterar a quantidade do produto?");
        System.out.println("Adicione aqui a quantidade:" );
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
        System.out.println("Quantidade atualizada: " + produto.quantidade);
        System.out.println("Gostaria de remover a quantidade do produto?");
        System.out.println("Adicione aqui a quantidade:" );
        quantidade = sc.nextInt();
        produto.removeProduto(quantidade);
        System.out.println("Quantidade atualizada: " + produto.quantidade);
        System.out.println("Gostaira de saber o total do valor em stock?");
        double estoque = produto.totalValorStock(produto);
        System.out.println("O valor total em stock é: " + estoque);
        sc.close();
    }
}
