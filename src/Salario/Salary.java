package Salario;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empregado empregado = new Empregado();
        double salarios,percentage;
        System.out.println("Digite o nome do empregado: ");
        empregado.nome = sc.nextLine();
        System.out.println("Digite o salario do empregado: ");
        empregado.salario = sc.nextDouble();
        System.out.println("Digite a taxa do empregado: ");
        empregado.taxa = sc.nextDouble();

        System.out.println("O salario do empregado é: " + empregado.salario + "O nome do empregado é: " + empregado.nome + "E a taxa do empregado é: " + empregado.taxa);
        salarios = empregado.netSalary();
        System.out.println("O salario do empregado menos a taxa é: " + salarios);
        System.out.println("Qual porcentagem que é para aumentar o salário? ");
        percentage = sc.nextDouble();
        empregado.increaseSalary( percentage);
        System.out.println("O salario atualizado é: " + ( salarios + empregado.salario) );
        sc.close();

    }
}
