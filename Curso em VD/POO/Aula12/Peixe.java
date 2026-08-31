package POO.Aula12;

public class Peixe extends Animal{

    private String corEscama;
    public Peixe(double peso, int idade, int membros, String corEscama){
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public String getcorExibicao(){
        return "corEscama = "+ this.corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("Nadando...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de peixe");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo agua?");
    }

    public void soltaBolha(){
        System.out.println("Soltando bolhasss..");
    }
}
