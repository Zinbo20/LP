public class Main {
    public static void main(String[] args) {
        //5. Crie um programa que possua um vetor de 10 posições com os seguintes valores inteiros armazenados: int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] v1 = new int[10];

        for (int i = 0; i < v1.length ; i++)
            v1[i] = i;

        for (int i = 0; i < v1.length ; i++)
            System.out.println(v1[i]);

    }
}