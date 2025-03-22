import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ler duas notas N1 e N2 e exibir a média. >Obs.: N1 tem peso 1 e N2 tem peso 2 e resultadodeve estar entre 0 e 10.");

        float N1, N2, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite N1: ");
        N1 = in.nextFloat();
        System.out.println("Digite N2: ");
        N2 = in.nextFloat();

        int P1,P2;

        P1=1;
        P2=2;

        result = ((N1*P1) + (N2*P2))/(P1+P2);

        System.out.println("A média entre " +N1+ " com peso "+P1+ " e "+N2+ " com peso "+P2+" é "+ result);

    }
}