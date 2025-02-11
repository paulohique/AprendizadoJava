package ConvertDolar;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        double preco,compras;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual e o preço do dolar?: ");
        preco = sc.nextDouble();
        CurrencyConverter.dolar(preco);
        System.out.println("Quantos dolars gostaria de comprar?");
        compras = sc.nextDouble();
        CurrencyConverter.quantidade(compras);
        System.out.println("Total que sera pago em reais: R$: " + CurrencyConverter.valorTotal(preco,compras)+ "\nCom o imposto desclarado encima do dolar no preço de 6%, no valor de: " + CurrencyConverter.percent(preco,compras));
        sc.close();



    }
}
