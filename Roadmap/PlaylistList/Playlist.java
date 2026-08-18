package PlaylistList;



import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
    }

    public void listarMusicas(){
        System.out.println(musicas.toString());
    }

    public void quantidadeMusicas(){
        System.out.println(musicas.size());
    }

}
