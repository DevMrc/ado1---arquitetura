package Exercicio04.Solicitacao;

import Exercicio04.Produto.*;;

public class Pedido {
    private String nomeCliente;
    private Produto lista;
    private int pedido;
    private double totalCompra;
    
    public Pedido(String nomeCliente, Produto produto1, int pedido, double totalCompra) {
        this.nomeCliente = nomeCliente;
        this.lista = produto1;
        this.pedido = pedido;
        this.totalCompra = totalCompra;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
  
    public Produto getLista() {
        return lista;
    }
 
    public int getPedido() {
        return pedido;
    }
  
    public double getTotalCompra() {
        return totalCompra;
    }
    
    @Override
    public String toString() {
        return "Pedido [nomeCliente=" + nomeCliente + ", lista=" + lista + ", pedido=" + pedido + ", totalCompra="
                + totalCompra + "]";
    }
}
