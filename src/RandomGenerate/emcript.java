package RandomGenerate;

import java.util.Random;

class Emcript {
    private int tamanho;

    public Emcript(int tamanho) {
        this.tamanho = tamanho;
    }

    public String gerarSenha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder senha = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < tamanho; i++) {
            int index = rand.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        return senha.toString();
    }
}
