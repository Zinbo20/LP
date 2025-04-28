import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3. Crie um programa que contenha um vetor de inteiros de 10 posições (inicializar o vetor junto com sua declaração).
        // O programa deve solicitar ao usuário um número inteiro(armazenar em uma variável comum inteira) e então realizar uma
        // busca dentro do vetor.Caso a variável digitada exista dentro do vetor, exibir sua posição no vetor caso contrário exibir a mensagem “Valor não encontrado”.

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n;

        boolean find = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero a ser buscado no vetor:");
        n = in.nextInt();

        for (int i = 0; i < vetor.length ; i++) {

            if (n == vetor[i]){
                System.out.println("O valor n:"+n+ " foi achado em " +i+ " no vetor.");
                find = true;
                break;
            }
        }

        if (!find)
            System.out.println("n:" + n + " não encontrado no vetor.");


    }
}