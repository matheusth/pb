import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor do elemento (%d, %d): ", i, j);
                matriz[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(matriz[i][i]);
        }

        sc.close();
    }
}
