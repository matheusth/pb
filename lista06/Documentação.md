## Matrizes

### Ler entrada padrão e preencher matriz:

```Java
    public static int[][] lerMatriz(int lines, int cols, Scanner sc) {
        int matriz[][] = new int[lines][cols];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor do elemento (%d, %d): ", i, j);
                matriz[i][j] = sc.nextInt();

            }
        }

        return matriz;

    }
```

### Imprimir matriz:

```Java
    public static void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
```

### Multiplicar Matrizes

```Java
    public static int[][] multiplicarMatriz(int[][] matrizA, int[][] matrizB) {

        int resultado[][] = new int[matrizA.length][matrizB[0].length];

        for (int linhaMA = 0; linhaMA < matrizA.length; linhaMA++) {

            for (int colunaMB = 0; colunaMB < matrizB[0].length; colunaMB++) {
                for (int linhaMB = 0; linhaMB < matrizA[linhaMA].length; linhaMB++) {
                    resultado[linhaMA][colunaMB] += matrizA[linhaMA][linhaMB] * matrizB[linhaMB][colunaMB];
                }
            }

        }
        return resultado;
    }

```

### Somar matrizes:

```Java
    public static int[][] somarMatriz(int[][] matrizA, int[][] matrizB) {

        int resultado[][] = new int[matrizA.length][matrizA[0].length];

        for (int linha = 0; linha < matrizA.length; linha++) {

            for (int coluna = 0; coluna < matrizA[0].length; coluna++) {
                resultado[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }

        }
        return resultado;
    }
```

### Localizar o maior valor na coluna de uma matriz
```java
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
```

## Tabela de produtos
### Método principal

```java
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
            }300
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
```
### Obter a soma de uma linha

```java
    public static int[] totalItensPorArmazem(int[][] produtos) {
        int[] total = new int[produtos.length];
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < total.length; j++) {
                total[i] += produtos[i][j];
            }
        }

        return total;
    }
```
### Obter valor total do estoque de cada produto em cada armazem.

```java
    public static double[][] custoTotalPorProdutoEmArmazem(int[][] produtos, double[] custos) {
        double[][] totais = new double[produtos.length][produtos[0].length];
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < produtos[i].length; j++) {
                totais[i][j] = produtos[i][j] * custos[j];
            }
        }
        return totais;
    }
```

### Obter o custo do estoque de cada armazem.

```java
    public static double[] custoEstoquePorArmazem(double[][] custosPorProdPorArmazem) {
        double[] custoEstoques = new double[custosPorProdPorArmazem.length];

        for (int i = 0; i < custosPorProdPorArmazem.length; i++) {
           for (int j = 0; j < custosPorProdPorArmazem[i].length; j++) {
                custoEstoques[i] += custosPorProdPorArmazem[i][j];
           } 
        }
        return custoEstoques;
    }
    ```
### Obter o valor do estoque total por produto (Soma por coluna).

```java
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
```

### Ler quantidade de cada produto por armazem.

```java
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
```
### Ler o valor por unidade de cada produto.

```java
    public static double[] lerCustos(int nProdutos, Scanner sc) {
        double[] custos = new double[nProdutos];

        for (int i = 0; i < custos.length; i++) {
            System.out.printf("Custo do produto %d: ", i + 1);
            custos[i] = sc.nextDouble();
        }

        return custos;
    }
}

```