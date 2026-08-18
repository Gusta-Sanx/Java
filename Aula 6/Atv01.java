import java.util.Scanner;

public class Atv01 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os numeros: ");
            numeros[i] = scan.nextInt();
        }
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
            System.out.println("O maior número é: " + maior);

            scan.close();
    }
}
