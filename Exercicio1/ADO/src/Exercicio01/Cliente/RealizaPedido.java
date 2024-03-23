package Exercicio01.Cliente;

import Exercicio01.Estoque.EstoqueProdutos;
import Exercicio01.Itens.*;

public class RealizaPedido {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.carregarProdutos();

        Produto produto1 = new Produto(1, 25.0, "Alimento");
        Produto produto2 = new Produto(2, 50.0, "Eletronico");
        Produto produto3 = new Produto(3, 100.0, "Limpeza");

        Pedido pedido = new Pedido();
        ItemPedido itemPedido1 = new ItemPedido(23, produto1);
        ItemPedido itemPedido2 = new ItemPedido(50, produto2);
        ItemPedido itemPedido3 = new ItemPedido(26, produto3);

        pedido.adicionarItem(itemPedido1);
        pedido.adicionarItem(itemPedido2);
        pedido.adicionarItem(itemPedido3);

        pedido.cupomFiscal();

        System.out.println(estoque.verEstoque());

    }
}
