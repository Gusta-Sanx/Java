package CalculoPiso;

public class PisoCeramico extends Piso{
    public PisoCeramico(double larguraPiso, double comprimentoPiso, int valorReais) {
        super(larguraPiso, comprimentoPiso, valorReais);
    }

    @Override
    public double calcularValorF() {
        if(calcularArea() > 80){
            return super.calcularValorF() * 0.88;
        }
        return super.calcularValorF();
    }
}
