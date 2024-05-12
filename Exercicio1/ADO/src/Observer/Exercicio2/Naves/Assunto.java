package Observer.Exercicio2.Naves;

import Observer.Exercicio2.Observador.*;
import Observer.Exercicio2.Acao.*;

public interface Assunto {
    
    public void adicionar(Observador observador);
    public void notificar();
    public void setAcao(Acao acao);
    public void remover(Observador observador);
   
} 