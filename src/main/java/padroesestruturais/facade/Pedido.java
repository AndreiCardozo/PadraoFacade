package padroesestruturais.facade;

public class Pedido {
    public void criarPedido(int idCliente, int idProduto, int quantidade, int idFornecedor) {
        System.out.println("Criando pedido para o produto com id " + idProduto + ", quantidade = " + quantidade + ", cliente com id = " + idCliente + ", fornecedor com id = " + idFornecedor);
    }
}
