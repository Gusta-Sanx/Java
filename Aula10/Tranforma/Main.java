package Tranforma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Converter c1 = new Converter();

        System.out.println("Digite a temperatura: ");
        c1.setTemp(ent.nextInt());

        System.out.println("retorno");
        c1.converter();
    }
}
