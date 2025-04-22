import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ler duas notas N1 e N2 e exibir a média.");
        float N1, N2, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite N1:");
        N1 = in.nextFloat();
        System.out.println("Digite N2:");
        N2 = in.nextFloat();

        result = (N1 + N2)/2;

        System.out.println("A média entre " +N1+ " e "+N2+ " é "+ result);

    }
}