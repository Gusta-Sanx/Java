package Aula12;

public class Reptil extends Animal{
    private String corEscama;
    private String nomeC;

    public Reptil(double peso, int idade, int membros, String corEscama, String nomeC){ //"Nome C significa o tipo de revestimento de pele"
        super(peso, idade, membros);
        this.corEscama = corEscama;
        this.nomeC = nomeC;
    }

    @Override
    public String getcorExibicao(){
        return this.nomeC + " = " + this.corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("Rastegando...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Reptil");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo algo ai");
    }
}
