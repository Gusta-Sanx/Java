package POO.Aula11;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        setMatricula(matricula);
        this.curso = curso;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null) {
            throw new IllegalArgumentException("Matrícula não pode ser nula.");
        }

        matricula = matricula.replaceAll("\\D", "");

        if (!matricula.matches("^\\d{6}$")) {
            throw new IllegalArgumentException("Matrícula inválida! Deve conter exatamente 6 dígitos numéricos.");
        }

        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    public void pagarMensalidade(){
        System.out.println("Pagando a mensalidade de "+this.nome);
    }
}
