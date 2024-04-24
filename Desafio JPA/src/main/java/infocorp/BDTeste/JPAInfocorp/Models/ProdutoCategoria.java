package infocorp.BDTeste.JPAInfocorp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "ProdutoCategoria")
public class ProdutoCategoria {
    @EmbeddedId
    private ProdutoCategoriaId id;
    @ManyToOne
    @MapsId("produtoId")
    @JoinColumn(name = "produto_id")
    private Produto produto;
    @OneToOne
    @MapsId("categoriaId")
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public ProdutoCategoriaId getId() {
        return id;
    }

    public void setId(ProdutoCategoriaId id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
