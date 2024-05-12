package Facade.Exercicio2;

import Facade.Exercicio2.Loja.LojaFacade;
import Facade.Exercicio2.Produto.Pedido;
import Facade.Exercicio2.Produto.Produto;

public class Main {
    public static void main(String[] args) {
        
        LojaFacade loja = new LojaFacade();

        Produto produto1 = loja.criarProduto(1, 100.0, "Categoria1");
        Produto produto2 = loja.criarProduto(2, 200.0, "Categoria2");

        loja.adicionarEstoque(produto1, 10);
        loja.adicionarEstoque(produto2, 20);

        Pedido pedido = loja.criarPedido();
        loja.adicionarItem(pedido, produto1, 1);
        loja.adicionarItem(pedido, produto2, 2);

        
        loja.imprimirProdutos();
        loja.imprimirPedidos();
    }
}