package Aula5;

public class Cliente {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null) {
            throw new IllegalArgumentException("CPF não informado");
        }
        String cpfL = cpf.replaceAll("\\D", "");
        if(cpfL.matches("^\\d{11}")){
            this.cpf = cpfL;
        }else{
            throw new IllegalArgumentException("CPF invalido!");
            }
        }

        public String getCpfFormatado(){
            if(this.cpf == null || cpf.length() != 11){
                return this.cpf;
            }
            return this.cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3}(\\d{2}))","$1.$2.$3-$4");
        }

    }

