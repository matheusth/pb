import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dados = lerMatriz(3, 4, sc);

        System.out.printf("A matricula nº %d possui a maior media do curso 153 entre discentes do sexo 1.\n",
                matriculaComMaiorMediaDoCurso(dados, 153, 1));

        sc.close();

    }

    public static int matriculaComMaiorMediaDoCurso(int[][] dados, int nCurso, int sexo) {
        int maiorMedia = Integer.MIN_VALUE;
        int numeroMatricula = 0;

        for (int i = 0; i < dados.length; i++) {
            if (maiorMedia < dados[i][3] && sexo == dados[i][1] && nCurso == dados[i][2]) {
                maiorMedia = dados[i][3];
                numeroMatricula = dados[i][0];
            }
        }

        return numeroMatricula;
    }

    public static int[][] lerMatriz(int lines, int cols, Scanner sc) {
        String[] colunas = { "Número de matricula", "Sexo (1 ou 0)", "Número do curso", "Média geral do Curso" };
        int matriz[][] = new int[lines][cols];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite as informações do aluno " + i +": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(colunas[j] + ": ");
                matriz[i][j] = sc.nextInt();

            }
        }
        return matriz;
    }
}
