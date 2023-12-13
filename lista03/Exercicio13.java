//Escreva um algoritmo que calcule o fatorial do número N, cujo valor é obtido
//através do usuário pelo teclado. Exemplo: fatorial de 5

import java.util.Scanner;

/**
 * Exercicio13
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        long n = sc.nextInt();
        long fatorial = 1;

        while (n > 0) {
            fatorial *= n--;
        } 
        System.out.printf("Fatorial: %d\n", fatorial);
        sc.close();
    }    
}
