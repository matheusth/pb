// Escreva um algoritmo que leia um número. Determine e imprima se o número digitado é PAR ou ÍMPAR. 

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.printf(numero % 2 == 0 ? "%d é par.\n" : "%d é impar\n", numero);
    }
}
