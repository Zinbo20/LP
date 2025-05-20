import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. Implemente uma função para calcular o fatorial de um número inteiro $N$ digitado pelo usuário.

        int n;
        System.out.println("Calcular o fatorial de: ");
        Scanner in = new Scanner(System.in);

        do {
            n = in.nextInt();

            if (n > 0)
                System.out.println(calcularFatorialDe(n));
            else
                System.out.println("Deve ser maior que 0");

        }while (n <= 0);


    }

    public static  int calcularFatorialDe (int n){
        int fatorial = 1;

        for (int i = 1; i <= n; i++){
            System.out.print(fatorial + " * " + i);
            fatorial = fatorial * i;
            System.out.println(" = " + fatorial);
        }

        return fatorial;
    }

}