package infocorp.BDTeste.JPAInfocorp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class ProdutoCategoriaId implements Serializable {
    @Column(name = "produto_id")
    private int produtoId;
    @Column(name = "categoria_id")
    private int categoriaId;

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }
}
