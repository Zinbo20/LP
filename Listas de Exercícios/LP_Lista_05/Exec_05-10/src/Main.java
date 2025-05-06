public class Main {
    public static void main(String[] args) {
        //10. Declare e inicialize duas matrizes uma 3x2 e outra 2x2, em seguida gere a matriz produto entre as duas matrizes.
        //Exemplo de como calcular a matriz produto:

        int[][] a = new int[3][2];

        int linhas =  a.length;
        int colunas =  a[1].length;

        int n = 0;

        System.out.println("\nA:");
        for (byte l = 0; l < linhas; l++) {   //inicialização
            for (byte c = 0; c < colunas; c++) {
                a[l][c] = n;
                System.out.print(a[l][c] + " ");
                n++;
            }
            System.out.println();
        }

        int[][] b = new int[2][2];

        linhas =  b.length;
        colunas =  b[1].length;

        n = 0;

        System.out.println("\nB:");
        for (byte l = 0; l < linhas; l++) {   //inicialização
            for (byte c = 0; c < colunas; c++) {
                b[l][c] = n;
                System.out.print(b[l][c] + " ");
                n++;
            }
            System.out.println();
        }

        int[][] produto = new int[3][2];

        /*
        produto[0][0] = (a[0][0] * b[0][0]) + (a[0][1] + b[1][0]);
        produto[1][0] = (a[1][0] * b[0][0]) + (a[1][1] + b[1][0]);
        produto[2][0] = (a[2][0] * b[0][0]) + (a[2][1] + b[1][0]);

        produto[0][1] = (a[0][0] * b[0][1]) + (a[0][1] + b[1][1]);
        produto[1][1] = (a[1][0] * b[0][1]) + (a[1][1] + b[1][1]);
        produto[2][1] = (a[2][0] * b[0][1]) + (a[2][1] + b[1][1]);
        */

        linhas =  a.length;

        for (byte l = 0; l < linhas; l++) {                            //Calculo
            produto[l][0] = (a[l][0] * b[0][0]) + (a[l][1] + b[1][0]);
        }
        for (byte l = 0; l < linhas; l++) {
            produto[l][1] = (a[l][0] * b[0][1]) + (a[l][1] + b[1][1]);
        }

        linhas =  produto.length;
        colunas =  produto[1].length;

        System.out.println("\nProduto:");                    //Resultado
        for (byte l = 0; l < linhas; l++) {
            for (byte c = 0; c < colunas; c++) {
                System.out.print(produto[l][c]+ " ");
            }
            System.out.println();
        }

    }
}