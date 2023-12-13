// Criar um algoritmo que leia os limites inferior e superior de um intervalo. Calcule e
// imprima todos os números pares no intervalo e seu somatório.

import java.util.Scanner;

/**
 * Exercicio10
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        System.out.print("Digite um limite inferior: ");
        long limiteInferior = sc.nextLong();
        System.out.print("Digite um limite superior: ");
        long limiteSuperior = sc.nextLong();

        for (long i = limiteInferior; i <= limiteSuperior; i++) {
           if (i % 2 == 0) {
                System.out.printf("%d\n", i);
                sum += i;
           } 
        }
        System.out.printf("Somatorio = %d\n", sum);
        sc.close();
    }
}
