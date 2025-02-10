package NotaAluno;

// ler 3 notas aluno, 30, 35,35.
// ao final, mostrar qual nota final do aluno, falando se está aprovado ou não, 60% pass, failed se for negativo ( falar quantos pontos faltam pra 60)
public class Aluno {
    public String nome;
    public double[] nota;
    public boolean aproved ;

    public Aluno(){
        nota = new double[3];
    }

    public  double notaAluno(){
        return (nota[0]+nota[1]+nota[2]);
    }
    public void aprovado(double notaAluno){
        if(notaAluno>=60){
            aproved = true;
            System.out.println("Aluno aprovado com sucesso!");
        }
        else {
        double pontosFaltando = 60 - notaAluno;
        System.out.printf("Aluno reprovado! Faltam %.1f pontos para aprovação.\n", pontosFaltando);
        aproved = false;}
    }
}
