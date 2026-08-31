package POO.Aula04ex;

public class Ex04 {
    public static void main(String[] args) {

    CelularEx4 c1 = new CelularEx4();
    c1.status();
    System.out.println("======================");
    CelularEx4 c2 = new CelularEx4();
    c2.setModelo("Iphone 11 pro");
    c2.setBateria(10);
    c2.status();
    c2.carregar();
    c2.setLigado(true);
    c2.status();
    }
}

