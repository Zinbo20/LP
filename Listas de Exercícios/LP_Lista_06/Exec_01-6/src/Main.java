import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Escreva uma função que receba um número inteiro positivo $N$ e retorne a soma de todos os números inteiros de $1$ até $N$. Obs.: $N$ deve ser maior que $0$.

        int n;
        System.out.println("Soma de todos os números inteiros de: ");
        Scanner in = new Scanner(System.in);

        do {

            n = in.nextInt();

            if (n > 0)
                System.out.println(someAte(n));
            else
                System.out.println("Deve ser maior que 0");

        }while (n<=0);

    }

    public static  int someAte (int n){
        int soma = 0;

        for (int i = 1; i <= n; i++){
            System.out.print(soma + " + " + i);
            soma = soma + i;
            System.out.println(" = " + soma);
        }

        return soma;
    }


    public static int someAteComRecursividade (int n){
        if (n==1)
            return 1;
        return n + someAteComRecursividade(n-1);
    }

}