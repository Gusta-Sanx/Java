package Colection.Estoque;



public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse",20,2341);
        Produto p2 = new Produto("Mouse2",25,2342);
        Estoque estoque1 = new Estoque();
        estoque1.cadastrarProduto(p1);
        estoque1.cadastrarProduto(p2);
        estoque1.buscarProduto(2342);
    }
}
