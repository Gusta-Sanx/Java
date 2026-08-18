package Aula04;

public class CanetaA4 {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;


    public CanetaA4(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.setTampada(true);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Cor: "+ getCor());
        System.out.println("Ponta: "+ getPonta());
        System.out.println("Tampada: "+isTampada());
    }
}

