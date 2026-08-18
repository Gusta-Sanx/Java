import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int opcao;


        do {
            System.out.println("==MENU==");
            System.out.println("1-Soma");
            System.out.println("2-Subtracao");
            System.out.println("3-Divisao");
            System.out.println("4-Multiplicacao");


            opcao = entrada.nextInt();

            switch (opcao) {
                    case 1:
                        System.out.println("Digite o primeiro valor: ");
                        double valor1 = entrada.nextDouble();
                        System.out.println("Digite o segundo valor: ");
                        double valor2 = entrada.nextDouble();
                        double resultado = valor1+valor2;
                        System.out.println(resultado);
                        break;
                    case 2:
                        System.out.println("Digite o primeiro valor: ");
                        double valor3 = entrada.nextDouble();
                        System.out.println("Digite o segundo valor: ");
                        double valor4 = entrada.nextDouble();
                        double resultadoSub = valor3-valor4;
                        System.out.println(resultadoSub);
                        break;

                    case 3:
                        try {
                            System.out.println("Digite o primeiro valor: ");
                            int valor5 = entrada.nextInt();
                            System.out.println("Digite o segundo valor: ");
                            int valor6 = entrada.nextInt();
                            int resultadoDiv = valor5/valor6;
                            System.out.println(resultadoDiv);
                        }catch(ArithmeticException e) {
                            System.out.println("Impossivel dividir por 0");
                        }
                        break;
                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    double valor7 = entrada.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    double valor8 = entrada.nextDouble();
                    double resultadoMult = valor7*valor8;
                    System.out.println(resultadoMult);
                        break;

                default:
                    System.out.println("Opçao invalida!");
            }

            System.out.println();

        } while (opcao != 4);

        entrada.close();

    }
}