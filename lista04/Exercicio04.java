
/**
 * Exercicio04
 */
public class Exercicio04 {

    public static void main(String[] args) {
        int[] valores = new int[500];
        System.out.println("[");
        for (int i = 0; i < valores.length; i++) {
            int randomNum = 1 + (int)(Math.random() * 20_000);
            System.out.printf("\t%d\n", randomNum);
            valores[i] = randomNum;
        }
        System.out.println("]");

    }
}
