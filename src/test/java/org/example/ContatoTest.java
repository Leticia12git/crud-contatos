package org.example;

import org.example.model.Contato;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ContatoTest {

    private Contato contato;

    @AfterEach
    public void instanciaContato() {
        Contato contato = new Contato();
    }


    @Test
    void buscarUmContato() {
        instanciaContato();
        buscarUmContato();
    }


    @Test
    void cadastraContato() {
        instanciaContato();
        contato.setNome("Leticia");
        contato.setNumero(999999999);
        cadastraContato();

    }

    @Test
    void atualizarContato() {
        instanciaContato();
        contato.setNome("Rafael");
        contato.setNumero(888888888);
        atualizarContato();
    }

    @Test
    void deletarContato() {
        instanciaContato();
        contato.getId();
        deletarContato();
    }

}