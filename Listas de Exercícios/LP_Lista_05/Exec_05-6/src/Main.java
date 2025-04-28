public class Main {
    public static void main(String[] args) {
        //6. Declare e inicialize um vetor, em seguida inverta a sequência dos valores armazenados neste mesmo vetor.

        int[] vetor = new int[10];
        int[] mirror_vetor = new int[10];


        for (int i = 0; i < vetor.length ; i++) //Declarações do vetor
            vetor[i] = i + 1;

        for (int i = 0; i < vetor.length ; i++)//Espelhamento(Inversão) em mirro_vetor
            mirror_vetor[i] = vetor[vetor.length -1 - i];

        for (int i = 0; i < vetor.length ; i++)//Re declaração agora invertido
            vetor[i] = mirror_vetor[i];

        for (int i = 0; i < vetor.length ; i++)
            System.out.println(vetor[i]);

    }
}