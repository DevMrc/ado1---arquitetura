package State;

import State.Estados.Acao;

public class Gerenciador {
    public static void main(String[] args) {

        Acao acao=new Acao("Criar relatorio da sprint");

        acao.Pular();
        acao.Pular();

        System.out.println(acao);

      }
}