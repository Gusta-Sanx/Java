package POO.Aula12;

public class Cachorro extends Mamifero{

    public Cachorro(double peso,int idade,int membros,String corPelo){
        super(peso,idade,membros,corPelo);
    }


    @Override
    public void emitirSom(){
        System.out.println("auuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo racao...");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    public void enterrarOsso(){
        System.out.println("Enterrando Osso chefe.");
    }
}
