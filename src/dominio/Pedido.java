package dominio;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Pedido {
    private String descricao;
    private LocalDateTime data;
    private boolean web;
    private Produto produto; // Relação 1:1 com Produto
    private Produto[] produtosArray; // Atributo do tipo vetor (array)
    private List<Produto> produtos; // Relação 1:n com a classe mãe
    private Set<Produto> produtosSet; // Atributo do tipo Set

    public Pedido(String descricao, LocalDateTime data, boolean web, Produto produto, Produto[] produtosArray, List<Produto> produtos, Set<Produto> produtosSet) {
        this.descricao = descricao;
        this.data = data;
        this.web = web;
        this.produto = produto;
        this.produtosArray = produtosArray;
        this.produtos = produtos;
        this.produtosSet = produtosSet;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", web=" + web +
                ", produto=" + produto +
                ", produtos=" + produtos +
                ", produtosArray=" + Arrays.toString(produtosArray) +
                ", produtosSet=" + produtosSet +
                '}';
    }
}

