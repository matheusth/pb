
/* Escreva um algoritmo que determine se um dado número N (digitado pelo usuário)
é primo ou não. Um número é PRIMO se ele for divisível apenas por 1 e por ele
mesmo. */
import java.util.Scanner;

/**
 * Exercicio13
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 2; i < (n / 2); i++) {
            if (n % i == 0) {
                System.out.println("O número não é primo");
                return;
            }
        }

        System.out.println("O numero é primo");
    }
}
