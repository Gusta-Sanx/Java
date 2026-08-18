package GerenciadorVendas;

public class TijoloCeramico extends Tijolo {
    public TijoloCeramico(double alturaT, double larguraT, double comprimentoT, int milheiro) {
        super(alturaT, larguraT, comprimentoT, milheiro);
    }

    @Override
    public double calcularValorFinal(int quantidadeTotal) {
        double valorBruto = super.calcularValorFinal(quantidadeTotal);

        if (quantidadeTotal > 1000) {
            valorBruto = (valorBruto * 0.90);
        }

        return valorBruto;
    }
}
