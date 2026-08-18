package Aula5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Cliente c1 = new Cliente();
        c1.setNome("ana");
        Cliente c2 = new Cliente();
        c1.setNome("Pedro");



        Banco b1 = new Banco();
        b1.setNumConta(111);
        b1.abrirConta("cc");
        b1.setDono(c1);
        b1.depositar(100);
        b1.sacar(150);
        b1.pagarMensal();

        b1.statusAt();
        System.out.println("===============");

        Banco b2 = new Banco();
        b2.setNumConta(1010);

        b2.abrirConta("cb");
        b2.pagarMensal();
        b2.fecharConta();

        b2.statusAt();
//
//        System.out.print("Digite o tipo de conta: ");
//        c1.abrirConta(ent.next());
//        System.out.print("Digite o numero da conta: ");
//        c1.numConta = ent.nextInt();
//
//        System.out.print("Digite o valor a ser depositado: ");
//        c1.depositar(ent.nextFloat());
//
//        System.out.print("Pagando a mensalidade: ");
//        c1.pagarMensal();
//
//        System.out.println("Fechando...");
//        c1.fecharConta();
//
//        System.out.print("saque: ");
//        c1.sacar(ent.nextFloat());


    }
}
