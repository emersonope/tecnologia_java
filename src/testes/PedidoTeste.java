package testes;

import dominio.*;

import java.time.LocalDateTime;
import java.util.*;

public class PedidoTeste {
    public static void main(String[] args) {
        Bebida bebida1 = new Bebida("Coca-Cola", 3.5f, 101, true, 500.0f, "Coca-Cola Company");
        Comida comida1 = new Comida("Pizza", 25.0f, 201, 800.0f, false, "Queijo, tomate, massa");
        Sobremesa sobremesa1 = new Sobremesa("Sorvete", 8.0f, 301, 150.0f, true, "Chocolate");

        List<Produto> produtosList = new ArrayList<>(Arrays.asList(bebida1, comida1, sobremesa1));
        Produto[] produtosArray = {bebida1, comida1, sobremesa1};
        Set<Produto> produtosSet = new HashSet<>(Arrays.asList(bebida1, comida1, sobremesa1));

        Pedido pedido = new Pedido("Pedido de exemplo", LocalDateTime.now(), true, bebida1, produtosArray, produtosList, produtosSet);

        System.out.println(pedido);
    }
}
