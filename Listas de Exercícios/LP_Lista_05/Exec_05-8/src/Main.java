public class Main {
    public static void main(String[] args) {
        //8. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal principal.

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

        n=0;

        for (byte l = 0; l < linhas; l++) {   //mostrar diagonal principal
            for (byte c = 0; c < colunas; c++) {
                if (c == n)
                    System.out.println(matriz[l][n]);
            }
            n++;
        }





    }
}