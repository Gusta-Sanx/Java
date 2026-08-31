package POO.Aula11;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Ana",22,'F');
        Aluno a1 = new Aluno("Pedro",15,'M',"0235 98","ds");
        Bolsista b1 = new Bolsista("Livia",16,'F',"0231---@23","adm",30.5f);
        System.out.println(b1.Status());
        System.out.println("===========");
        System.out.println(v1.Status());
        System.out.println("===========");
        System.out.println(a1.Status());
        System.out.println("===========");

    }
}
