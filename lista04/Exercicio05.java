/* Faça um programa em Java que carregue um vetor de 15 posições com valores
aleatórios variando entre 100 e 1000. O programa deverá calcular e mostrar:
a) O maior elemento do vetor e em que posição esse elemento se encontra;
b) O menor elemento do vetor e em que posição esse elemento se encontra.
*/

/**
 * Exercicio05
 */
public class Exercicio05 {

    public static void main(String[] args) {
        int[] numeros = new int[15];

        int indexMax = 0, indexMin = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 100 + (int) (Math.random() * 901);
            System.out.println(numeros[i]);
            if (numeros[i] > numeros[indexMax]) {
                indexMax = i;
            }
            if (numeros[i] < numeros[indexMin]) {
                indexMin = i;
            }
        }

        System.out.printf("Maior: %d na posição %d.\n", numeros[indexMax], indexMax);
        System.out.printf("Menor: %d na posição %d.\n", numeros[indexMin], indexMin);
    }
}
