package Aula5;

public class Banco {
    public int numConta;
    protected String tipo;
    private Cliente dono;
    private boolean status;
    private float saldo;



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Banco() {
        this.status = false;
        this.saldo = 0;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(this.getTipo().equalsIgnoreCase("cc")){
            this.setSaldo(50);
        }else if(this.getTipo().equalsIgnoreCase("cb")){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("RETIRE SEU SALDO PARA FECHAMENTO");
        }else if(this.getSaldo() < 0){
            System.out.println("FECHAMENTO NEGADO PAGUE SEU DEBITO!");
        }else{
            this.setStatus(false);
            System.out.println("CONTA ENCERRADA COM SUCESSO!");
        }
    }

    public void depositar(float valor){
        if(!this.isStatus()){
            System.out.println("CRIE UMA CONTA PARA DEPOSITAR");
        }else{
            saldo = saldo + valor;
            System.out.println("Depositando...");
//            System.out.println("valor: "+this.getSaldo());
        }
    }

    public void sacar(float saque){
        if(!this.isStatus()){
            System.out.println("CRIE UMA CONTA PRA SACAR");
        }else if(saque > this.getSaldo()){
            System.out.println("VOCE NAO TEM SALDO DISPONIVEL");
        }else{
            saldo = saldo - saque;
            System.out.println("valor: "+this.getSaldo());
        }
    }

    public void pagarMensal() {
        if (this.isStatus()) {
            if (tipo.equalsIgnoreCase("cc")) {
                saldo = saldo - 12;
//            System.out.println("Saldo : "+this.getSaldo());
            } else if (tipo.equalsIgnoreCase("cb")) {
                saldo = saldo - 20;
            }
        }
    }
    public void statusAt(){
        System.out.println("conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Nome do Dono: " + this.getDono().getNome());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status "+this.isStatus());

    }




}
