package Exercicio04.Produto;

import java.util.List;
import java.util.ArrayList;


public class CaixaProduto implements Produto{
    private List<Produto> lista;

    public CaixaProduto() {
        this.lista = new ArrayList<>();
    }
    public void adicionar(Produto lista) {
        this.lista.add(lista);
    }
    public void remover(Produto lista) {
        this.lista.remove(lista);
    }

    @Override
    public double getPreco() {
      double total= 0;
      for(Produto produto : lista){
        total += produto.getPreco();
      }
      return total;
    }

}
