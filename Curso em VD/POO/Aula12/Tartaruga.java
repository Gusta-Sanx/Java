package POO.Aula12;

public class Tartaruga extends Reptil {

    public Tartaruga(double peso,int idade,int membros, String corCasco){
        super(peso,idade,membros,corCasco,"CorCasco");
    }
    @Override
    public void locomover(){
        System.out.println("Caminhando lentamente....");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo folhas...");
    }

}

