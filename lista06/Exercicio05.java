/**
 * Exercicio05
 */
public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println(celularValido("994407825"));
        System.out.println(celularValido("118908900"));
    }

    public static boolean celularValido(String numero) {
        for (char c : numero.toCharArray()) {
            if (!Character.isDigit(c)) {
               return false; 
            }
        }
        return numero.startsWith("96") || 
        numero.startsWith("97") || 
        numero.startsWith("98") || 
        numero.startsWith("99") && numero.length() == 9; 
    }
}
