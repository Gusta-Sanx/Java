import java.util.Scanner;

public class EX9 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int chega;
        int randomNum = (int)(Math.random() * 101);  // 0 a 100

        System.out.println("====ADIVINHE O NUMERO (1-100)====");

    do{
        System.out.println("Digite o número: ");
        chega = entrada.nextInt();
        if (chega < randomNum){
            System.out.println("O numero é maior");
        }
        else{
            System.out.println("O número é menor");
        }
        System.out.println(randomNum);

    }while (chega != randomNum);

        System.out.println("Voce acertou PARABENS!🎇🎇🎇🎇");


    }
}
