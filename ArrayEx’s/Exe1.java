import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Quantos números voce quer digitar? ");
        int n = entrada.nextInt();
        
        int[] numeros = new int[n];
        
        
        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            

            
            }

            System.out.println("o menor numero é " + menor);


            entrada.close();

        }


        
    
    }

