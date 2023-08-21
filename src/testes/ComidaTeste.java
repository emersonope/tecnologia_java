package testes;

import dominio.Comida;
import exception.ProdutoException;

public class ComidaTeste {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Pizza", 25.0f, 201, 800.0f, false, "Queijo, tomate, massa");

        try {
            comida1.aplicarDesconto(5); // Aplica um desconto de 5% à comida1
            comida1.aplicarDesconto(15); // Isso lançará uma ProdutoException
        } catch (ProdutoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }
    }
}

