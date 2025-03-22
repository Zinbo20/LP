import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ler um número real e exibir a quinta parte deste número.");
        float number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextFloat();

        result = number/5;

        System.out.println("A quinta parte de "+ number+ " é " + result);

    }
}