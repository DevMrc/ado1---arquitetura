package Exercicio02.ClassThr;

import Exercicio02.Singleton.Singleton;

public class ClasseThr extends Thread{
    @Override
    public void run(){
        Singleton singleton = Singleton.pegaObj();
        System.out.println(singleton);
    }

}
