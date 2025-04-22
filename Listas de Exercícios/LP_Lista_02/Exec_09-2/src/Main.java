import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ler uma medida de distância em quilômetros e converter para milhas");

        double milhas;
        float Km;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma medida em quilômetros: ");
        Km = in.nextFloat();

        milhas = Km / 1.6;

        System.out.println(Km + " quilômetros é igual á " + milhas + " milhas.");

    }
}