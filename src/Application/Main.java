package Application;

import dominio.*;
import exception.ProdutoException;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bebida bebida1 = new Bebida("Coca-Cola", 3.5f, 101, true, 500.0f, "Coca-Cola Company");
        Comida comida1 = new Comida("Pizza", 25.0f, 201, 800.0f, false, "Queijo, tomate, massa");
        Sobremesa sobremesa1 = new Sobremesa("Sorvete", 8.0f, 301, 150.0f, true, "Chocolate");

        Solicitante solicitante1 = new Solicitante("João", "123.456.789-00", "joao@example.com");

        List<Produto> produtosList = new ArrayList<>(Arrays.asList(bebida1, comida1, sobremesa1));

        // Convertendo a List<Produto> para Produto[]
        Produto[] produtosArray = produtosList.toArray(new Produto[produtosList.size()]);

        Set<Produto> produtosSet = new HashSet<>(Arrays.asList(bebida1, comida1, sobremesa1));

        Pedido pedido = new Pedido("Pedido de exemplo", LocalDateTime.now(), true, bebida1, produtosArray, produtosList, produtosSet);

        // Chamar métodos
        System.out.println("=== Chamando métodos ===");

        // Métodos das classes de domínio
        System.out.println(bebida1);
        try {
            bebida1.aplicarDesconto(10);
        } catch (ProdutoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

        System.out.println(comida1);
        try {
            comida1.aplicarDesconto(5);
        } catch (ProdutoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

        System.out.println(sobremesa1);
        try {
            sobremesa1.aplicarDesconto(10);
        } catch (ProdutoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

        // Métodos da classe Solicitante
        System.out.println(solicitante1);

        // Métodos da classe Pedido
        System.out.println(pedido);
    }
}