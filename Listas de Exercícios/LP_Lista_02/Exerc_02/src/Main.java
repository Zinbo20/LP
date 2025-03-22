import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ler um número inteiro e exibir o seu quadrado.");

        int number, result;

        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        result = number * number;

        System.out.println("O quadrado de "+ number+ " é " + result);


    }
}