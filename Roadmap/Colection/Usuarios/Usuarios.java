package Colection.Usuarios;

import java.util.HashSet;
import java.util.Set;

public class Usuarios {
    private String Nome;
    private Set<String> permissoes = new HashSet<>();

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Set<String> getPermissao() {
        return permissoes;
    }

    public void setPermissoes(Set<String> permissoes) {
        this.permissoes = permissoes;
    }

    public void adicionarPermissao(String permissao){
        permissoes.add(permissao);
        System.out.println("Permissao concedida!");
    }

    public boolean possuiPermissao(String permissao){

        return permissoes.contains(permissao);
    }

}
