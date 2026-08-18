package Herancaex;

public class Main {
    public static void main(String[] args) {

        PessoaFisica c1 = new PessoaFisica("Ana","Sp","432.432.222-59");
        c1.exibirDados();

        PessoaJuridica j1 = new PessoaJuridica("Pedro","Araras","57.562.076/0001-28");
        System.out.println("=============");
        j1.exibirDados();
    }
}
