// Escreva um algoritmo que realize a potência de A (número real) por B (número
//inteiro e positivo), ou seja, AB, através de multiplicações sucessivas. Esses dois valores
//são passados pelo usuário através do teclado.

import java.util.Scanner;

/**
 * Exercicio12
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        System.out.print("Digite a potência: ");
        int potencia = sc.nextInt();
        double resultado = numero;


        for (int i = 1; i < potencia; i++) {
            resultado *= numero;
        }

        System.out.printf("Resultado = %f", resultado);
        sc.close();
    }
}
