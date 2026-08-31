package POO.Aula6;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando =false;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("-----MENU-----");
            System.out.println("Esta ligado? " + this.isLigado());
            System.out.println("Esta tocando? " + this.isTocando());
            System.out.print("Volue: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println(" ");
        }else{
            System.out.println("Nao consegui abrir o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()) {
            System.out.println("Fechando Menu...");
            }else{
            System.out.println("Ligue o dispositivo!");
        }
        }

    @Override
    public void maisVolume() {
        if(isLigado()){
            this.setVolume(volume + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()){
            this.setVolume(volume + 1);
        } else{
            System.out.println("Imposivel aumentar volume");
        }

    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() >0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void playPause() {
        if(this.isLigado() && !(this.isTocando())){
        this.setTocando(true);
        }else{
            System.out.println("Nao consegui pausar");
        }
    }

    @Override
    public void despause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Nao consegui despausar");
        }
    }
}


