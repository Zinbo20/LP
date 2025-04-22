import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ler uma velocidade em $Km/h$ e converter para $m/s$.");

        //72 km/h = 72/3,6 = 20 m/s.

        float Kmh;
        Double Ms;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em Km/h: ");
        Kmh = in.nextFloat();

        Ms = Kmh / 3.6;

        System.out.println(Kmh + "km/h é igual á " + Ms + "m/s");


    }
}