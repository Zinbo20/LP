import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Receber o raio e a altura de um cilindro e calcular seu volume.");

        float raio, altura;
        double volume,result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio de um cilindro:");
        raio = in.nextFloat();
        System.out.println("Digite a altura de um cilindro:");
        altura = in.nextFloat();

        //V = π r² h

        result = raio * raio;

        volume = 3.14 * result * altura;

        /*
        Um cilindro com raio de 2 cm e altura de 5 cm.
        V = π * 2² * 5
        V = π * 4 * 5
        V = 20π cm³ (aproximadamente 62.8 cm³)
         */

        System.out.println("O volume do cilindro é "+volume);




    }
}