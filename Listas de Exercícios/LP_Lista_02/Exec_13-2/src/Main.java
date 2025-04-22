import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Receber o raio de um círculo e calcular sua área.");

        float raio,result;
        double area;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio de um círculo: ");
        raio = in.nextFloat();

        result = raio * raio;
        area = 3.14 * result;

        System.out.println("A área do círculo é " + area);

    }
}