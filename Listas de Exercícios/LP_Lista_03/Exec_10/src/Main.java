import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int n1,n2,n3;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os três numero separados por espaço:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 == n2 & n1 == n3 & n3 == n2) {
            System.out.println("N1, N2 e N3 são iguais");
            return;
        }

        else {
            if (n2 > n1)
                if (n2 > n3)
                    System.out.println("N2 é maior");
                else
                    System.out.println("N3 é maior");
            else if (n1 > n3)
                System.out.println("N1 é maior");
            else
                System.out.println("N3 é maior");
        }


    }
}