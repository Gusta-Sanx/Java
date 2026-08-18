package Aula7;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "Franca",
                31, 1.75, 68.9f, 1, 3, 1);

        l[1]= new Lutador("Putscript", "Brasil",
                29, 1.68, 57.8f, 14, 2, 3);

        l[2]= new Lutador("Snapshadow", "EUA",
                35, 1.65, 80.9f, 12, 2, 1);

        l[3]= new Lutador("Dead Code", "Australia",
                28, 1.93, 81.6f, 13, 0, 2);

        l[4]= new Lutador("Ufocobol", "Brasil",
                37, 1.70, 119.3f, 5, 4, 3);

        l[5] = new Lutador("Nerdaart", "EUA",
                30, 1.81, 105.7f, 12, 4, 2);

        Luta UFC250 = new Luta();
        Luta UFC251 = new Luta();
        Luta UFC252 = new Luta();

        UFC250.marcarluta(l[4], l[5]);
        UFC251.marcarluta(l[0], l[1]);
        UFC252.marcarluta(l[2], l[3]);
        UFC250.lutar();
        UFC251.lutar();
        UFC252.lutar();


        System.out.println("===========");
        l[4].status();
        l[5].status();
        System.out.println("===========");
        l[0].status();
        l[1].status();
        System.out.println("===========");
        l[2].status();
        l[3].status();
        System.out.println("===========");

    }
}
