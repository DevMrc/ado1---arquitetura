package Observer.Exercicio3;

import Observer.Exercicio3.Agencia.*;
import Observer.Exercicio3.Assinante.*;

public class Principal {
    public static void main(String[] args) {

        Agencia agencia = new Agencia();
        
        agencia.adicionarAssinante(new Assinante1());
        agencia.adicionarAssinante(new Assinante2());
        agencia.adicionarAssinante(new Assinante3());

        agencia.setVaga("Desenvolvedor Java");
        agencia.setVaga("Analista de Sistemas");
        
    }
}
