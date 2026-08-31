package POO.Aula8;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(Pessoa leitor, String titulo, String autor, int totPaginas) {
        this.leitor = leitor;
        this.titulo = titulo;
        this.pagAtual = 0;
        this.aberto = false;
        this.totPaginas = totPaginas;
        this.autor = autor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        if(totPaginas > 0){
            this.totPaginas = totPaginas;
        }
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {

    }

    @Override
    public void folear(int p) {
        if(aberto && p > 0 && p <= totPaginas){
            this.setPagAtual(p);
        }else{
            System.out.println("Nao foi possivel folear!");
        }
    }


    @Override
    public void avancarPag() {
        if (aberto && pagAtual < totPaginas) {
            this.pagAtual++;
        }else{
            System.out.println("Nao foi possivel avancar!");
        }
    }

    @Override
    public void voltarPag() {
        if (aberto && pagAtual > 0) {
            this.pagAtual--;
        }else{
            System.out.println("nao foi possivel voltar!");
        }
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", aberto=" + aberto +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", leitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", sexo=" + leitor.getSexo() +
                '}' ;
    }
}
