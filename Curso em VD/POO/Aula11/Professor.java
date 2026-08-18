package Aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private int salario;

    public Professor(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void receberAumento(){

    }

}
