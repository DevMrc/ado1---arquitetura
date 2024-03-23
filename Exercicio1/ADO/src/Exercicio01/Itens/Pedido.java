package Exercicio01.Itens;

import java.util.List;
import java.util.ArrayList;

public class Pedido  extends ItemPedido{

    private double valor;
    private List<ItemPedido> itemPedidos;
    public String get;

    public Pedido() {
        super(0, null);
        itemPedidos = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido itemPedido) { 
        itemPedidos.add(itemPedido);
        valor += itemPedido.getPedido().getPreco()* itemPedido.getQuantidade();
    }

    public double calcularTotal() {
        return this.valor;
    }

    public void cupomFiscal(){
        System.out.println("Cupom fiscal");
        for (ItemPedido item : itemPedidos) {
            System.out.println("Produto: " + item.getPedido().getCodigo() +", Quantidade: " 
            + item.getQuantidade() + ", Preço: " + item.getPedido().getPreco() + ", Categoria: " + item.getPedido().getCategoria());
        }
        System.out.println("Total: " + calcularTotal());
    }
    
}
