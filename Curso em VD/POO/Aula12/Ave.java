package Aula12;

public class Ave extends Animal{
    private String corPena;

    public Ave(double peso, int idade, int membros, String corPena){
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    @Override
    public String getcorExibicao(){
        return "corPena = "+ this.corPena;
    }

    public String getCorPelo() {
        return corPena;
    }

    public void setCorPelo(String corPelo) {
        this.corPena = corPelo;
    }

    @Override
    public void locomover(){
        System.out.println("Voando...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    public void fazerNinho(){
        System.out.println("Fazendo o ninho!");
    }
}
