package br.com.contatos.service;

import br.com.contatos.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoService {

    private List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato){
        contatos.add(contato);
        this.adicionar(contato);
    }

    public void buscar(Contato contato){
        contatos.addAll(contatos);
        this.buscar(contato);
    }

    public void atualizar(Contato contato){
        contato.getNome();
        contato.getEmail();
        contato.getNumero();
        this.atualizar(contato);
    }

    public void deletar(Contato contato){
        this.deletar(contato);
    }
}

