package POO.Aula04ex;

public class CelularEx4 {
    private String modelo;
    private int bateria;
    private boolean ligado;


    public CelularEx4() {
        this.bateria = 100;
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public void carregar(){
        if (getBateria() < 15){
            System.out.println("Carregando....");
            setBateria(100);
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void status(){
        System.out.println("O modelo do CELULAR e "+getModelo());
        System.out.println("O celular tem "+getBateria()+"%");
        System.out.println("O celular esta ligado? "+isLigado());
    }
}
