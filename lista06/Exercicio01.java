/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        int[] cartela = {60, 50, 15 , 48 , 12, 14, 12, 90};
        int[] sorteio = new int[10];

        for (int i = 0; i < sorteio.length; i++) {
           sorteio[i] = 1 + (int)(Math.random() * 59);
        }
        System.out.println("Cartela:");
        imprimir(cartela);
        System.out.println("Sorteio:");
        imprimir(sorteio);
        
        System.out.println("Acertos: " + megasena(cartela, sorteio));
    }

    public static int megasena(int cartela[], int [] sorteio) {
        int acertos = 0;
        for (int i = 0; i < sorteio.length; i++) {
           for (int j = 0; j < cartela.length; j++) {
               if (cartela[j] == sorteio[i]) {
                    acertos++;
               }
           } 
        }
        return acertos;
    }

    public static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
           System.out.print(vetor[i] + (i < vetor.length - 1? ", ": "")); 
        }
        System.out.println();
    }
}
