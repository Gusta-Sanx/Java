package POO.Aula8;


public class Main {
    public static void main(String[] args) {
            Pessoa[] p = new Pessoa[2];
            Livro[] l = new Livro[2];

            p[0] = new Pessoa("Ana", 16,"F");
            p[1] = new Pessoa("joao",18,"M");

            l[0] = new Livro(p[0], "Joao e o pe de feijao",  "nomeA",  101);
            l[1] = new Livro(p[1], "Macha e o urso", "nomeB", 125);

            l[1].abrir();
            l[1].folear(0);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
