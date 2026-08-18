package Herancaex;

public class PessoaFisica extends Pessoa implements IPessoas {

    private String cpf;

    public PessoaFisica(String nome, String endereco,  String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibirDados(){
        System.out.println("====PESSOA FISICA====");
        System.out.println("Nome: " + getNome());
        System.out.println("endereco: " + getEndereco());
        System.out.println("CPF: " + getCpf());
    }
}
