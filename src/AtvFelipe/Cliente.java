package AtvFelipe;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int cpf; // único
    private String endereco;
    private int telefone;
    private String email;
    private ArrayList<Carro> carros;


    public Cliente(String nome, int cpf, String endereco, int telefone, String email, ArrayList<Cliente> clientes) {
        if (verificarCPF(cpf, clientes) != 0) {
            throw new IllegalArgumentException("Erro: Este CPF já está cadastrado!");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.carros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    // Método para verificar se o CPF já está cadastrado
    public static int verificarCPF(int cpf, ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cpf; // Retorna o CPF encontrado (indicando duplicação)
            }
        }
        return 0; // Retorna 0 caso o CPF não exista
    }

    public void adicionarCarro(Carro carro) {
        this.carros.add(carro);
    }

    String listarCarros() {
        if (carros.isEmpty()) {
            return "O cliente " + nome + " não possui carros cadastrados.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Carros de ").append(nome).append(":\n");
        for (Carro carro : carros) {
            sb.append("- ").append(carro.getModelo()).append(" (")
                    .append(carro.getPlaca()).append(")\n");
        }
        return sb.toString();
    }
    public Carro encontrarCarroPorPlaca(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca() == placa) {
                return carro;
            }
        }
        return null;
    }

    public boolean removerCarro(String placa) {
        Carro carro = encontrarCarroPorPlaca(placa);
        if (carro != null) {
            carros.remove(carro);
            return true;
        }
        return false;
    }


}
