package Colection.Biblioteca;

import java.beans.BeanInfo;

public class Main {
    public static void main(String[] args) {

        Livro l1 =new Livro(1234,"Noites Brancas","Doto");
        Livro l2 =new Livro(1236,"Noite","Dotor Pedro");
        Livro l3 =new Livro(4336,"Joao e o pe de feijao","Maria");
        Livro l4 =new Livro(4187,"Joao e o pe de feijao","Maria");


        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro(l1);
        biblioteca.cadastrarLivro(l3);
        biblioteca.cadastrarLivro(l2);
        biblioteca.cadastrarLivro(l4);
        l1.adicionarCategoria("terror");
        l2.adicionarCategoria("terror");
        l1.adicionarCategoria("romance");

        System.out.println(l4.toString());

//        System.out.println(biblioteca.buscarPorCategoria("terror"));

        System.out.println(biblioteca.listarLivros());

// metodo de seguranca pro remover cat
//        try {
//            categorias.removerCategoria("");
//        } catch (IllegalArgumentException err) {
//            System.out.println(err.getMessage());
//        }
    }
}
