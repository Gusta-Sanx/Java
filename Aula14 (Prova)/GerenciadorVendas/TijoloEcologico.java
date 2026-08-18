package GerenciadorVendas;

public class TijoloEcologico extends Tijolo {
    public TijoloEcologico(double alturaT, double larguraT, double comprimentoT, int milheiro) {
        super(alturaT, larguraT, comprimentoT, milheiro);
    }

    @Override
    public double calcularValorFinal(int quantidadeTotal) {
        double valorBruto = super.calcularValorFinal(quantidadeTotal);

        if (quantidadeTotal > 800) {
            valorBruto = valorBruto * 0.85;
        }

        return valorBruto;
    }
}
