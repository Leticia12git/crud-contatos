package org.example.service;

import org.example.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatosService {
    public static void main(String[] args) {
        List<Contato> contato = new ArrayList<>();

        contato.add(1L,"Leticia", 9999999);
        contato.remove();
    }
}
