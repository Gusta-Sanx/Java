package Aula9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Aluno a1 = new Aluno();


        System.out.println("Digite o nome do aluno: ");
        a1.setNome(ent.next());
        System.out.println("Digite as notas do aluno: ");
        a1.setNota1(ent.nextDouble());
        a1.setNota2(ent.nextDouble());
        a1.calcularMedia();

        System.out.println("Nome:" + a1.getNome());
        System.out.println("Nota:" + a1.getNota1());
        System.out.println("Nota2:" + a1.getNota2());
        System.out.println("Media:" + a1.calcularMedia());
        System.out.println("O PortalACAD.Aluno passou?: " + a1.passouAno());
    }
}
