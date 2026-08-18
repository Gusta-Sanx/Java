
import java.util.Scanner;


public class Ex02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
            System.out.println("Quantos números vc qr Digitar?");
            int n = entrada.nextInt();
        

        int[] numeros = new  int[n];

        for(int i = 0;i< n;i++){
            System.out.println("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        int maior = numeros[0];
        int posicao = 0;

        for(int i =0;i < numeros.length;i++){
            if(numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }
        System.out.print("O maior número é: "+maior);
        System.out.println(" e sua posicao e "+posicao);
        

        entrada.close();
        
    }

}
