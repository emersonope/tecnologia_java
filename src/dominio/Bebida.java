package dominio;

import exception.ProdutoException;

public class Bebida extends Produto {
    private boolean gelada;
    private float tamanho;
    private String marca;

    public Bebida(String nome, float valor, int codigo, boolean gelada, float tamanho, String marca) {
        super(nome, valor, codigo);
        this.gelada = gelada;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public boolean isGelada() {
        return gelada;
    }

    public float getTamanho() {
        return tamanho;
    }

    public String getMarca() {
        return marca;
    }
    @Override
    public void aplicarDesconto(float percentual) throws ProdutoException {

        if (percentual < 0 || percentual > 50) {
            throw new ProdutoException("Percentual de desconto inválido para bebida.");
        }

        float desconto = valor * (percentual / 100);
        valor -= desconto;
        System.out.println("Desconto de " + percentual + "% aplicado a " + nome);
    }
}
