package Banco;

public interface ControladorB {
    public abstract void fecharConta();
    public abstract void abrirConta(String tipo);
    public abstract void sacar(float saque);
    public abstract void depositar(float valor);
    public abstract void pagarMensal();
    public abstract void statusAt();
}
