package Salario;

public class Empregado {

    public String nome;
    public double salario;
    public double taxa;

    public double netSalary(){
        return salario - taxa;
    }
    public double increaseSalary( double percent){
        return salario = percent * salario;
    }
}

