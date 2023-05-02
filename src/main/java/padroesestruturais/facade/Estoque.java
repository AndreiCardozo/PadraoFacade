package padroesestruturais.facade;

public class Estoque {
    private int estoqueInicial = 10;
    private int estoqueAtual = estoqueInicial;

    public void atualizarEstoque(int idProduto, int quantidade) {
        estoqueAtual -= quantidade;
        System.out.println("Atualizando estoque do produto com id " + idProduto + ": estoque atual = " + estoqueAtual);
    }
}
