package PortalACAD;



public class Main {
    public static void main(String[] args) {
    Aluno a1 = new Aluno("Ana","Ana547654","abc1234567","441 437-468-59");
    a1.realizarLogin();

    System.out.println("============");

    Professor p1 = new Professor("Juoca","Joci12131","abc1234567","APS");
    p1.realizarLogin();
    p1.exibirDados();

    System.out.println("============");

    Administrador ad1 = new Administrador("Gusta","adm123","abc1234567","Administrador");
    ad1.realizarLogin();
    ad1.trocarSenhas(p1, "abc1253693");

    System.out.println("============");
    }
}
