package testes;

import dominio.Solicitante;

public class SolicitanteTeste {
    public static void main(String[] args) {
        Solicitante solicitante1 = new Solicitante("João", "123.456.789-00", "joao@example.com");
        Solicitante solicitante2 = new Solicitante("Maria", "987.654.321-00", "maria@example.com");

        System.out.println(solicitante1);
        System.out.println(solicitante2);
    }
}

