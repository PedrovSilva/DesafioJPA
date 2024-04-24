package infocorp.BDTeste.JPAInfocorp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "PedidoFuncionario")
public class PedidoFuncionario {
    @EmbeddedId
    private PedidoFuncionarioId id;
    @OneToOne
    @MapsId("pedidoId")
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
    @OneToOne
    @MapsId("funcionarioId")
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    public PedidoFuncionarioId getId() {
        return id;
    }

    public void setId(PedidoFuncionarioId id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
