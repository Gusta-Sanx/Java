package POO.Aula14;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Minzin dos cria");
        v[1] = new Video("Roubei o govern veja no que deu 😨😨😨");
        v[2] = new Video("Poison Tree.");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Joana",18,'F',"0jA4a");
        g[1] = new Gafanhoto("Kalos", 16, 'M', "121AS");
        g[2] = new Gafanhoto("Hugo Boss", 43,'M',"an4l1");


//        v[0].like();
//        System.out.println(v[0].toString());
//        System.out.println(g[1].toString());

        Vizualizacao vis[] = new Vizualizacao[3];
        vis[2] = new Vizualizacao(v[0], g[0]);
        System.out.println(vis[0].toString());
        vis[0] = new Vizualizacao(v[1], g[0]);
        vis[1] = new Vizualizacao(v[2], g[0]);
    }
}
