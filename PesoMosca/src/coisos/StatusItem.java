package coisos;

public class StatusItem {
    Estado estado;
    Boolean podeCancelar;
    Boolean compraConcluida;

    public enum Estado {
        CARRINHO,
        FECHADO,
        PAGO,
        ENVIADO,
        ENTREGUE
    }

    public StatusItem(Estado estado, Boolean podeCancelar, Boolean compraConcluida) {
        this.estado = estado;
        this.podeCancelar = podeCancelar;
        this.compraConcluida = compraConcluida;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Boolean getPodeCancelar() {
        return podeCancelar;
    }
    public void setPodeCancelar(Boolean podeCancelar) {
        this.podeCancelar = podeCancelar;
    }
    public Boolean getCompraConcluida() {
        return compraConcluida;
    }
    public void setCompraConcluida(Boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    }
}
