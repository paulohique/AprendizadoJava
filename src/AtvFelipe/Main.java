package AtvFelipe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Carro para Cliente");
            System.out.println("3. Listar Carros de um Cliente");
            System.out.println("4. Remover Carro de um Cliente");
            System.out.println("5. Alterar Dados de um Carro");
            System.out.println("6. Listar Todos os Clientes");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarCarro();
                    break;
                case 3:
                    listarCarros();
                    break;
                case 4:
                    removerCarro();
                    break;
                case 5:
                    alterarCarro();
                    break;
                case 6:
                    listarClientes();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 7);
    }

    private static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        try {
            Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email, clientes);
            clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Cliente encontrarClientePorCPF(int cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        return null;
    }

    private static void cadastrarCarro() {
        System.out.print("Digite o CPF do cliente: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = encontrarClientePorCPF(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano de fabricação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Potência (cv): ");
        int potencia = scanner.nextInt();
        System.out.print("Valor de mercado: ");
        double valor = scanner.nextDouble();

        Carro carro = new Carro(placa, modelo, marca, ano, cor, potencia, valor);
        cliente.adicionarCarro(carro);
        System.out.println("Carro cadastrado com sucesso para " + cliente.getNome());
    }

    private static void listarCarros() {
        System.out.print("Digite o CPF do cliente: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = encontrarClientePorCPF(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.println(cliente.listarCarros());
    }

    private static void removerCarro() {
        System.out.print("Digite o CPF do cliente: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = encontrarClientePorCPF(cpf);
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

    private static void alterarCarro() {
        System.out.print("Digite o CPF do cliente: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = encontrarClientePorCPF(cpf);
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

    private static void listarClientes() {
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
}
