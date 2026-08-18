package CalculoPiso;

public class PisoMadeira extends Piso{
    public PisoMadeira(double larguraPiso, double comprimentoPiso, int valorReais) {
        super(larguraPiso, comprimentoPiso, valorReais);
    }

    @Override
    public double calcularValorF() {
        return super.calcularValorF() * 1.15;
    }
}
