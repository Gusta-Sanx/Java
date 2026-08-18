package Aula03;

public class CanetaA3 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Modelo "+ this.modelo);
        System.out.println("ponta "+ this.ponta);
        System.out.println("carga "+ this.carga);
        System.out.println("esta tampada? "+ this.tampada);
    }

    public void rabiscar(){
    if (this.tampada == true){
        System.out.println("Erro n posso rabiscar");
    }
    else{
        System.out.println("Estou rabiscando");
    }

    }
    public void tampar(){
    this.tampada = true;
    }

    public void destampar(){
    this.tampada = false;
    }


}

