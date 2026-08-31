package POO.Aula14;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
 
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        if(reproduzindo) views++;
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if(!isReproduzindo()){
            this.reproduzindo = true;
            System.out.println("Video Rodando");
        }else{
            System.out.println("Nao foi possivel dar play");
        }
    }

    @Override
    public void pause() {
        if(isReproduzindo()){
            this.reproduzindo = false;
            System.out.println("Video Pausado");
        }else{
            System.out.println("Nao foi possivel pausar");
        }
    }

    @Override
    public void like() {
        curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
