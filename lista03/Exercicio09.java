/* Criar um algoritmo que leia dez números inteiros. Calcule e imprima o maior e o
segundo maior número da lista. Suponha que todos os números lidos sejam positivos
maiores que zero */

import java.util.Scanner;

/**
 * Exercicio09
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0, segundoMaior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num > maior)
                maior = num;
            else if (num > segundoMaior)
                segundoMaior = num;
        }

        System.out.printf("Maior: %d, Segundo maior: %d\n", maior, segundoMaior);

        sc.close();
    }
}
