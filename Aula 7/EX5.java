import java.util.Scanner;

public class EX5 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senha = 1234;

        do{
            System.out.println("Digite a senha: ");
            senha = entrada.nextInt();



        }while(senha !=1234);

        System.out.println("Voce acertou!! ");


    }
}
