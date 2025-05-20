public class Main {
    public static void main(String[] args) {
        //12. Declare e inicialize uma matriz 3x3 e calcule a sua determinante.
        int[][] matriz = new int[3][3];

        int n = 0;

        System.out.println("Digite os elementos da matriz 3x3:");

        int linhas =  matriz.length;
        int colunas =  matriz[1].length;

        System.out.println("\nA:");
        for (byte l = 0; l < linhas; l++) {   //inicialização
            for (byte c = 0; c < colunas; c++) {
                matriz[l][c] = n;
                System.out.print(matriz[l][c] + " ");
                n++;
            }
            System.out.println();
        }

        // Cálculo da determinante usando a Regra de Sarrus
        int determinante =
                matriz[0][0] * matriz[1][1] * matriz[2][2] +
                        matriz[0][1] * matriz[1][2] * matriz[2][0] +
                        matriz[0][2] * matriz[1][0] * matriz[2][1] -
                        matriz[0][2] * matriz[1][1] * matriz[2][0] -
                        matriz[0][0] * matriz[1][2] * matriz[2][1] -
                        matriz[0][1] * matriz[1][0] * matriz[2][2];


        System.out.println("Determinante da matriz 3x3: " + determinante);


    }
}