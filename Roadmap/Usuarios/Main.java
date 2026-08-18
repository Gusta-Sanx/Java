package Usuarios;

public class Main {
    public static void main(String[] args) {
    Usuarios usuario = new Usuarios();



        usuario.adicionarPermissao("ADMIN");
        usuario.adicionarPermissao("USER");

        System.out.println(usuario.possuiPermissao("ADMIN"));
        System.out.println(usuario.possuiPermissao("MODERADOR"));
    }
}
