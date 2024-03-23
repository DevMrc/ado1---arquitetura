package Exercicio01.Estoque;

import java.util.List;

public interface Estoque {

    public void carregarProdutos();

    public boolean remove(int id, int quantidade);

    public List verEstoque();
} 
