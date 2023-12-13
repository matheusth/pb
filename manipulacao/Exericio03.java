import java.util.Scanner;

/**
 * Exericio03
 */
public class Exericio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nomeCompleto = sc.nextLine();
        StringBuffer iniciais = new StringBuffer();

        String[] nomes = nomeCompleto.split(" ");

        for (String nome : nomes) {
            if (!("e".equals(nome) || "do".equals(nome) || "da".equals(nome) || "dos".equals(nome) || "das".equals(nome)
                    || "de".equals(nome) || "di".equals(nome) || "du".equals(nome))) {

                iniciais.append(nome.toUpperCase().charAt(0));
            }
        }
        System.out.println(iniciais.toString());

        sc.close();
    }
}
