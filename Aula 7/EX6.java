import java.util.Scanner;

public class EX6 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;


        do{
            System.out.println("1-Oii");
            System.out.println("2-Tchau");
            System.out.println("0-sair");
            System.out.println("Escolha");

            opcao = entrada.nextInt();

            if(opcao==1){

                System.out.println("Oii!!");
            }
            else if(opcao==2){
                System.out.println("Tchau!");
            }
        }while(opcao!=0);


        System.out.println("Programa encerrado");


    }
}
