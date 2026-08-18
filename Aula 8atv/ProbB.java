
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProbB {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] gabarito = new String[10];
        String[] respostasAluno = new String[gabarito.length];
        String resposta;
        boolean correta;
        float porcetagem;
        int total = 10;
        int continua = 0;
        int erros;



        System.out.println("Informe o gabarito: ");

        for (int i = 0; i < gabarito.length; i++) {
            System.out.printf("Questao %d: ", i + 1);
            gabarito[i] = entrada.next().trim().toUpperCase();
        }

        System.out.println("Quantas provas voce quer corrigir? ");
        continua = entrada.nextInt();

        for(int c = 0; c <continua;c++) {
            int acertos = 0;
            System.out.println("Digite suas respostas ");

            for (int i = 0; i < gabarito.length; i++) {
                while (true) {
                    System.out.printf("Questão %d: ", i + 1);
                    resposta = entrada.next().trim().toUpperCase();//Pra n dar erro se for minuscula a letra

                    if (resposta.matches("[ABCDE]")) {
                        respostasAluno[i] = resposta;
                        break;
                    } else {
                        System.out.println("Resposta inválida!");
                    }
                }
            }
            for (int i = 0; i < gabarito.length; i++) {
                correta = respostasAluno[i].equals(gabarito[i]);
                if (correta) {
                    acertos++;

                }
            }


            DecimalFormat df = new DecimalFormat("#");//Cortador de casa decimal

            porcetagem = (acertos * 100 / total);
            erros = (acertos * 100 % total);


            System.out.println(acertos + " " + df.format(porcetagem) + " " + erros);
        }
        entrada.close();
    }
}

