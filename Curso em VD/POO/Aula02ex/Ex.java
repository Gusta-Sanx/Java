package POO.Aula02ex;

public class Ex {
    public static void main(String[] args) {
        System.out.println("===============");
        Celular c1 = new Celular();
        c1.modelo = "Iphone 11";
        c1.bateria = 50;
        c1.ligado = false;

        c1.status();
        System.out.println("===============");
        Celular c2 = new Celular();
        c2.modelo = "Iphone 15 pro";
        c2.bateria = 15;
        c2.ligado = true;

        c2.status();
        c2.carregar();

        System.out.println("===============");
        Relogio r1 = new Relogio();
        r1.liga();
        r1.tiporelogio = "Analogico";
//       1.ligado = true;


        r1.status();
        r1.horario();
        System.out.println("===============");



    }
}
