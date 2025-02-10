package Calculadora;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x,y;
        int b,d = 0;
        while (d==0) {
            System.out.println("Bem vindo a calculadora feita em java!\n");
            System.out.println("Digite o seu primeiro número:");
            x = sc.nextFloat();
            System.out.println("Digite o seu segundo número:");
            y = sc.nextFloat();
            System.out.println("Selecione abaixo qual tipo de conta você gostaria de fazer:");
            System.out.println("Você gostaria de fazer uma:\n");
            System.out.println("1- Soma");
            System.out.println("2- Multiplicação");
            System.out.println("3- Subtracao");
            System.out.println("4- Divisão");

            b = sc.nextInt();

            switch (b) {
                case 1:
                    metod.soma(x, y);
                    break;
                case 2:
                    metod.subtracao(x, y);
                    break;
                case 3:
                    metod.multi(x, y);
                    break;
                case 4:
                    if (y != 0) {
                        metod.divi(x, y);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                    break;
                default:
                    System.out.println("Operação inválida! Tente novamente.");

            }
            System.out.println("Gostaria de fazer outra conta?:\n");
            System.out.println("Sim = 1 ou Não = 0 :");
            d = sc.nextInt();

        }
        sc.close();
    }

}
