package BancoPOO;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso!");
    }

    public void exibirSaldo() {
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Conta " + (i + 1) + " - Saldo R$ " + contas.get(i).getSaldo());
        }
    }
}
