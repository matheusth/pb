import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] produtos = lerMatriz(3, 3, sc);
        double[] custos = lerCustos(3, sc);
        sc.close();
        int[] totalPorArmazem = totalItensPorArmazem(produtos);
        double[][] custosPorProdutoPorArmazem = custoTotalPorProdutoEmArmazem(produtos, custos);
        double[] custosPorArmazem = custoEstoquePorArmazem(custosPorProdutoPorArmazem);
        double[] custosPorProduto = custoEstoquePorProduto(custosPorProdutoPorArmazem);

        System.out.println("======== Total de itens por armazem ========");
        for (int i = 0; i < totalPorArmazem.length; i++) {
            System.out.printf("Armazem %d: %d.\n", i + 1, totalPorArmazem[i]);
        }

        System.out.println("\n======== Total de itens por armazem ========");
        System.out.printf("O armazem %d possui a maior quantidade do produto 2.\n\n",1 + maiorQtdAPorProduto(produtos, 1));

        System.out.println("======== Custo Total de cada produto em cada armazem ========");
        for (int i = 0; i < custosPorProdutoPorArmazem.length; i++) {
            for (int j = 0; j < custosPorProdutoPorArmazem[i].length; j++) {
                System.out.printf("Produto %d no armazem %d: %.2f.\n", j + 1, i + 1, custosPorProdutoPorArmazem[i][j]);
            }
        }

        System.out.println("======== Total de custo por armazem ========");
        for (int i = 0; i < custosPorArmazem.length; i++) {
            System.out.printf("Armazem %d: %.2f.\n", i + 1, custosPorArmazem[i]);
        }

        System.out.println("======== Total de custo por produto ========");
        for (int i = 0; i < custosPorProduto.length; i++) {
            System.out.printf("Armazem %d: %.2f.\n", i + 1, custosPorProduto[i]);
        }
    }

    public static int[] totalItensPorArmazem(int[][] produtos) {
        int[] total = new int[produtos.length];
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < total.length; j++) {
                total[i] += produtos[i][j];
            }
        }

        return total;
    }

    public static double[][] custoTotalPorProdutoEmArmazem(int[][] produtos, double[] custos) {
        double[][] totais = new double[produtos.length][produtos[0].length];
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < produtos[i].length; j++) {
                totais[i][j] = produtos[i][j] * custos[j];
            }
        }
        return totais;
    }

    public static double[] custoEstoquePorArmazem(double[][] custosPorProdPorArmazem) {
        double[] custoEstoques = new double[custosPorProdPorArmazem.length];

        for (int i = 0; i < custosPorProdPorArmazem.length; i++) {
           for (int j = 0; j < custosPorProdPorArmazem[i].length; j++) {
                custoEstoques[i] += custosPorProdPorArmazem[i][j];
           } 
        }
        return custoEstoques;
    }
    public static double[] custoEstoquePorProduto(double[][] custosPorProdPorArmazem) {
        double[] custoEstoques = new double[custosPorProdPorArmazem[0].length];

        for (int i = 0; i < custosPorProdPorArmazem.length; i++) {
           for (int j = 0; j < custosPorProdPorArmazem[i].length; j++) {
                custoEstoques[j] += custosPorProdPorArmazem[i][j];
           } 
        }
        return custoEstoques;
    }

    public static int maiorQtdAPorProduto(int[][] produtos, int produto) {
        int armazem = 0;
        int maiorQtde = Integer.MIN_VALUE;

        for (int i = 0; i < produtos.length; i++) {
            if (maiorQtde < produtos[i][produto]) {
                armazem = i;
                maiorQtde += i;
            }
        }
        return armazem;
    }

    public static int[][] lerMatriz(int lines, int cols, Scanner sc) {
        int matriz[][] = new int[lines][cols];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite a quantidade do produto %d no armazem %d: ", j + 1, i + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;

    }

    public static double[] lerCustos(int nProdutos, Scanner sc) {
        double[] custos = new double[nProdutos];

        for (int i = 0; i < custos.length; i++) {
            System.out.printf("Custo do produto %d: ", i + 1);
            custos[i] = sc.nextDouble();
        }

        return custos;
    }
}
