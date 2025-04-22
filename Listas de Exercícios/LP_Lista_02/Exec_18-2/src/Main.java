import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Receber os coeficientes a e b de uma equação do primeiro grau e imprimir a solução. >Equação do primeiro grau ax + b = 0");

        // x = -b / a

        float a,b;
        double x;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite A: ");
        a = in.nextFloat();
        System.out.println("Digite B: ");
        b = in.nextFloat();

        x = -b / a;

        System.out.println("X é igual á " +x);

    }
}