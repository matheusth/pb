import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = sc.nextInt();
        System.out.print("Digite um número: ");
        int b = sc.nextInt();
        sc.close();

        if (a > b ) System.out.printf("%d é maior que %d\n", a, b);
        else if (a == b) System.out.println("Os números são iguais.");
        else  System.out.printf("%d é menor que %d\n", a, b);
    }
}
