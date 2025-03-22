import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit.");

        //(0°C × 9/5) + 32 = 32°F

        double Fahrenheit;
        float Celsius;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        Celsius = in.nextFloat();

        Fahrenheit = Celsius * 1.8 + 32;

        System.out.println(Celsius + "C é igual á " + Fahrenheit + "F.");

    }
}