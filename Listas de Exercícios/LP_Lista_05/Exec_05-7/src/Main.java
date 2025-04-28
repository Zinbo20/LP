public class Main {
    public static void main(String[] args) {
//7. Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e a maior soma entre suas linhas.

        int[][] matriz = new int[5][5];

        int linhas =  matriz.length;
        int colunas =  matriz[1].length;

        int n = 0;

        for (byte l = 0; l < linhas; l++) {   //inicialização
            for (byte c = 0; c < colunas; c++) {
                matriz[l][c] = n;
                System.out.print(matriz[l][c] + " ");
                n++;
            }
            System.out.println();
        }

        int[] somaLinhas = new int[5];
        int maiorLinha = matriz[0][0];

        for (byte l = 0; l < linhas; l++) {   //atribuir soma entre linhas
            for (byte c = 0; c < colunas; c++) {
                somaLinhas[l] += matriz[l][c];
            }
        }

        for (int i = 0; i < somaLinhas.length ; i++) { // achar maior linha
        //    System.out.println(somaLinhas[i]);
            if (maiorLinha < somaLinhas[i])
                maiorLinha = somaLinhas[i];
        }

        int[] somaColunas = new int[5];
        int maiorColuna = matriz[0][0];

        for (byte c = 0; c < colunas; c++) {
            for (byte l = 0; l < linhas; l++) {
                somaColunas[c] += matriz[l][c];
            }
        }

        for (int i = 0; i < somaColunas.length ; i++) {
        //    System.out.println(somaColunas[i]);
            if (maiorColuna < somaColunas[i])
                maiorColuna = somaColunas[i];
        }

        System.out.println();
        System.out.println("Maior soma entre linhas é " + maiorLinha);
        System.out.println("Maior soma entre Colunas é " + maiorColuna);








    }
}