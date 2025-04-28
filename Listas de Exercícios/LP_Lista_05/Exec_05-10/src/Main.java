public class Main {
    public static void main(String[] args) {
        //10. Declare e inicialize duas matrizes uma 3x2 e outra 2x2, em seguida gere a matriz produto entre as duas matrizes.
        //Exemplo de como calcular a matriz produto:

        int[][] matriz1 = new int[3][2];

        int linhas =  matriz1.length;
        int colunas =  matriz1[1].length;

        int n = 0;

        for (byte l = 0; l < linhas; l++) {   //inicialização
            for (byte c = 0; c < colunas; c++) {
                matriz1[l][c] = n;
                System.out.print(matriz1[l][c] + " ");
                n++;
            }
            System.out.println();
        }

        int[][] matriz2 = new int[3][2];

        linhas =  matriz2.length;
        colunas =  matriz2[1].length;

        n = 0;

        for (byte l = 0; l < linhas; l++) {   //inicialização
            for (byte c = 0; c < colunas; c++) {
                matriz2[l][c] = n;
                System.out.print(matriz2[l][c] + " ");
                n++;
            }
            System.out.println();
        }

        int[][] produto = new int[3][2];

    }
}