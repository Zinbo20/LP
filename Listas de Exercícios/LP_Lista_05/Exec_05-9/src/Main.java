public class Main {
    public static void main(String[] args) {
    //9. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal secundária.

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

        n=linhas-1;

        for (byte l = 0; l < linhas; l++) {   //mostrar diagonal secundária
            for (byte c = 0; c < colunas; c++) {
                if (c == n)
                    System.out.println(matriz[l][n]);
            }
            n--;
        }

    }
}