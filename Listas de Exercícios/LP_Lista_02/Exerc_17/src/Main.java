import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.");

        //velocidade final (vf) = velocidade inicial (vi) + aceleração (a) * tempo (t).

        float veloInicial, aceleracao,tempo;
        double result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial de um carro:");
        veloInicial = in.nextFloat();
        System.out.println("Digite a aceleração de um carro:");
        aceleracao = in.nextFloat();
        System.out.println("Digite o tempo de percurso de um carro:");
        tempo = in.nextFloat();


        result = veloInicial * aceleracao * tempo;

        System.out.println("A velocidade final é " + result);


    }
}