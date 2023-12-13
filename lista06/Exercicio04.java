/**
 * Exercicio04
 */
public class Exercicio04 {
    public static void main(String[] args) {
        String[] emails = {"a@gmail.com","a@yahoo.com","a@bool.com","b@teste.com", "b@gmail.com", "a@hotmail.com", "b@yahoo.com"};
        for (int a : listaEmails(emails)) {
            System.out.println(a);
        }
    }

    public static int[] listaEmails(String[] emails) {
        String[] servicos = { "Gmail", "Hotmail", "Yahoo", "Demais Servicos" };
        int[] resultado = new int[servicos.length];
        for (int i = 0; i < emails.length; i++) {
            String servico = emails[i].split("@")[1].split("\\.")[0];
            System.out.println(servico);
            boolean encontrado = false;
            for (int j = 0; j < servicos.length - 1; j++) {
                if (servicos[j].toLowerCase().equals(servico)) {
                    encontrado = true;
                    resultado[j]++;
                }
            }
            if (!encontrado) {
                resultado[resultado.length - 1]++;
            }
        }

        return resultado;
    }
}
