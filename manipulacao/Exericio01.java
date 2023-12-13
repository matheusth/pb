import java.util.Scanner;

/**
 * Exericio01
 */
public class Exericio01 {
    public static void main(String[] args) {
        Exericio01 exericio01 = new Exericio01();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String entrada = sc.nextLine();

        String entradaCaixaAlta = entrada.toUpperCase();

        System.out.println("Número de caracteres: " + entrada.length());
        System.out.println("String em maiusculo: " + entradaCaixaAlta);

        int contadorVogais = exericio01.contarVogais(entrada);
        int contadorDigitos = exericio01.contarDigitos(entrada);

        System.out.printf("O texto contem %d %s.\n", contadorVogais, (contadorVogais == 1 ? "vogal" : "vogais"));
        System.out.println("O texto não contem vogais");

        System.out.println(
                entradaCaixaAlta.startsWith("UNI") ? "O texto começa com UNI."
                        : "O texto não começa com UNI");

        System.out.println(
                entradaCaixaAlta.endsWith("RIO") ? "O texto termina com RIO."
                        : "O texto não termina com RIO");

        System.out.printf("O texto contem %d %s.\n", contadorDigitos, (contadorDigitos == 1 ? "digito" : "digitos"));

        System.out.println(
                exericio01.ehPalindromo(entrada) ? "O texto é um palíndromo"
                        : "O texto não é um palíndromo");

        sc.close();
    }

    public int contarVogais(String texto) {
        int contadorVogais = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contadorVogais++;
        }
        return contadorVogais;
    }

    public int contarDigitos(String texto) {
        int contadorDigitos = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c >= 48 && c <= 57)
                contadorDigitos++;
        }
        return contadorDigitos;

    }

    public boolean ehPalindromo(String texto) {
        texto = texto.replace(" ", "");
        String entradaReversa = new StringBuffer(texto.replace(" ", "")).reverse().toString();
        return texto.equals(entradaReversa);
    }
}
