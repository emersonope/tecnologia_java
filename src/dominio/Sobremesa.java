package dominio;

import exception.ProdutoException;

public class Sobremesa extends Produto {
    private float quantidade;
    private boolean doce;
    private String informacao;

    public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean doce, String informacao) {
        super(nome, valor, codigo);
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacao = informacao;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public boolean isDoce() {
        return doce;
    }

    public String getInformacao() {
        return informacao;
    }

    @Override
    public void aplicarDesconto(float percentual) throws ProdutoException {
        // Sobremesa não terá desconto
        throw new ProdutoException("Sobremesas não podem receber desconto.");
    }
}
