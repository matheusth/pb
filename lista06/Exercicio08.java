
/**
 * Exercicio08
 */
public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println(quantDias(2000, 2022));
    }

    public static int quantDias(int anoInicial, int anoFinal){
        int sum = 0;

        for (int i = 2000; i < 2022; i++) {
            if (i % 4 == 0){
                sum += 365;
            } else {
                sum += 366;
            }
        }

        return sum;
    }
}
