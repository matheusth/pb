import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de primos: ");
        int n = sc.nextInt();
        int contadorPrimos = 1;
        int numeroatual = 2;

        while (contadorPrimos <= n) {
            boolean isPrime = true;
            for (int i = 2; i < numeroatual / 2; i++) {
                if (numeroatual % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d" + (contadorPrimos < n ? ", " : ""), numeroatual);
                contadorPrimos++;
            }
            numeroatual++;
        }
        System.out.println();

        sc.close();
    }
}
