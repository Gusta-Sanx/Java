package Banco;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Banco c1 = new Banco();
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o tipo de conta: ");
        c1.abrirConta(ent.next());
        System.out.print("Digite o numero da conta: ");
        c1.numConta = ent.nextInt();

        System.out.print("Digite o valor a ser depositado: ");
        c1.depositar(ent.nextFloat());

        System.out.println("Pagando a mensalidade: ");
        c1.pagarMensal();


        System.out.println("Fechando...");
        c1.fecharConta();

        System.out.println("saque: ");
        c1.sacar(ent.nextFloat());

        System.out.println("Fechando...");
        c1.fecharConta();


        System.out.println("Status atual: ");
        c1.statusAt();




    }
}
