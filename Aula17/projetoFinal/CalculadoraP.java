package com.mycompany.aula17;

public class CalculadoraP {

    private double primeiroNumero;
    private double segundoNumero;
    private String operacao;

    public CalculadoraP() {
        limpar();
    }

    public void limpar() {
        primeiroNumero = 0;
        segundoNumero = 0;
        operacao = "";
    }

    public void prepararOperacao(double numero, String operacao) {
        this.primeiroNumero = numero;
        this.operacao = operacao;
    }

    public double calcular(double segundoNumero) {
        this.segundoNumero = segundoNumero;

        switch (operacao) {
            case "+":
                return primeiroNumero + segundoNumero;

            case "-":
                return primeiroNumero - segundoNumero;

            case "*":
                return primeiroNumero * segundoNumero;

            case "/":
                if (segundoNumero == 0) {
                    throw new ArithmeticException("Não é possível dividir por zero");
                }

                return primeiroNumero / segundoNumero;

            default:
                return segundoNumero;
        }
    }

    public double getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
