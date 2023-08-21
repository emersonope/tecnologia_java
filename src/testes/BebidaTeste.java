package testes;

import dominio.Bebida;
import exception.ProdutoException;

public class BebidaTeste {
    public static void main(String[] args) {
        Bebida bebida1 = new Bebida("Coca-Cola", 3.5f, 101, true, 500.0f, "Coca-Cola Company");
        Bebida bebida2 = new Bebida("Guaraná", 3.0f, 102, true, 500.0f, "Antarctica");

        System.out.println(bebida1);
        System.out.println(bebida2);

        try {
            bebida1.aplicarDesconto(10); // Aplica um desconto de 10% à bebida1
            bebida2.aplicarDesconto(60); // Isso lançará uma ProdutoException
        } catch (ProdutoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }
    }
}
