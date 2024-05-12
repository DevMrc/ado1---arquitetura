package Observer.Exercicio1;

import Observer.Exercicio1.Aluno.*;
import Observer.Exercicio1.Mestres.*;

public class Principal {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("João");
        
        aluno.setP1(8.0);
        aluno.setP2(9.5);

        System.out.println(aluno);
    }
}