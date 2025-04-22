import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Receber os coeficientes $a$, $b$ e $c$ de uma equação do segundo grau e imprimir a solução.>Equação do segundo grau: $ax^2 + bx + c = 0$");

        /*
        A equação do 2º grau é: ax² + bx + c = 0. A fórmula de Bhaskara para encontrar as raízes é:
        x = (-b ± √Δ) / (2a)
        Δ = b² - 4ac. Se Δ > 0
        há duas raízes reais e distintas. Se Δ = 0, há uma raiz real dupla. Se Δ < 0, as raízes são complexas.
         */

        float a,b,c;
        double x1,x2, raiz;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite A: ");
        a = in.nextFloat();
        System.out.println("Digite B: ");
        b = in.nextFloat();
        System.out.println("Digite C: ");
        c = in.nextFloat();

        raiz = Math.pow(b,2) - 4 * a * c;

        System.out.println("Raiz é igual á " + raiz);

        x1 = (-b + Math.sqrt(raiz)) / (a*2);
        x2 = (-b - Math.sqrt(raiz)) / (a*2);

        //Exemplo: a=2 b=-3 c=-5
        // 2.5 e -1

        System.out.println("X é igual á " +x1 +" e "+x2);


    }
}