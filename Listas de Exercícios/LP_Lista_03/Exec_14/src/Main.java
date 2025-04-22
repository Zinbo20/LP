import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        /*
    Insira o valor da compra: 1000,00
    ----------------------------------
    Menu:
        1. Débito
        2. Pix
        3. Crédito
    ----------------------------------
    Escolha a forma de pagamento: 3
    ----------------------------------
    Crédito Selecionado
    ----------------------------------
    Escolha o número de parcelas: 6
    Valor final da compra: R$ 1050,00
         */

        byte payment;
        double valor;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da compra:");
        valor = in.nextDouble();



        System.out.println("Menu:\n" +
                "        1. Débito\n" +
                "        2. Pix\n" +
                "        3. Crédito\n" +
                "        --------------------------\n" +
                "        Escolha a forma de pagamento:");

        payment = in.nextByte();

        switch (payment){
            case 1:
                System.out.println("--------------------------\n" +
                                   "Débito Selecionado\n" +
                                    "--------------------------\n");
                System.out.println("Desconto de 5%");
                System.out.println("Valor final: " + (valor - (valor * 0.05)));
                break;
            case 2:
                System.out.println("--------------------------\n" +
                        "Pix Selecionado\n" +
                        "--------------------------\n");
                System.out.println("Desconto de 10%");
                System.out.println("Valor final: " + (valor - (valor * 0.10)));
                break;
            case 3:
                System.out.println("--------------------------\n" +
                        "Crédito Selecionado\n" +
                        "--------------------------\n");
                System.out.println("Escolha o número de parcelas:");
                int parcelas;
                parcelas = in.nextInt();
                if (parcelas < 4)
                    System.out.println("Valor final: " + (valor + (parcelas * (valor * 0.04))));
                else if (parcelas < 10)
                    System.out.println("Valor final: " + (valor + (parcelas * (valor * 0.10))));
                else
                    System.out.println("Passou o Limite.");
                break;
            default:
                System.out.println("Opção Invalida.");
                break;
        }
    }
}