package Aula9;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String passouAno() {
        if (calcularMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
