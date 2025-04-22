import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int n1;

        Scanner in =  new Scanner(System.in);
        System.out.println("Criar um programa que receba um valor do usuário e exiba a sua tabuada: ");
        n1 = in.nextInt();

        for (byte i = 0; i <= 10; i++){
            System.out.println(n1 + " x "+ i + " = " + (n1*i));

        }

    }
}