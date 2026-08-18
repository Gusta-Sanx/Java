import java.util.Scanner;

public class ArraySc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("quantos produtos deseja cadastrar? ");
        int n = scan.nextInt();

        String[] descricao = new String[n];
        double[] valor = new double[n];
        int[] quantidade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nproduto" + (i + 1));

            System.out.println("descricao: ");
            descricao[i] = scan.next();

            System.out.println("valor: ");
            valor[i] = scan.nextDouble();

            System.out.println("quantidade: ");
            quantidade[i] = scan.nextInt();
        }

        System.out.println("\n===DADOS CADASTRADOS===");

        for (int i = 0; i < n; i++) {
            System.out.println("\nproduto" + (i + 1));
            System.out.println("\nDescricao:" +descricao[i]);
            System.out.println("Valor:" +valor[i]);
            System.out.println("Quantidade:"+quantidade[i]);
        }
        scan.close();
    }
}