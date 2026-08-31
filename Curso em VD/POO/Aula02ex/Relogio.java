package POO.Aula02ex;

import java.util.Date;

public class Relogio {
    public String tiporelogio;
    private boolean ligado;


    protected void liga(){
        System.out.println("O relogio esta ligando...");
        ligado = true;
    }
    public void horario(){
        if (this.ligado == true) {

            Date data = new Date();
            System.out.println("Data e hora: "+data.toString());
        }
    }
    public void status(){
        System.out.println("O tipo de relogio e "+this.tiporelogio);
        if (this.ligado == true){
            System.out.println("O relogio esta ligado ");
        }
        else {
            System.out.println("O relogio esta deligado");
        }
}
}
