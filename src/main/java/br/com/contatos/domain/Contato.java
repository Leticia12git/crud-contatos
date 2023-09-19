package br.com.contatos.domain;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numero;
    private String email;

    public Contato() {
    }

    public Contato(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public Contato(String nome, int numero) {
    }

    public String getNome() {
        return nome;
    }



    public int getNumero() {
        return numero;
    }



    public String getEmail() {
        return email;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(numero, contato.numero) && Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero, email);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
