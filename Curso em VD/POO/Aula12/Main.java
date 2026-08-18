package Aula12;

public class Main {
    public static void main(String[] args) {
        Ave av1 = new Ave(22.5,2,3,"Azul");
        System.out.println(av1.toString());

        Cachorro c1 = new Cachorro(10.5,4,1,"Mestico");
        System.out.println(c1.toString());

        Tartaruga t1 = new Tartaruga(2.5,10,2,"Preto");
        System.out.println(t1.toString());

        Reptil r1 = new Reptil(2.5,10,2,"cinza","Escamas");
        System.out.println(r1.toString());

        Arara ar1 = new Arara(5.2,3,2,"Amarelo");
        System.out.println(ar1.toString());

    }
}
