import java.util.Scanner;

public class ATV1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = entrada.nextDouble();//O numero tem que ser escrito com ","


        if(nota >= 10){
            System.out.println("Maior ou igual a 10");
        }
        else{
            System.out.println("Menor que 10 ");
        }

        entrada.close();

    }
}
