package CalculoPiso;


import java.text.DecimalFormat;

public class Piso {
    private double larguraPiso;
    private double comprimentoPiso;
    private int valorReais;

    public Piso(double larguraPiso, double comprimentoPiso, int valorReais) {
        this.larguraPiso = larguraPiso;
        this.comprimentoPiso = comprimentoPiso;
        this.valorReais = valorReais;
    }

    public double getLarguraPiso() {
        return larguraPiso;
    }

    public void setLarguraPiso(double larguraPiso) {
        this.larguraPiso = larguraPiso;
    }

    public double getComprimentoPiso() {
        return comprimentoPiso;
    }

    public void setComprimentoPiso(double comprimentoPiso) {
        this.comprimentoPiso = comprimentoPiso;
    }

    public int getValorReais() {
        return valorReais;
    }

    public void setValorReais(int valorReais) {
        this.valorReais = valorReais;
    }

    public int calcularArea(){
        double areaocupada = (comprimentoPiso +2 )*(larguraPiso +2);
        double pisoMetro2 = 10000 / areaocupada;
        return (int) pisoMetro2;
    }

    public double calcularValorF(){
        return (calcularArea() / 1000.0) * valorReais;
    }

    public void statusGeral(){
        DecimalFormat df = new DecimalFormat("#,##0.00");//"0.00,00"
        System.out.println("======GERENCIADOR DE VALORES======");
        System.out.println("Piso atual: "+this.getClass().getSimpleName());
        System.out.println("Total de pisos: "+calcularArea());
        System.out.println("Valor total: "+df.format(calcularValorF()));

    }

}
