import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        byte opc;
        double base, alt, di, area, perimetro;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu:\n" +
                "        1. Círculo\n" +
                "        2. Triangulo Retângulo\n" +
                "        3. Retângulo\n" +
                "        --------------------------\n" +
                "        Escolha uma opção:");

        opc = in.nextByte();

        switch (opc) {
            case 1:
                System.out.println("Informe o Diâmetro:");
                di = in.nextDouble();
                System.out.println("--------------------------\n");

                double raio = (di / 2);

                area = 3.14 * Math.pow(raio, 2);
                perimetro = 2 * 3.14 * raio;

                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;
            case 2:
                System.out.println("--------------------------\n" +
                        "Informe a base:");
                base = in.nextDouble();
                System.out.println("Informe a altura:");
                alt = in.nextDouble();
                System.out.println("--------------------------\n");

                area = (base * alt) / 2;
                double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(alt, 2));
                perimetro = hipotenusa + base + alt;

                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;
            case 3:
                System.out.println("--------------------------\n" +
                        "Informe a base:");
                base = in.nextDouble();
                System.out.println("Informe a altura:");
                alt = in.nextDouble();
                System.out.println("--------------------------\n");

                area = base * alt;
                perimetro = (base + alt) * 2;

                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;
            default:
                System.out.println("Opção Invalida.");
                break;

        }
    }
}