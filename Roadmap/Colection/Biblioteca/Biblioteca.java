package Colection.Biblioteca;

import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private Map<Integer, Livro> livrosPorIsbn = new HashMap<>();

    public Biblioteca() {
    }

    public Boolean cadastrarLivro(Livro livro){
        if (livros.contains(livro) || livrosPorIsbn.containsKey(livro.getIsbn())) {
            throw new IllegalArgumentException("Livro ja adicionado");
        }  else {
            livros.add(livro);
            livrosPorIsbn.put(livro.getIsbn(),livro);
                return true;
        }
    }

    public Livro buscarLivro(int isbn){
        return livrosPorIsbn.get(isbn);
    }

    public boolean removerLivro(int isbn){
        if (!livrosPorIsbn.containsKey(isbn)){
            throw new IllegalArgumentException("Livro nao encontrado");
        }else {
            livros.remove(livrosPorIsbn.get(isbn));
            livrosPorIsbn.remove(isbn);
            return true; //remove e retona o sucesso
        }
    }
    public List<Livro> listarLivros(){
        return livros;
    }

    public List<Livro> buscarPorCategoria(String categoria){
        List<Livro> listaCat = new ArrayList<>();
        for(Livro livro : livros){
            if (livro.getCategorias().contains(categoria)){
                listaCat.add(livro);
            }
        }
        return listaCat;
    }
}
