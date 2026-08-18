import java.util.Scanner;

public class ATV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if(idade >= 16){
            System.out.println("Pode votar");
        }
        else{
            System.out.println("n pode votar");
        }


        entrada.close();
    
    }
}
