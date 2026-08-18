import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            System.out.println("Voce tem " + idade + " anos");
        } catch (InputMismatchException e) {
            System.out.println("Voce precisa digitar um numero inteiro e nao texto");
        }finally {
            System.out.println("Obrigado! por usar este sistema");
            sc.close();
        }
    }
}
