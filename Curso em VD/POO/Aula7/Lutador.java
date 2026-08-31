package POO.Aula7;
import java.text.DecimalFormat;

public class Lutador implements Ilutador {
    private String nome;
    private int forca;
    private int vida;
    private int velocidade;
    private String Nacionalidade;
    private int idade;
    private double altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, float peso,
                     int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.vida = 100;
        this.Nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        Nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso <52.2){
            categoria = "invalido";
        }else if(peso <=70.3){
            categoria ="Leve";
        }else if(peso<=83.9){
            categoria = "Medio";
        }else if(peso<=120.2){
            categoria = "pesado";
        }else{
            categoria = "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        DecimalFormat df = new DecimalFormat("#,##0.0");
        System.out.println("NOME: "+this.getNome());
        System.out.println("NACIONALIDADE: "+this.getNacionalidade());
        System.out.println("PESO: "+df.format(this.getPeso()));
        System.out.println("ALTURA: "+this.getAltura());
        System.out.println("CATEGORIA: "+this.getCategoria());
        System.out.println("VITORIAS: "+this.getVitorias());
        System.out.println("DERROTAS: "+this.getDerrotas());
        System.out.println("EMPATES: "+this.getEmpates());
        System.out.println("===============");
    }

    @Override
    public void status() {
        System.out.println("NOME: "+this.getNome());
        System.out.println("CAEGORIA: "+this.getCategoria());
        System.out.println("VITORIAS: "+this.getVitorias());
        System.out.println("DERROTAS: "+this.getDerrotas());
        System.out.println("EMPATES: "+this.getEmpates());
    }


    @Override
    public void ganharLuta() {
        System.out.println("O lutador "+this.getNome()+" ganhou a luta");
        vitorias = vitorias + 1;
    }

    @Override
    public void perderLuta() {
        System.out.println("O lutador "+this.getNome()+" perdeu a luta");
        derrotas = derrotas + 1;
    }

    @Override
    public void empatarLuta() {
        System.out.println("Os lutadores  empataram a luta");
        empates = empates + 1;
    }
}
