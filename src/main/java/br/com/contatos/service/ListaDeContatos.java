package br.com.contatos.service;

import br.com.contatos.model.Contato;

import java.util.ArrayList;
import java.util.Scanner;


public class ListaDeContatos{

    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("*************************");

        System.out.println("AGENDA DE CONTATOS");

        System.out.println("*************************");

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite um telefone: ");
        String numero = sc.nextLine();
        System.out.print("Digite um email: ");
        String email = sc.nextLine();

        System.out.println("Contato cadastrado com sucesso!");
        System.out.println();

        Contato contato1 = new Contato("Leticia", "999999999", "leticia@gmail.com");
        Contato contato2 = new Contato("","","");
        Contato contato3 = new Contato("","","");
        Contato contato4 = new Contato("","","");

        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);


        contatos.size();

        contatos.remove(1);

        for (int i = 0; i < contatos.size() ; i++) {
            System.out.println(contatos);

            sc.close();
        }
    }


}
