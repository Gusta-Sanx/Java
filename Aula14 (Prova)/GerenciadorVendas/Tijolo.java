package GerenciadorVendas;



public class Tijolo {
    private double alturaT;
    private double larguraT;
    private double comprimentoT;
    private int milheiro;

    public Tijolo(double alturaT, double larguraT, double comprimentoT, int milheiro) {
        this.alturaT = alturaT;
        this.larguraT = larguraT;
        this.comprimentoT = comprimentoT;
        this.milheiro = milheiro;
    }
    public double getAlturaT() {
        return alturaT;
    }

    public void setAlturaT(double alturaT) {
        this.alturaT = alturaT;
    }

    public double getLarguraT() {
        return larguraT;
    }

    public void setLarguraT(double larguraT) {
        this.larguraT = larguraT;
    }

    public double getComprimentoT() {
        return comprimentoT;
    }

    public void setComprimentoT(double comprimentoT) {
        this.comprimentoT = comprimentoT;
    }

    public int getMilheiro() {
        return milheiro;
    }

    public void setMilheiro(int milheiro) {
        this.milheiro = milheiro;
    }

    public double calcularValorFinal(int quantidadeTotal) {
        double valorBruto = (quantidadeTotal * this.milheiro) / 1000.0;
        return (int) valorBruto;
    }

    public int Calculaqnt() {
        double areaOc = (comprimentoT + 1) * (alturaT + 1);
        double tijoloM2 = 10000 / areaOc;
        System.out.println(tijoloM2);
        return (int) tijoloM2;
    }
}
