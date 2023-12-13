/**
 * Exercicio09
 */
public class Exercicio09 {
    public static void main(String args[]) {
        int[] sequencia = {4, 5, 6, 3, 7, 4, 5, 5, 5, 9, 1, 6};
        repeticoes(sequencia);
    }

    public static void repeticoes(int[] sequencia) {
        int[][] numeros = new int[sequencia.length][2];

        int cursor = 0;
        for (int i = 0; i < sequencia.length; i++) {
            boolean find = false;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j][0] == sequencia[i]) {
                    numeros[j][1]++;
                    find = true;
                }
            }

            if (!find) {
                numeros[cursor][0] = sequencia[i];
                numeros[cursor][1] = 1;
                cursor++;
            }
        }
        for (int i = 0; i < cursor; i++) {
            System.out.printf("%d ocorre %d vezes.\n", numeros[i][0], numeros[i][1]);
        }
    }
}
