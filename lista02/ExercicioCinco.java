import java.util.Scanner;

/** Escreva um algoritmo que leia um número e imprima a raiz quadrada do número caso
ele seja positivo ou igual a zero e o quadrado do número caso ele seja negativo.
 */
public class ExercicioCinco {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número:");    
            double numero = sc.nextDouble();

            double resultado = numero >= 0 ? Math.sqrt(numero) : Math.pow(numero, 2); 

            System.out.println("resultado = " + resultado);

            sc.close();
    }
}
