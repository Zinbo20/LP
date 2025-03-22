import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ler um número inteiro e exibir o seu dobro.");

        int number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        result = number * 2;

        System.out.println("O dobro de "+ number+ " é " + result);

    }
}