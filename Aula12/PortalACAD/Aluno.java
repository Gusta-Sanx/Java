package PortalACAD;

public class Aluno extends Usuario{
    public int rm;
    private String cpf;

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null) {
            System.out.println("CPF não informado");
            return;
        }

        String cpfL = cpf.replaceAll("[^0-9]", "");

        if(cpfL.length() == 11){
            this.cpf = cpfL;
        }else{
            System.out.println("cpf invalido ");
        }
    }

    public Aluno(String nome, String Login, String senha, String cpf) {
        super(nome, Login, senha);
        this.setCpf(cpf);
    }


    @Override
    public void realizarLogin(){
        System.out.println("Login realizado como ALUNO");
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("Login do aluno: " + this.getLogin());
        System.out.println("Cpf do aluno: " + (cpf != null ? cpf : "não cadastrado"));
    }


}
