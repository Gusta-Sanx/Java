package POO.Aula03 ;

public class Aula03 {
    public static void main(String[] args) {
        CanetaA3 c1 = new CanetaA3();
        c1.modelo ="Bic cristal";
        c1.cor="Azul";
//      c1.ponta = 0.5f;
        c1.carga = 80;
//      c1.tampada =true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
