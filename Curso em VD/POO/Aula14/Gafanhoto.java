package Aula14;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        setLogin(login);
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null) {
            throw new IllegalArgumentException("Login não pode ser nulo.");
        }

        login = login.replaceAll("^\\s*","");

        if(login.matches("^[a-zA-Z\\d]{5}$")) {
            this.login = login;
        }else {
            throw new IllegalArgumentException("Login Invalido.");
        }
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        totAssistido++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "login=" + login +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
