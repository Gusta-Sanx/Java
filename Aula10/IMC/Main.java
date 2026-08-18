package IMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Calculadora c1 = new Calculadora();

        System.out.println("Digite seu peso: ");
        c1.setPeso(ent.nextDouble());

        System.out.println("Digite sua altura: ");//JDK ta em portugues
        c1.setAlt(ent.nextFloat());

        c1.Imc();
    }
}
