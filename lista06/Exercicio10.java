/**
 * Exercicio10
 */
public class Exercicio10 {
    public static void main(String[] args) {
        for (int n : pascal(2))
            System.out.printf("%3d", n);
        System.out.println();
    }

    public static int[] pascal(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i > 1 && j >= 1)
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                else
                    result[i][j] = 1;
            }
        }
        return result[n-1];
    }
}
