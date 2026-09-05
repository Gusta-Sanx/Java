package Colection.Biblioteca;

import Colection.Coletion;

import java.util.*;

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


//        List<Livro> ordemIsbn = new LinkedList<>();
        Queue<Livro> ordemIsbn = new PriorityQueue<>(new Biblioteca.LivroComparator().reversed());
        ordemIsbn.add(new Livro(4187,"Joao e o pe de feijao","Maria"));
        ordemIsbn.add(new Livro(1235,"Noite","Dotor Pedro"));
        ordemIsbn.add(new Livro(4336,"Joao e o pe de feijao","Maria"));
        ordemIsbn.add(new Livro(1234,"Noites Brancas","Doto"));


        while (!ordemIsbn.isEmpty()){
            System.out.println(ordemIsbn.poll());
        }
        System.out.println("+++++++++");
//        Collections.sort(ordemIsbn,new Biblioteca.LivroComparator().reversed());
        for(Livro livros : ordemIsbn){
            System.out.println(livros);
        }





        // metodo de seguranca
        try {
            l1.adicionarCategoria("terror");
            l2.adicionarCategoria("terror");
            l1.adicionarCategoria("romance");
            l1.removerCategoria("terror");
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
    }
}
