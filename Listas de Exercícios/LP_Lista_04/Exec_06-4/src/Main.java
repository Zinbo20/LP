import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //6. Peça para o usuário inserir dois números inteiros e exiba todos os números naturais existentes entre os números digitados.

        int n1,n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Inserir dois números inteiros e exiba todos os números naturais existentes entre os números digitados:");
        n1 = in.nextInt();
        n2 = in.nextInt();

        for (int i = n1; i <= n2; i++)
            System.out.println(i);
    }
}