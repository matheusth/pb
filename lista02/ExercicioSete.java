import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        sc.close();

        if (num % 5 == 0) {
            System.out.println("O número é divisível por 5.");
            return;
        }
        System.out.println("O número não é divisível por 5.");

    }
}
