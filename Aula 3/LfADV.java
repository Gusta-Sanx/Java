import java.util.Scanner;

public class LfADV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite sua nota: ");
        double nota = entrada.nextDouble();//O numero tem que ser escrito com ","


        if(nota >= 6){
            System.out.println("PortalACAD.Aluno aprovado");
        }
        else{
            System.out.println("PortalACAD.Aluno reprovado");
        }

        entrada.close();
    }
}
