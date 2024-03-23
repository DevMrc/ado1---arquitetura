package Exercicio01.Itens;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(){
    }

    public ItemPedido(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto getPedido() {
        return produto;
    }


    public int getQuantidade() {
        return quantidade;
    }
}
