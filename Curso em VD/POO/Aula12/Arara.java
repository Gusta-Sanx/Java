package POO.Aula12;

public class Arara extends Ave {

    public Arara(double peso, int idade, int membros, String corPena){
        super(peso,idade,membros,corPena);
    }
    @Override
    public void alimentar(){
        System.out.println("comendo guarana...");
    }
}
