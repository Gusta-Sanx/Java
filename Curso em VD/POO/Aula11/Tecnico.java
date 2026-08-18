package Aula11;

public class Tecnico extends Aluno{
    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public Tecnico(String nome, int idade, char sexo, String matricula, String curso, int registroProfissional){
        super(nome, idade, sexo, matricula, curso);
        setMatricula(matricula);
        this.registroProfissional = registroProfissional;
    }

    public void praticar(){

    }
}
