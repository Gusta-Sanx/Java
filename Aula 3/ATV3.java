
import java.util.Scanner;

public class ATV3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua nota: ");

        double nota = entrada.nextDouble();

        if(nota >= 6){
            System.out.println("PortalACAD.Aluno aprovado");
        }
        else{
            System.out.println("PortalACAD.Aluno reprovado");
        }

        entrada.close();

    }
}
