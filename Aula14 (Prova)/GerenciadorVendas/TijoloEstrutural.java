package GerenciadorVendas;

public class TijoloEstrutural extends  Tijolo {
    public TijoloEstrutural(double alturaT, double larguraT, double comprimentoT, int milheiro) {
        super(alturaT, larguraT, comprimentoT, milheiro);
    }

    @Override
    public double calcularValorFinal(int quantidadeTotal) {
        double valorBruto = super.calcularValorFinal(quantidadeTotal);
        valorBruto = valorBruto * 1.15;
        return valorBruto;
    }
}
