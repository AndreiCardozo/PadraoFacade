package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {
    @Test
    void testFacade() {
        GestorEstoque gestorEstoque = new GestorEstoque();
        gestorEstoque.fazerPedido("Camisa", 5, "João");
        gestorEstoque.fazerPedido("Calça", 2, "Maria");
    }
}

