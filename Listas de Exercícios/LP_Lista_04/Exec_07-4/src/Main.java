public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //7. Criar um programa que quando executado exiba todas as tabuadas do 1 ao 10.

        System.out.println("Criar um programa que quando executado exiba todas as tabuadas do 1 ao 10.");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println((i * j) + " = " + i + " x " + j);
            }
            System.out.println();
        }

    }
}