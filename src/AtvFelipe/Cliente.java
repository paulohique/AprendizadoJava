package AtvFelipe;

import java.util.ArrayList;

import static AtvFelipe.Main.clientes;
import static AtvFelipe.Main.scanner;

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

    public static Cliente encontrarClientePorCPF(int cpf, ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        return null;
    }
    static void alterarCarro() {
        System.out.print("Digite o CPF do cliente: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = encontrarClientePorCPF(cpf,clientes);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Digite a placa do carro a ser alterado: ");
        String placa = scanner.nextLine();

        Carro carro = cliente.encontrarCarroPorPlaca(placa);
        if (carro == null) {
            System.out.println("Carro não encontrado!");
            return;
        }

        System.out.print("Novo modelo: ");
        carro.setModelo(scanner.nextLine());
        System.out.print("Nova marca: ");
        carro.setMarca(scanner.nextLine());
        System.out.print("Novo ano de fabricação: ");
        carro.setAnoFabricacao(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nova cor: ");
        carro.setCor(scanner.nextLine());
        System.out.print("Nova potência (cv): ");
        carro.setPotencia(scanner.nextInt());
        System.out.print("Novo valor de mercado: ");
        carro.setValorMercado(scanner.nextDouble());

        System.out.println("Carro atualizado com sucesso!");
    }
    public static void listarClientes(ArrayList<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Clientes ===");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("--------------------------");
        }
    }

    public static void removerCarro() {
        System.out.print("Digite o CPF do cliente: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = encontrarClientePorCPF(cpf,clientes);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Digite a placa do carro a ser removido: ");
        String placa = scanner.nextLine();

        boolean removido = cliente.removerCarro(placa);
        if (removido) {
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Carro não encontrado!");
        }
    }
}
