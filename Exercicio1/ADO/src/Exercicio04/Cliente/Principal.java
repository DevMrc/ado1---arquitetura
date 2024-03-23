package Exercicio04.Cliente;


import Exercicio04.Folha.Folha;
import Exercicio04.Produto.*;
import Exercicio04.Solicitacao.*;


public class Principal {
    public static void main(String[] args) {
      
        Produto produto1 = new Folha("Banana", 5);
        Produto produto2 = new Folha("Ovo", 10);
        Produto produto3 = new Folha("Pão", 15);

        CaixaProduto caixa = new CaixaProduto();
        caixa.adicionar(produto1);
        caixa.adicionar(produto2);
        caixa.adicionar(produto3);

        Compra carrinho = new Compra();
        carrinho.adicionar(produto1);
        carrinho.adicionar(caixa);

        double total = carrinho.getPreco();
       
        Pedido pedido = new Pedido("João", produto1, 1,total );


        System.out.println("Nome do Cliente: " + pedido.getNomeCliente());
        System.out.println("Número do Pedido: " + pedido.getPedido());
        System.out.println("Total da Compra: " + total);
    }

}
