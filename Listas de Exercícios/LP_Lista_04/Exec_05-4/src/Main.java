import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //5. Calcule o fatorial de um número determinado pelo usuário usando for.

        int n1;
        double fatorial = 1;
        double fatorial2;

        Scanner in = new Scanner(System.in);

        System.out.println("Calcule o fatorial de um número:");

        n1 = in.nextInt();


        for (int i = 1; i <= n1 ; i++){
            fatorial2 = fatorial;
            fatorial  = fatorial2 * i;
            System.out.println(fatorial + " = "+ fatorial2 + " x " + i);
        }




    }
}