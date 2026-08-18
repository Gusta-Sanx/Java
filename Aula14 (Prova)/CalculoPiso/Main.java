package CalculoPiso;

public class Main {
    public static void main(String[] args) {

        PisoCeramico pc1 = new PisoCeramico(30,30,400);
        PisoMadeira pm1 = new PisoMadeira(30,30,10000);
        PisoVinilco pv1 = new PisoVinilco(30,30,2500);


        pc1.statusGeral();
        pm1.statusGeral();
        pv1.statusGeral();

    }
}
