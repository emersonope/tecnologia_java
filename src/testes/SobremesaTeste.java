package testes;

import dominio.Sobremesa;
import exception.ProdutoException;

public class SobremesaTeste {
    public static void main(String[] args) {
        Sobremesa sobremesa1 = new Sobremesa("Sorvete", 8.0f, 301, 150.0f, true, "Chocolate");

        try {
            sobremesa1.aplicarDesconto(10); // Isso lançará uma ProdutoException
        } catch (ProdutoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }
    }
}
