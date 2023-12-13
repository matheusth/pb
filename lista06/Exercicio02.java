/**
 * Exercicio02
 */
public class Exercicio02 {

    public static void main(String[] args) {
       imprimir(calcularX(0.1)); 
    }

    public static double[] calcularX(double n){
        int tamanho = (int)(Math.abs(-Math.PI - Math.PI) / 0.1) + 1 ;
        double[] xs = new double[tamanho];
        double i = -Math.PI;
        int contador = 0;
        while(i < Math.PI) {
            xs[contador] = Math.pow(0.9, i);
            i += n;
            contador++;
        }

        return xs;
    }

    public static void imprimir(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
           System.out.print(vetor[i] + (i < vetor.length - 1? ", ": "")); 
        }
        System.out.println();
    }
}
