import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //11. Aperfeiçoe o exercício anterior solicitando para que o usuário informe o tamanho das matrizes a serem multiplicadas.
        //Valide se é possível calcular a matriz produto.
        //Se a multiplicação existir, a matriz produto terá a quantidade de linhas da primeira matriz e a quantidade de colunas da segunda matriz.
        //Após a validação peça para o usuário inserir os valores de cada matriz e então gere a matriz produto

        int l1,c1,l2,c2;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas da matriz A:");
        l1 = in.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz A:");
        c1 = in.nextInt();

        int[][] a = new int[l1][c1];

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


        System.out.println("Informe a quantidade de linhas da matriz B:");
        l2 = in.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz B:");
        c2 = in.nextInt();

        int[][] b = new int[l2][c2];

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

        if (c1 != l2){
            System.out.println("Não é valido para calcular produto.");
            return;
        }

        int[][] produto = new int[l1][c2];

        /*
        for (byte l = 0; l < linhas; l++) {
            produto[l][0] = (a[l][0] * b[0][0]) + (a[l][1] + b[1][0]);
        }
        for (byte l = 0; l < linhas; l++) {
            produto[l][1] = (a[l][0] * b[0][1]) + (a[l][1] + b[1][1]);
        }
        */

        linhas =  a.length;
        colunas =  b[1].length;

        for (byte c = 0; c < colunas; c++) {           //calculo
            for (byte l = 0; l < linhas; l++) {
                produto[l][c] = (a[l][0] * b[0][c]) + (a[l][1] + b[1][c]);
            }
        }

        linhas =  produto.length;
        colunas =  produto[1].length;

        System.out.println("\nProduto:");                           //Resultado
        for (byte l = 0; l < linhas; l++) {
            for (byte c = 0; c < colunas; c++) {
                System.out.print(produto[l][c]+ " ");
            }
            System.out.println();
        }

    }
}