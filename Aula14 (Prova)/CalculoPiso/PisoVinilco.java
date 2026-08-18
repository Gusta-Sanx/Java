package CalculoPiso;

public class PisoVinilco extends Piso{
    public PisoVinilco(double larguraPiso, double comprimentoPiso, int valorReais) {
        super(larguraPiso, comprimentoPiso, valorReais);
    }

    @Override
    public double calcularValorF() {
        if(calcularArea() > 100){
            return super.calcularValorF() * 0.95;
        }
        return super.calcularValorF();
    }
}
