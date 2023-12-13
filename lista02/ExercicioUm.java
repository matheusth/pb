// Escreva um algoritmo que leia um número e o imprima caso ele seja maior que 20.

import java.util.Scanner;

public class ExercicioUm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if (num > 20) {
            System.out.println(" é maior que 20.");
        }
    }
}
