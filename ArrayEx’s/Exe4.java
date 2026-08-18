
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in); 

       
       System.out.println("Quantos numeros voce quer digitar? ");
       int n = entrada.nextInt();
       
       int[] numeros = new int[n];
       
       for(int i =0;i <n;i++){
        System.out.println("Digite os numeros: ");
        numeros[i] = entrada.nextInt();
       }

       int cont = 0;
       
        for(int i =0; i < numeros.length;i++){
            if(numeros[i] < 0){
            cont++; 
            
    }
}
    int[] negativos = new int[cont];
    int j = 0;

    for(int i =0; i< numeros.length;i++){
        if(numeros[i] < 0){
        negativos[j] = numeros[i];
        j++;
    }

    }
    System.out.println("Foram digitados "+cont+" numero(s) negativo(s)");
       System.out.println("Os números negativos sao: ");
       for(int i=0;i<negativos.length;i++){
        System.out.println(negativos[i]);
       }


       entrada.close();
    }
}

