package POO.Aula02ex;
import java.util.Date;

public class Celular {
    public String modelo;
    public boolean ligado;
    protected int bateria;

    protected void carregar(){
        if (bateria <= 20){
            System.out.println("caregando....");
            bateria = 100;
            System.out.println("O celuar tem "+bateria+"%");
        }
    }

    public void status(){
        System.out.println("O modelo do CELULAR e "+this.modelo);
        System.out.println("O celular tem "+this.bateria+"%");
        System.out.println("O celular esta ligado? "+this.ligado);
    }
    }
//    void horario(){
//        Date data = new Date();
//        System.out.println("A hora e ");
//        System.out.println(data.toString());
//    }
//}