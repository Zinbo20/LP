public class Main {
    public static void main(String[] args) {
        //1. Declare e inicialize um vetor de 10 posições, em seguida imprima este vetor em ordem inversa.

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length ; i++)
            vetor[i] = i + 1;

        for (int i = vetor.length - 1; i >= 0 ; i--)
            System.out.println(vetor[i]);


    }
}