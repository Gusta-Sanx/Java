package PortalACAD;

public class Administrador extends Usuario {
    private String nivelAcesso;

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Administrador(String nome, String login, String senha, String nivelAcesso) {
        super(nome, login, senha);
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void realizarLogin() {
        System.out.println("Login realizado como ADMINISTRADOR");
    }

    protected void trocarSenhas(Usuario usuario, String novaSenha) {
        if ("administrador".equalsIgnoreCase(this.getNivelAcesso())) {

            boolean sucesso = usuario.setSenha(novaSenha);

            if (sucesso) {
                System.out.println("Senha trocada com sucesso por ADMINISTRADOR");
            } else {
                System.out.println("Senha inválida! Deve ter 10 caracteres com letras e números");
            }

        } else {
            System.out.println("Voce nao tem acesso");
        }
    }
}


