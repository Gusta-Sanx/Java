package PortalACAD;

public class Professor extends Usuario{
    String diciplina;

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public Professor(String nome, String Login, String senha, String diciplina) {
        super(nome, Login, senha);
        this.diciplina = diciplina;
    }

    @Override
    public void realizarLogin() {
        System.out.println("Login realizado como PROFESSOR");
    }
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Login: " + this.getLogin());
        System.out.println("Diciplina: " + this.diciplina);
        System.out.println("Senhas: "+this.getSenha());
    }
}
