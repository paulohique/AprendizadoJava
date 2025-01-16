package project;

import java.util.Scanner;
// Operadora cobra 50 $ por um plano de 100min/ cada minuto dps cobra 2 $ a mais
public class main {
    public static void main(String[] args) {
        int x,preco = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos minutos de telefone você usou?");
        x = sc.nextInt();
        if(x > 100){
            preco = (x - 50) * 2;
        }
        System.out.println("Você tem que pagar $:"+ preco);
    }
}

