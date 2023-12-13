/*Crie um programa em Java que leia dois vetores de 20 posições e calcule um outro
vetor contendo, nas posições pares os valores do primeiro e nas posições impares os
valores do segundo.*/

import java.util.Scanner;

/**
 * Exercicio02
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
           System.out.print("Digite um valor para inserir no vetorA: "); 
           vetorA[i] = sc.nextInt();

        }
        for (int i = 0; i < vetorB.length; i++) {
           System.out.print("Digite um valor para inserir no vetorB: "); 
           vetorB[i] = sc.nextInt();

        }
        int indiceA = 0; int indiceB = 0;

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = i % 2 == 0 ? vetorA[indiceA++] : vetorB[indiceB++];
        }
        System.out.print("Vetor C [");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("%d;", vetorC[i]);
        }
        System.out.println("]");
        sc.close();
    }
}
