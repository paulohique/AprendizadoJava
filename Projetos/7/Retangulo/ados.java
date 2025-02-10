package Retangulo;
import java.util.Scanner;
import java.util.Locale;
public class ados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double b,c,d;
        Retangulo a;
        a = new Retangulo();


        System.out.println("Digite o valor  da altura do retangulo: ");
        a.height =  sc.nextDouble();
        System.out.println("Digite o valor da largura do retangulo: ");
        a.width = sc.nextDouble();
        System.out.println("Aqui abaixo estão: ");
        b = a.Area();
        c = a.Perimetro();
        d = a.Diagonal();

        System.out.println("A area do retangulo é: \n" + b);
        System.out.println("O perimetro do retangulo é: \n" + c);
        System.out.println("O Diagonal do retangulo é: \n" + d);
        sc.close();
        ;
    }
}
