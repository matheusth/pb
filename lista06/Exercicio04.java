import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz:");
        int[][] matriz = lerMatriz(3, 3, sc);
        System.out.println("Digite um número para buscar na matriz");
        int n = sc.nextInt();

        if (matrizContem(matriz, n)) {
            System.out.println("A Matriz contem o número " + n + ".");
        } else {
            System.out.println("A Matriz não contem o número " + n + ".");
        }
    }

    private static boolean matrizContem(int[][] matriz, int n) {
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               if(matriz[i][j] == n) {
                   return true;
               }
           } 
        }
        return false;
    }

    public static int[][] lerMatriz(int lines, int cols, Scanner sc) {
        int matriz[][] = new int[lines][cols];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor do elemento (%d, %d): ", i, j);
                matriz[i][j] = sc.nextInt();

            }
        }

        return matriz;

    }
}
