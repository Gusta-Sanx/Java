import java.util.Scanner;

public class LfSimples {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if(idade >= 18){
            System.out.println("Voce é maior de idade");
        }

        System.out.println("Fim do programa👍");



        entrada.close();
    }
}
