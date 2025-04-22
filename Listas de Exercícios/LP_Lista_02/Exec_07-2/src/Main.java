import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ler uma medida em milímetro e converter para polegadas.");

        double inch;
        float mm;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma medida em milímetro: ");
        mm = in.nextFloat();

        inch = mm / 25.4;

        System.out.println(mm + "mm é igual á " + inch + " polegadas.");
    }
}