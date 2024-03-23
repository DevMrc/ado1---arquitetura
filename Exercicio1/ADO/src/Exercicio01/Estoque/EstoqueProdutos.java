package Exercicio01.Estoque;

import java.util.List;
import Exercicio01.Itens.Produto;
import java.util.ArrayList;

public class EstoqueProdutos implements Estoque{
    private List<Produto> lista;

    public EstoqueProdutos(){
        lista = new ArrayList<>();
    }

    @Override
    public void carregarProdutos() {
        lista.add(new Produto(1, 10.0, "Alimento"));
        lista.add(new Produto(2, 30.0, "Eletronico"));
        lista.add(new Produto(3, 50.0, "Limpeza"));
        
    }

    @Override
    public boolean remove(int id, int quantidade) {
        return false;
    }

    @Override
    public List verEstoque() {
        
        return lista;
    }

}
