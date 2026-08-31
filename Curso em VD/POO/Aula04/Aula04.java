package POO.Aula04;


public class Aula04 {
    public static void main(String[] args) {
    CanetaA4 c1 = new CanetaA4("NIC",0.4f,"Amarelo");
    c1.status();
    System.out.println("================");
    CanetaA4 c2 = new CanetaA4("NIC",0.4f,"Amarelo");
    c2.setPonta(0.6f);
    c2.setCor("Preto");
    c2.setModelo("BIC");
    c2.setTampada(false);
    c2.status();

    }
}
