package org.example;

import org.example.model.Contato;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ContatoTest {

    @Test
    public void buscarUmContato() {
        Contato contato = new Contato();
        buscarUmContato();
    }


    @Test
    public void cadastraContato() {
        List<Contato> cadastrar = new ArrayList<>();
        cadastrar.add(new Contato(1L, "Leticia", 999999999));
        cadastraContato();

    }

    @Test
    public void atualizarContato() {
        Contato contato = new Contato();
        atualizarContato();
    }

    @Test
    public void deletarConato() {
        Contato contato = new Contato();
        deletarConato();
    }

}