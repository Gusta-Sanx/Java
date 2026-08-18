package GerenciadorVendas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoTijolo;

        do {
            System.out.print("Tipo (1-Ceramico, 2-Ecologico, 3-Estrutural, 0-Sair): ");
            tipoTijolo = scanner.nextInt();

            if (tipoTijolo == 0) {
                break;
            }

            System.out.print("Altura: ");
            double alt = scanner.nextDouble();

            System.out.print("Largura: ");
            double larg = scanner.nextDouble();

            System.out.print("Comprimento: ");
            double comp = scanner.nextDouble();

            System.out.print("Valor do milheiro: ");
            int milheiro = scanner.nextInt();

            System.out.print("Área da parede: ");
            double areaParede = scanner.nextDouble();


            Tijolo tijoloObjeto;
            String nomeTipo;

            if (tipoTijolo == 1) {
                tijoloObjeto = new TijoloCeramico(alt, larg, comp, milheiro);
                nomeTipo = "Cerâmico";
            } else if (tipoTijolo == 2) {
                tijoloObjeto = new TijoloEcologico(alt, larg, comp, milheiro);
                nomeTipo = "Ecológico";
            } else {
                tijoloObjeto = new TijoloEstrutural(alt, larg, comp, milheiro);
                nomeTipo = "Estrutural";
            }


            int qtdPorM2 = tijoloObjeto.Calculaqnt();
            int qtdTotal = (int) (qtdPorM2 * areaParede);
            int valorFinal = (int) tijoloObjeto.calcularValorFinal(qtdTotal);

            System.out.println("\nTipo: " + nomeTipo);
            System.out.println("Quantidade por m²: " + qtdPorM2);
            System.out.println("Quantidade total: " + qtdTotal);
            System.out.println("Valor final: R$ " + valorFinal + "\n");

        } while (tipoTijolo != 0);
    }
}