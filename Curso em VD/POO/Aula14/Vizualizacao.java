package Aula14;

public class Vizualizacao {
    private Gafanhoto espec;
    private Video film;

    public Vizualizacao(Video film, Gafanhoto espec) {
        this.film = film;
        this.espec = espec;
        this.espec.setTotAssistido(getEspec().getTotAssistido()+1);
        this.film.setViews(getFilm().getViews()+1);
    }

    public Gafanhoto getEspec() {
        return espec;
    }

    public void setEspec(Gafanhoto espec) {
        this.espec = espec;
    }

    public Video getFilm() {
        return film;
    }

    public void setFilm(Video film) {
        this.film = film;
    }

    public void avaliar(){
    this.film.setAvaliacao(5);
    }
    public void avaliar(int nota){
    this.film.setAvaliacao(nota);
    }
    public void avaliar(Float porc){
    int tot =0;
    if (porc <= 20) {
        tot = 3;
    } else if (porc <= 50) {
        tot = 5;
    } else if (porc <= 90 ){
        tot = 8;
    } else{
        tot = 10;
    }
        this.film.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Vizualizacao{" +
                "espec=" + espec +
                ", film=" + film +
                '}';
    }
}
