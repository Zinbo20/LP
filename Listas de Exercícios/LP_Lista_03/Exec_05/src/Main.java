import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Elabore um programa que calcule a média de um aluno e imprima o conceito:\n" +
                "    - A se a média >= 8.5\n" +
                "    - B se a média >= 7 e média < 8.5\n" +
                "    - C se a média >= 5 e média < 7\n" +
                "    - D se a média < 5");

        double n1, n2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite Nota 1:");
        n1 = in.nextDouble();
        System.out.println("Digite Nota 2:");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;

        System.out.println("Média =" + mean);

        if (mean >= 8.5)
            System.out.println("A");
        else if (mean >= 7)
            System.out.println("B");
        else if (mean >= 5)
            System.out.println("C");
        else
            System.out.println("D");


    }
}