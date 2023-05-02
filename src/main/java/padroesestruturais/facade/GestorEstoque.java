package padroesestruturais.facade;

public class GestorEstoque {
    private Estoque estoque;
    private Fornecedor fornecedor;
    private Pedido pedido;
    private Produto produto;
    private Cliente cliente;

    public GestorEstoque() {
        estoque = new Estoque();
        fornecedor = new Fornecedor();
        pedido = new Pedido();
        produto = new Produto();
        cliente = new Cliente();
    }

    public void fazerPedido(String produto, int quantidade, String cliente) {
        int idProduto = this.produto.buscarProduto(produto);
        int idCliente = this.cliente.buscarCliente(cliente);
        int idFornecedor = this.fornecedor.buscarFornecedor(idProduto);
        this.pedido.criarPedido(idCliente, idProduto, quantidade, idFornecedor);
        this.estoque.atualizarEstoque(idProduto, quantidade);
    }
}
