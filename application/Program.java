package application;

import entities.Cliente;
import entities.Plano;
import service.AcademiaService;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AcademiaService service = new AcademiaService();

        while (true) {
            System.out.println("\n=== SISTEMA ACADEMIA ===");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Editar cliente");
            System.out.println("4. Inativar cliente");
            System.out.println("5. Marcar mensalidade como PAGA");
            System.out.println("6. Marcar mensalidade como NÃO PAGA");
            System.out.println("7. Listar inadimplentes");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            int op = sc.nextInt();


            if (op == 0) break; //sai da aplicacao

            switch (op) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    sc.nextLine();

                    System.out.print("Telefone: ");
                    String tel = sc.next();

                    System.out.print("Plano (1=BASICO, 2=PREMIUM): ");
                    int p = sc.nextInt();

                    Cliente c = service.cadastrar(nome, tel, Plano.BASICO);
                    if (p == 2) {
                        c = service.cadastrar(nome, tel, Plano.PREMIUM);
                    } else if (p != 1 && p != 2) {
                        System.out.println("Plano invalido");
                    }

                    System.out.println("Cadastrado: " + c);
                }
                case 2 -> {
                    List<Cliente> clientes = service.listar();
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado");
                    } else {
                        System.out.println(clientes);
                    }
                }
                case 3 -> {
                    System.out.print("ID do cliente: ");
                    int id = sc.nextInt();

                    Cliente c = service.buscarPorId(id);
                    if (c == null) {
                        System.out.println("Cliente não encontrado");
                        break;
                    }

                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Novo telefone: ");
                    String tel = sc.nextLine();

                    System.out.print("Plano (1=BASICO, 2=PREMIUM): ");
                    int p = sc.nextInt();

                    service.editar(id, nome, tel, Plano.BASICO);
                    if (p == 2) {
                        service.editar(id, nome, tel, Plano.PREMIUM);
                    } else if (p != 1 && p != 2) {
                        System.out.println("Plano invalido");
                    }

                    System.out.println(c);
                }
                case 4 -> {
                    System.out.print("ID do cliente: ");
                    int id = sc.nextInt();
                    if(service.inativar(id)){
                        System.out.println("Cliente inativado!");
                    } else {
                        System.out.println("Cliente nao encontrado!");
                    }


                }
                case 5 -> {
                    System.out.print("ID do cliente: ");
                    int id = sc.nextInt();
                    if (service.marcarMensalidade(id, true)){
                        System.out.println("Mensalidade marcada como PAGA!");
                    } else {
                        System.out.println("Cliente nao encontrado");
                    }

                }
                case 6 -> {
                    System.out.print("ID do cliente: ");
                    int id = sc.nextInt();
                    if (service.marcarMensalidade(id, false)){
                        System.out.println("Mensalidade marcada como NÃO PAGA");
                    } else {
                        System.out.println("Cliente nao encontrado!");
                    }

                }
                case 7 -> {
                    List<Cliente> inad = service.listarInadimplentes();
                    if (inad.isEmpty())
                        System.out.println("Nenhum inadimplente encontrado!");
                    else {
                        System.out.println("Inadimplentes:");
                        System.out.println(inad);

                    }
                }
                default -> System.out.println("Opção invAlida");
            }
        }

        System.out.println("Encerrando...");
        sc.close();
    }

}

