package BancoPOO.Estoque;
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
        System.out.println("O nome do produto cadastrado: " + produto.nome +"\nQuantidade :" + produto.quantidade +" \nNo preço de: " + produto.preco);
    }
}
