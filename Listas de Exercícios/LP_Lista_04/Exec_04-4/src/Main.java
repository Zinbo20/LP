public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //4. Faça um programa que apresente na tela a tabela de conversão de Graus Celsius para Fahrenheit, de -80ºC até 80ºC com um incremento de 10ºC.

        //(0°C × 9/5) + 32 = 32°F

        double f;

        System.out.println("Tabela de conversão de Graus Celsius para Fahrenheit, de -80ºC até 80ºC com um incremento de 10ºC");

        for (int c = -80; c <= 80; c++){
            if (c % 10 == 0){
                f = (c * (9/5)) + 32;
                System.out.println(c + "C" + " = " + f + "F");
            }
        }




    }
}