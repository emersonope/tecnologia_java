package dominio;

import exception.ProdutoException;

public abstract class Produto {
    protected String nome;
    protected float valor;
    protected int codigo;

    public Produto(String nome, float valor, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }

    public abstract void aplicarDesconto(float percentual) throws ProdutoException;

}

