import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3. Crie uma função para calcular a potência de um número inteiro $x$ elevado a uma potência inteira $y$.
        // Os valores de $x$ e $y$ serão fornecidos pelo usuário. $y$ deve ser maior ou igual a zero. <font color="red">
        // Proibido utilizar ```Math.pow(x,y)```</font>.

        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Calcular a potência de: ");
        x = in.nextInt();
        System.out.println("Elevado à potência: ");

        do {
            y = in.nextInt();

            if (y > 0)
                System.out.println(calcularPotenciaDe(x,y));
            else
                System.out.println("Potência(Y) Deve ser maior que 0");

        }while (y <= 0);


    }

    public static  int calcularPotenciaDe (int x,int y){
        int result = x;

        for (int i = 1; i < y; i++){
            result = result * x;
        }

        return result;
    }

}