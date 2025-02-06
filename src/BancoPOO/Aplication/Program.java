package BancoPOO.Aplication;
import java.util.Scanner;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x,y ;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite o valor do X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite o valor do Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.b = sc.nextDouble();


       // System.out.println("Área do triângulo X: " + String.format("%.2f", area(x)));
        //System.out.println("Área do triângulo Y: " + String.format("%.2f", area(y)));


        //if (area(x) > area(y)) {
         //   System.out.println("O area do triangulo X é maior");
       // }
       // else {
        //    System.out.println("A area do triangulo Y é maior");
        //}
        sc.close();
    }



}
