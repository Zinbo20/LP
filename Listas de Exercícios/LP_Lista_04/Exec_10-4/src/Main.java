import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int fibonacci = 0;
        int anterior1 = 1;
        int anterior2 = 0;

        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Sequência de Fibonacci até o enésimo termo n:");
        n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacci);

            fibonacci = anterior1 + anterior2;

            anterior2 = anterior1;
            anterior1 = fibonacci;

        }


    }
}