import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ler uma medida de distância em milhas e converter para quilômetros.");

        double Km;
        float milhas;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma medida em quilômetros: ");
        milhas = in.nextFloat();

        Km = milhas * 1.6;

        System.out.println(milhas + " milhas é igual á " + Km + " quilômetros.");


    }
}