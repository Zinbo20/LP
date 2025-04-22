import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ler uma velocidade em $m/s$ e converter para $km/h$.");

        //72 km/h = 72/3,6 = 20 m/s.

        double Kmh;
        float Ms;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em m/s: ");
        Ms = in.nextFloat();

        Kmh = Ms * 3.6;

        System.out.println(Ms + "m/s é igual á " + Kmh + "km/h");


    }
}