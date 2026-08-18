package PortalACAD;

public class Usuario {
    private String nome;
    private String Login;
    private String senha;


    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.Login = login;
        this.setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {//senhas TEM QE SER METODO
        if (senha.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{10}$")) {
            this.senha = senha;
            return true;
        }
        return false;
    }


    public void realizarLogin(){
    }

    public void exibirDados(){
    }
}
