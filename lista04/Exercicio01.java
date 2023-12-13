//Crie um programa em Java que leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[40];
        int pares = 0;

        for (int i = 0; i < valores.length; i++) {
           System.out.print("Digite um valor: "); 
           valores[i] = sc.nextInt();

           if (valores[i] % 2 == 0) {
               pares++;
           }
        }
        System.out.println("O vetor contem " + pares + " valores pares.");

        sc.close();
    }
}
