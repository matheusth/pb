import java.util.Scanner;

/**
 * Exericio02
 */
public class Exericio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int numero = scanner.nextInt();
        StringBuffer saida = new StringBuffer();
        char[] charArray = String.valueOf(numero).toCharArray();

        for (int i = 0; i < charArray.length; i++) {
           switch (charArray[i]) {
               case '1':
                   saida.append("um");
                   break;
               case '2':
                   saida.append("dois");
                   break;
               case '3':
                   saida.append("três");
                   break;
               case '4':
                   saida.append("quatro");
                   break;
               case '5':
                   saida.append("cinco");
                   break;
               case '6':
                   saida.append("seis");
                   break;
               case '7':
                   saida.append("sete");
                   break;
               case '8':
                   saida.append("oito");
                   break;
               case '9':
                   saida.append("nove");
                   break;
           }
           saida.append( i < charArray.length - 1 ? ", " : "");
        }
        System.out.println("digitos por extenso: " + saida.toString());

        scanner.close();
    }
}
