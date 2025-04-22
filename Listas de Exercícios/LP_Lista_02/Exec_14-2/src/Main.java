import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Receber a base e a altura de um triângulo retângulo e calcular sua área.");

        float altura, base;
        double area;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o base de um triângulo retângulo:");
        base = in.nextFloat();
        System.out.println("Digite a altura de um triângulo retângulo:");
        altura = in.nextFloat();

        //Área = (b * h) / 2
        //Área = (3 cm, 4 cm) / 2 = 12 cm²/ 2 = 6 cm².

        area = base * altura / 2;

        System.out.println("A area do triângulo retângulo é "+area);


    }
}