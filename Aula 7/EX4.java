import java.util.Scanner;

public class EX4 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int soma = 0;

        do{
            System.out.println("Digite o numero: ");
            num = entrada.nextInt();

            soma = num + soma;


        }while(num!=0);
        System.out.println("a soma dos valores foi: "+soma);

    }
}
