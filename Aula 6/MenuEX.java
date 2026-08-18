import java.util.Scanner;

public class MenuEX {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int opcao;


        do {
            System.out.println("==MENU==");
            System.out.println("1-Dizer Olá");
            System.out.println("2-Mostrar número");
            System.out.println("3-Sair");
            System.out.println("Escolha uma opção: ");


            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá usuário!");
                    break;

                case 2:
                    System.out.println("O número é 10");
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opçao invalida!");
            }

            System.out.println();

        } while (opcao != 3);

        entrada.close();

    }
}


