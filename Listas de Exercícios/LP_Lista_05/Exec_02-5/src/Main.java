public class Main {
    public static void main(String[] args) {
//2. Declare e inicialize um vetor de 10 posições, em seguida percorra este vetor
// alterando seus valores conforme a seguinte regra: some 2 a todos os valores situados
// em posições com índice par e para as posições de índice ímpar multiplique seu valores por 2.

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length ; i++)
            vetor[i] = i + 1;

        for (int i = 0; i < vetor.length ; i++) {
            if (i % 2 ==0)
                System.out.println(vetor[i] + 2);
            else
                System.out.println(vetor[i] * 2);

        }



    }
}