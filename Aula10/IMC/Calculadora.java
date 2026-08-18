package IMC;

import java.text.DecimalFormat;

public class Calculadora {
    private double peso;
    private float alt;

    public float getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void Imc() {
        double imc;
        imc = peso / (alt * alt);

        System.out.println(imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso") ;
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3 ou morbida");
        }
        DecimalFormat df = new DecimalFormat("#");//Cortador de casa decimal
        System.out.println(df.format(imc));
    }
}
