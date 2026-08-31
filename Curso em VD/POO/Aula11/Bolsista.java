package POO.Aula11;


public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }


    public Bolsista(String nome, int idade, char sexo, String matricula, String curso, float bolsa ) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }


    public void renovarBolsa(){
        System.out.println("Pagando a mensalidade de "+this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome+" e bolsista pagamento facilitado");
    }
}
