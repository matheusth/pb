/* 
 * Escreva um algoritmo que leia dois números e efetue a adição.
 * Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8.
 * Caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se de 5.
*/

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        int resultado = num1 + num2;
        resultado += resultado > 20 ? 8 : -5;
        System.out.println("Resultado: " + resultado);

        sc.close();
        
    }
}
