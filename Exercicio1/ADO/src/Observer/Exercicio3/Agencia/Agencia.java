package Observer.Exercicio3.Agencia;

import java.util.List;
import java.util.ArrayList;

import Observer.Exercicio3.Assinante.*;

public class Agencia {
    
    private List<Assinante> assinantes = new ArrayList<>();
    private String vaga;

    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
        notificarAssinantes();
    }

    private void notificarAssinantes() {
        for (Assinante assinante : assinantes) {
            assinante.atualizar(vaga);
        }
    }
}