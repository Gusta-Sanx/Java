import java.util.Scanner;

public class EX2 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Digite sua idade");
        numero = entrada.nextInt();

        if(numero <= 12){
            System.out.println("Criança ");
        }
        if(numero <= 17){
            System.out.println("Adolecente ");
        }
        if (numero >18){
            System.out.println("Adulto ");
        }
    }
}
