package dominio;

import exception.ProdutoException;

public class Comida extends Produto {
    private float peso;
    private boolean vegano;
    private String ingrediente;

    public Comida(String nome, float valor, int codigo, float peso, boolean vegano, String ingrediente) {
        super(nome, valor, codigo);
        this.peso = peso;
        this.vegano = vegano;
        this.ingrediente = ingrediente;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isVegano() {
        return vegano;
    }

    public String getIngrediente() {
        return ingrediente;
    }
    @Override
    public void aplicarDesconto(float percentual) throws ProdutoException {
        if (percentual < 0 || percentual > 10) {
            throw new ProdutoException("Percentual de desconto inválido para comida.");
        }

        float desconto = valor * (percentual / 100);
        valor -= desconto;
        System.out.println("Desconto de " + percentual + "% aplicado a " + nome);
    }
}
