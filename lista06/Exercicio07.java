/**
 * Exercicio07
 */
public class Exercicio07 {
    public static void main(String[] args) {
        int[] c = fetuccine(6, 1, 2);
        System.out.print("[");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + (i < c.length - 1 ? ", " : ""));   
        }
        System.out.print("]\n");
    }

    public static int[] fetuccine(int n, int a0, int a1){
        if (n < 3) {
            return new int[0];
        }
        int vetor[] = new int[n];
        vetor[0] = a0;
        vetor[1] = a1;
        for (int i = 2; i < vetor.length; i++) {
            vetor[i] = i % 2 == 0 ? vetor[i - 1] - vetor[i - 2] : vetor[i - 1] + vetor[i - 2];
        }

        return vetor;
    }
}
