import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = sc.nextInt();
        System.out.print("Digite um número: ");
        int b = sc.nextInt();
        sc.close();

        if (a % b == 0) System.out.printf("%d é divisível por %d\n", a, b);
        else  System.out.printf("%d não é divisível por %d\n", a, b);
    }
}
