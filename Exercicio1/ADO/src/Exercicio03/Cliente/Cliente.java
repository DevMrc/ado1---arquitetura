package Exercicio03.Cliente;

import java.util.Scanner;

import Exercicio03.Funcionalidades.Func;

public class Cliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha um algoritmo de ordenação: 1 - Insertion Sort, 2 - Selection Sort, 3 - Bubble Sort");
        int i = ler.nextInt();  
        int[] z = new int[3];
        z[0] = 2;
        z[1] = 7;
        z[2] = 1;

        try {
            Func.values()[i - 1].curto(z);

            System.out.println("Array após a ordenação:");
            for (int num : z) {
                System.out.print(num + " ");
                }
                    System.out.println();
            } 

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } 

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Opção inválida. Por favor, escolha 1 para Insertion Sort, 2 para Selection Sort, ou 3 para Bubble Sort.");
        }
    }
}

