package Facade.Exercicio2.Produto;

public class ItemPedido {
    
    private int quantidade;
    private Produto produto;

    public ItemPedido(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }
}