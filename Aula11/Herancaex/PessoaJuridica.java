package Herancaex;

public class PessoaJuridica extends Pessoa implements IPessoas {

    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados(){
        System.out.println("====PESSOA JURIDICA====");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("CNPJ: " + cnpj);
    }
}
