package Exercicio04.Folha;

import Exercicio04.Produto.Produto;

public class Folha implements Produto{
    private double preco;
    private String nome;

    public Folha(){

    }

    public Folha(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
    
}

