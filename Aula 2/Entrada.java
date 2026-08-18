import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        
        System.out.print("Digite seu nome: ");
        String nome = entrada.next();

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        
        entrada.close();
    }
}