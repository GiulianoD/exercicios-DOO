package coisos;

public class Item {
    StatusItem status;

    String nome;
    String descricao;

    public Item() {
    }

    public StatusItem getStat() {
        return status;
    }
    public void setStatus(StatusItem stat) {
        this.status = stat;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
