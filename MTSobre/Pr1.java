public class Pr1 { // Muito usado para n ficar repitindo
    // variaveis porem exige outro metodo!
    void mostrar(int x) {
        System.out.println("int: " + x);
    }

    void mostrar(double x) {
        System.out.println("double: " + x);
    }

    void mostrar(int x, int y) {
        System.out.println("dois valores: " + (x + y));
    }

    public static void main(String[] args) {
        Pr1 t = new Pr1();

        t.mostrar(10);
        t.mostrar(3.5);
        t.mostrar(5, 6);
    }
}



