import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Receber o raio e a altura de um cone e calcular seu volume.");

        float raio, altura;
        double volume,result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio de um cone:");
        raio = in.nextFloat();
        System.out.println("Digite a altura de um cone:");
        altura = in.nextFloat();

        //V = 1/3hπr²

        result = raio * raio;

        volume = 3.14 * result * altura * 1/3;

        //Se o raio do cone é 1 e a altura é 3, o volume do cone é π, que pode ser aproximado como 3,14159.

        System.out.println("O volume do cone é "+volume);


    }
}