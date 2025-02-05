package BancoPOO.Aplication;
import java.util.Scanner;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x,y ;
        Triangle x = new Triangle()
        Triangle y = new Triangle()

        System.out.println("Digite o valor do X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite o valor do Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.b = sc.nextDouble();
        //calcula area de X e Y
        double p = (x.a + x.b + x.c)/2;
        double areaX =Math.sqrt( p*(p-x.a)*(p-x.b)*(p-x.c));
        p = (y.a + y.b + y.c)/2;
        double areaY =Math.sqrt( p*(p-y.a)*(p-y.b)*(p-y.c));

        System.out.println("Área do triângulo X: " + String.format("%.2f", areaX));
        System.out.println("Área do triângulo Y: " + String.format("%.2f", areaY));


        if (areaX > areaY) {
            System.out.println("O area do triangulo X é maior");
        }
        else {
            System.out.println("A area do triangulo Y é maior");
        }
        sc.close();
    }

}
