import java.util.Scanner;

public class Sbr_SC {
    void mostrar(int x) {
        System.out.println("int: " + x);
    }

    void mostrar(double x) {
        System.out.println("double: " + x);
    }

    void mostrar(String x) {
        System.out.println("string: " + x);
    }

    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    ent.useLocale(java.util.Locale.US);//pra deixar o jav em EUA
    Sbr_SC t = new Sbr_SC();

    int a = ent.nextInt();
    ent.nextLine();
    double b = ent.nextDouble();
    String c = ent.next();

    t.mostrar(a);
    t.mostrar(b);
    t.mostrar(c);

    ent.close();//Desnecesario porem gosto!
    }
}

