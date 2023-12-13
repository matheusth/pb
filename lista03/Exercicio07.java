/* Escreva um algoritmo no qual o usuário digitará dez números. Calcule e imprima o
cubo de cada número.
*/

import java.util.Scanner;

/**
 * Exercicio07
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero: ");
            int number = sc.nextInt();

            System.out.printf("\n%d³ = %d\n", number, (int)Math.pow(number, 3));
        }
        sc.close();
    }
}
