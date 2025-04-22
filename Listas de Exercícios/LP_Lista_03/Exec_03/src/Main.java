import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double score1, score2,recovery, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite Nota 1:");
        score1 = in.nextDouble();
        System.out.println("Digite Nota 2:");
        score2 = in.nextDouble();

        mean = (score1+score2)/2;


        System.out.println("Média =" + mean);

        System.out.println(mean<50?"Reprovado":"Aprovado");
    }
}