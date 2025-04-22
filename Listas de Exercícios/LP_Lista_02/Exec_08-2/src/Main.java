import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ler uma medida em polegadas e converter para milímetros.");

        double mm;
        float inch;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma medida em polegadas: ");
        inch = in.nextFloat();

        mm = inch * 25.4;

        System.out.println(inch + " polegadas é igual á " + mm + "mm.");
    }
}