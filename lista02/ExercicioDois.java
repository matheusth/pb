/*
 * Escreva um algoritmo que leia dois valores numéricos inteiros e efetue a adição.
 * Imprima o valor da adição caso o resultado seja maior que 10.
*/

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");      
        int num1 = sc.nextInt();
        System.out.print("Digite um número: ");      
        int num2 = sc.nextInt();

        int resultado = num1 + num2;

        if (resultado > 10) System.out.println(resultado + " é maior que 10.");

        sc.close();
    }
}
