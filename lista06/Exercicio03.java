/**
 * Exercicio03
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
    }

    public static double[] calcularY(double[] x) {
        double[] resultado = new double[10];
        for (int k = 0; k < resultado.length; k++) {
            for (int n = 0; n < x.length; n++) {
               resultado[k] += x[n]/(k-n);    
            }
        }
        return resultado;
    }

}
