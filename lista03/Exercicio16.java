import java.util.Scanner;

/**
 * Exercicio16
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        sc.close();
        int previous = 0, current = 1;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d" + (i < n - 1 ? ", " : "\n"), current);
            int aux = current;
            current += previous;
            previous = aux;
        }
    }
}
