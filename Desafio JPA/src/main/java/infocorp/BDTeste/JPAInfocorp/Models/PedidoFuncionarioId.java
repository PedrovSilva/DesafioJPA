package infocorp.BDTeste.JPAInfocorp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class PedidoFuncionarioId implements Serializable {
    @Column(name = "pedido_id")
    private int pedidoId;
    @Column(name = "funcionario_id")
    private int funcionarioId;

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
}
