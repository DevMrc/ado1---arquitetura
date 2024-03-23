package Exercicio02.MultiThr;

import Exercicio02.ClassThr.ClasseThr;

public class Main {
    public static void main(String[] args) {
        ClasseThr objeto1 = new ClasseThr();
        ClasseThr objeto2 = new ClasseThr();

        objeto1.start();
        objeto2.start();

        System.out.println(objeto1);
        System.out.println(objeto2);
    }
}
