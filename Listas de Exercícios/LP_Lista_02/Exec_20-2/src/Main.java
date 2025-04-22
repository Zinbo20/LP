import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Descobrir uma equação do segundo grau a partir de suas raízes:\n" +
                "\n" +
                "      >Exemplo: <br>\n" +
                "      $x1 = 1$ e $x2 = 2$ <br>\n" +
                "      Então: <br>\n" +
                "      $(x -1) . (x -2)$ <br>\n" +
                "      Logo: <br>\n" +
                "      $x2 -3x -2 = 0$ <br>");

        float x1,x2;

        double a,b,c;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a Raiz X1: ");
        x1 = in.nextFloat();
        System.out.println("Digite a Raiz X2: ");
        x2 = in.nextFloat();


        //x*x x*-2
        //-1*x -1*-2
        //2x -2x -1x -2


        a = 2;
        b = -x1 + -x2;
        c = -x1 * -x2;

        System.out.println("x"+a+" "+b+"x "+c+" = 0");

    }
}