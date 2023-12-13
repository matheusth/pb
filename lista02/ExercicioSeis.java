import java.util.Scanner;

/**
 * Escreva um algoritmo que receba um número e imprima uma das mensagens: “É
MÚLTIPLO DE 3” ou “NÃO É MÚLTIPLO DE 3”.
 */
public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(num % 3 == 0 && num != 0 ? "É MULTIPLO DE 3.": "NÃO É MULTIPLO DE 3.");
    }
}
