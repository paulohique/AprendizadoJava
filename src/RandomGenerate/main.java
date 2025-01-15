package RandomGenerate;
import java.util.Random;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        int numero, valor = 1;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (valor == 1) {
            System.out.println("Bem vindo ao gerador de senha automático.\n Gostaria de gerar uma senha de quantos characters?");
            numero = sc.nextInt();

            Emcript emcript = new Emcript(numero);
            String senhaGerada = emcript.gerarSenha();
            System.out.println("Sua senna gerada é : " + senhaGerada);
            System.out.println("\n\nGostaria de gerar outra senha?");
            System.out.println("Sim = 1\nNão = 0");
            valor = sc.nextInt() ;
        } ;


    }
}


