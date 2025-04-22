import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double n1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero:");
        n1 = in.nextDouble();

        if (n1%2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    }
}


