import java.util.Scanner;

public class Atv02 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10];
        double sum = 0;
        int cont = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota: ");
            numeros[i] = entrada.nextInt();
            if (numeros[i] >10){
                System.out.println("Número invalido OTARIO 🤣🤣🤣");
                break;
            }
        }
        for (double n : numeros) {
            sum += n;}
        for (int i = 0; i < numeros.length;i++){
            if (numeros[i] >= 7){
                cont += 1;
            }
        }

        double Mnota = sum / numeros.length;
        System.out.println("As notas >= a 7 foram: "+cont);
        System.out.println("A media é: "+Mnota);

    }
}

