package org.example.service;

import org.example.model.Contato;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaDeContatos {

    public static void main(String[] args) {

        Map<String, Contato> contato = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Consultar contato");
            System.out.println("3. Atualizar contato");
            System.out.println("4. Remover contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarContato(scanner);
                    break;
                case 2:
                    consultarContato(scanner);
                    break;
                case 3:
                    atualizarContato(scanner);
                    break;
                case 4:
                    removerContato(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        } while (opcao != 5);

        scanner.close();
    }

    private static void adicionarContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.next();
        System.out.print("Digite o número de telefone do contato: ");
        int numero = scanner.nextInt();

        Contato contato = new Contato(nome, numero);
        contato.put(nome, contato);

        System.out.println("Contato adicionado com sucesso!");
    }

    private static void consultarContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.next();

        Contato contato = contato.get(nome);

        if (contato != null) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getNumero());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private static void atualizarContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.next();

        Contato contato = contato.get(nome);

        if (contato != null) {
            System.out.print("Digite o novo número de telefone: ");
            int novoNumero = scanner.nextInt();
            contato.setNumero(novoNumero);

            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private static void removerContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.next();

        Contato contato = contato.remove(nome);

        if (contato != null) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}


