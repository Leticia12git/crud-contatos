package org.example;

import org.example.model.Contato;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        ArrayList<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato(1L, "Leticia", 99999999);
        Contato contato2 = new Contato(2L, "Rafael", 888888888);
        Contato contato3 = new Contato(3L, "Larissa", 777777777);
        Contato contato4 = new Contato(4L, "Fernando", 666666666);
        Contato contato5 = new Contato(5L, "Aparecida", 444444444);

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);

        contatos.add(new Contato(contato1.getId(), contato1.getNome(), contato1.getNumero()));
        contatos.add(new Contato(contato2.getId(), contato2.getNome(), contato2.getNumero()));
        contatos.add(new Contato(contato3.getId(), contato3.getNome(), contato3.getNumero()));
        contatos.add(new Contato(contato4.getId(), contato4.getNome(), contato4.getNumero()));
        contatos.add(new Contato(contato5.getId(), contato5.getNome(), contato5.getNumero()));

        contatos.remove(contato1);

        for (Contato c : contatos) {
            System.out.println(c.getNome());
        }

    }
}