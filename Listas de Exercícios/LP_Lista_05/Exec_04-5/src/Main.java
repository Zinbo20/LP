import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4. Crie um programa que armazene 10 números inteiros inseridos pelo usuário em um vetor.
        // Em seguida, percorra o vetor e indique onde estão o maior e o menor número (imprima seus valores e suas posições no vetor).

        int[] vetor = new int[10];

        Scanner in = new Scanner(System.in);

        System.out.println("Insira 10 numeros (digite um numero e pressione ENTER):");
        for (int i = 0; i < vetor.length ; i++)
            vetor[i] = in.nextInt();

        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 0; i < vetor.length ; i++){

            if (menor >= vetor[i])
                menor = vetor[i];

            if (maior <= vetor[i])
                maior = vetor[i];

        }

        System.out.println("Menor numero:"+ menor);
        System.out.println("Maior numero:"+ maior);


    }
}