import java.util.Scanner;

/**
 * Exercicio03
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];
        int maiorQueCem = 0;

        for (int i = 0; i < valores.length; i++) {
           System.out.print("Digite um valor: "); 
           valores[i] = sc.nextInt();

           if (valores[i] > 100) {
               maiorQueCem++;
           }
        }
        System.out.println("O vetor contem " + maiorQueCem + " valores maiores que 100.");

        sc.close();
    }
}
