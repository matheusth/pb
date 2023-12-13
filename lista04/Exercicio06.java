/* Faça um programa em Java que crie um vetor de 26 elementos do tipo String. Cada
elemento do vetor deve conter uma letra do alfabeto, onde o seu índice é dado pela
ordem da letra no alfabeto (exemplo: ‘A’ = 1, ‘B’ = 2, ‘C’ = 3, ...). Imprima os índices:
18; 7; 0; 17; 8; 13; 6; 0; 13. */

/**
 * Exercicio06
 */
public class Exercicio06 {
    public static void main(String[] args) {
        String[] letras = new String[26];
        int[] indexes = { 18, 7, 0, 17, 8, 13, 6, 0, 13 };
        for (int i = 0; i < letras.length; i++) {
            letras[i] = "" + (char) (i + 65);
            System.out.println(letras[i]);
        }
        for (int i : indexes) {
            System.out.print(letras[i]);            
        }
        System.out.println();
    }
}
