import java.util.Scanner;

public class TabuadaFOR {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

        System.out.print("Qual tabuada vc qr imprimir: ");
        int numero = entrada.nextInt();

        for(int i = 1;i <=10;i++){
            System.out.println(numero+"x"+i+"="+(numero*i));
        }
    }
}
