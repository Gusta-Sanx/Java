import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 

       
       System.out.println("Quantos numeros voce quer digitar? ");
       int n = entrada.nextInt();
       
       int[] numeros = new int[n];
       
       for(int i =0;i <n;i++){
        System.out.println("Digite os numeros: ");
        numeros[i] = entrada.nextInt();
       }

       float media;
       int sm = 0;
       int cont = 0;

       for(int i=0;i<numeros.length;i++){
           sm += numeros[i];
        }
        media = sm / numeros.length;

        

       for(int i =0;i<numeros.length;i++){
        if(numeros[i] %2 ==0 && numeros[i]> media){
            cont++;
            }
        }

        int[] parmed = new int[cont];
        int j = 0;

        for(int i =0;i<numeros.length;i++){
            if(numeros[i] %2 == 0 && numeros[i]> media){
            parmed[j] = numeros[i];
            j++;
        }
    }

        System.out.println("A media é "+media);
        System.out.println("Os numeros pares acima da media sao: ");
        for(int i= 0;i < parmed.length;i++){
            System.out.println(parmed[i]);
        }





    }
}
