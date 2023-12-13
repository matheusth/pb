import java.util.Scanner;

/**
 * ExercicioOnze
 */
public class ExercicioOnze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o valor da prestação: ");
        double prestacao = sc.nextDouble();

        if ((salario * 0.3) >= prestacao) System.out.println("Pode ser concedido.");
        else System.out.println("Não pode ser concedido.");
        sc.close();
    }
}
