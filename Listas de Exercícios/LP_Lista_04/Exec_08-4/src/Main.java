import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //8. Criar um programa onde o usuário entra com um número e o programa diz se o número digitado é primo ou não.
        int n;

        boolean primo = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número primo:");
        n = in.nextInt();

        for (int i = 0; i <= n; i++){
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 || n % 13 == 0 || n % 23 == 0)
                break;
            else if (i == n)
                primo = true;
        }

        System.out.println("Primo: "+ primo);

    }
}