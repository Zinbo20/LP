import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //9.Jogo da tabuada: o aplicativo irá exibir as tabuadas do 1 ao 10 uma operação por
        // vez.Entre uma operação e outra o usuário deve inserir o resultado da conta, se o
        // resultado digitado estiver correto o programa exibe a próxima operação caso contrário o
        // jogo é encerrado mostrando a mensagem de que o jogador perdeu (deve exibir a opção jogar novamente).
        // Caso o jogador complete toda a tabuada sem erros o programa deve exibir uma mensagem parabenizando o jogador (e perguntar se deseja jogar novamente).

        boolean gameover = false;
        boolean game = true;

        Scanner in = new Scanner(System.in);

        int i = 1;

        int min = 2;
        int max = 10;
        int rangeRandom;
        int result;
        int response;

        int opc;

        while (game) {

            System.out.println("Jogo da tabuada: o aplicativo irá exibir as tabuadas do 1 ao 10");
            System.out.println("Acerte as contas e vença o jogo perca e volte ao primário. ");


            while (!gameover && i <= 10) {

                rangeRandom = min + (int) (Math.random() * ((max - min) + 1));

                System.out.println("Desafio " + i + ":");
                System.out.println(i + " x " + rangeRandom + " = ");
                response = in.nextInt();
                result = i * rangeRandom;

                if (response == result) {
                    i++;
                } else {
                    gameover = true;
                }
            }

            if (!gameover)
                System.out.println("WIN Parabéns você sabe matemática básica!");
            else
                System.out.println("GAME OVER volte ao primário!");


            System.out.println("Jogar novamente? 1-Sim 2-Não:");
            opc = in.nextInt();

            if (opc != 1){
                game = false;
                System.out.println("Fim de Jogo.");
            }
            else {
                gameover = false;
                i = 1;
            }


        }

    }
}