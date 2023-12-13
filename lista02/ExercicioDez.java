import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(num % 3 == 0 && num % 7 == 0 ? "É DIVISÍVEL POR 3 E POR 7": "NÃO É DIVISÍVEL POR 3 E POR 7 .");
    }
}
