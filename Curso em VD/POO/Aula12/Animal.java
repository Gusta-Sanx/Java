package Aula12;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membroo;

    public Animal(double peso, int idade, int membroo) {
        this.peso = peso;
        this.idade = idade;
        this.membroo = membroo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembroo() {
        return membroo;
    }

    public void setMembroo(int membroo) {
        this.membroo = membroo;
    }

    void locomover(){}
    void alimentar(){}
    void emitirSom(){}

    protected abstract String getcorExibicao();

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membroo=" + membroo +
                ", "+ getcorExibicao() +" }";
    }
}
