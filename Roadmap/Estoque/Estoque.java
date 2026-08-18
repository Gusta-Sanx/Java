package Estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Integer,Produto> produtos = new HashMap<>();

    public Map<Integer, Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<Integer, Produto> produtos) {
        this.produtos = produtos;
    }
    public void cadastrarProduto(Produto produto){
        produtos.put(produto.getCodigo(),produto);
    }
    public Produto buscarProduto(int codigo){
        return produtos.get(codigo);
    }
    public void removerProduto(int codigo){
            produtos.remove(codigo);
    }

}
