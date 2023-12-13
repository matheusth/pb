/*Escreva um algoritmo que receba 15 números. Calcule e imprima quantos números
maiores que 30 foram digitados.*/

import java.util.Scanner;

/**
 * Exercicio11
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (num > 30) {
                contador++;
            }
        }

        System.out.printf("Existem %d números, maiores que 30.\n", contador);
        sc.close();
    }
} 
