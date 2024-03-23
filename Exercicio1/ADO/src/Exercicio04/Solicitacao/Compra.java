package Exercicio04.Solicitacao;

import java.util.List;
import Exercicio04.Produto.Produto;
import java.util.ArrayList;

public class Compra implements Produto{
    private List<Produto> lista;
    
    public Compra() {
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
