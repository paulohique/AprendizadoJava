package BancoPOO.Aplication;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA,xB,xC,yA,yB,yC;
        System.out.println("Digite o valor do X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite o valor do Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        //calcula area de X e Y
        double p = (xA + xB + xC)/2;
        double areaX =Math.sqrt( p*(p-xB)*(p-xC));
        p = (yA + yB + yC)/2;
        double areaY =Math.sqrt( p*(p-yB)*(p-yC));

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
