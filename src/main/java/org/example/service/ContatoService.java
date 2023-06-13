package org.example.service;

import org.example.model.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContatoService {

    public static void main(String[] args) {

        List<String> contatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[5];
        int[] telefone = new int[5];

        String opcao = "";
        String continuar;
        int posicao = 0;

        do {
            System.out.println("Digite a opcao desejada: cadastrar , mostrar, excluir, sair ");
            opcao = sc.nextLine();
            switch (opcao) {
                case "cadastrar":
                    System.out.println("Digite o nome: ");
                    nome[posicao] = sc.nextLine();
                    System.out.println("Digite um numero de telefone: ");
                    telefone[posicao] = sc.nextInt();
                    System.out.println("Deseja adicionar mais um contato");
                    continuar = sc.nextLine();
                    posicao++;

            } while (continuar.equals("Sim"))
                    break;
                case "mostrar":
                    for (int i = 0; i < 5; i++) {
                        if (!nome[i].equals("")){

                        System.out.println("Nome: " + nome[i]+ " " + "Telefone: " + telefone[i]);
                    }
                    break;
                case "excluir":
                    break;
                case "sair":
                    System.out.println("Programa finalizado!");
                    return;
                    break;
                default:
                    System.out.println("Opção Inválida !");
                    break;
            }
        } while (opcao.equals("sair"));


    }




}

