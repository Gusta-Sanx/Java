package PlaylistList;

public class Main {
    public static void main(String[] args) {

        Musica m1 = new Musica("Mulher","Dfideliz",3);
        Musica m2 = new Musica("Mulher3","Dfideliz2",4);
        Playlist pl1 = new Playlist();


        pl1.setNome("gym");
        pl1.adicionarMusica(m1);
        pl1.adicionarMusica(m2);
        pl1.listarMusicas();
        pl1.quantidadeMusicas();
    }
}
