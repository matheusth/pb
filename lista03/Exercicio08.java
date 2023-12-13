/* Criar um algoritmo que leia um número (N), e depois leia N números inteiros.
Imprima o maior deles. Suponha que todos os números lidos sejam positivos maiores
que zero. */

import java.util.Scanner;

/**
 * Exercicio08
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = -1;
        System.out.println("Digite os números: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if(num > maior) {
                maior = num;
            }
        }
        sc.close();
        System.out.println("Maior: " + maior);

    }
}
