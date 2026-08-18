import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite qnts numeros vc quer:");
        int n =entrada.nextInt();
        
        int[] numeros =new  int[n];

        for(int i =0;i <n;i++){
            System.out.println("Digite os numeros ");
            numeros[i] = entrada.nextInt();
        }
        int[] numerosInv = new int[numeros.length];
        
        for(int i = 0; i < numeros.length; i++) {
            numerosInv[i] = numeros[numeros.length - 1 - i];
        }
        for(int i = 0; i < numeros.length; i++){
        System.out.print(numerosInv[i]+" ");
        }
        //System.out.println(Arrays.toString(numerosInv));
        //* */

        entrada.close();
    
    }

}
