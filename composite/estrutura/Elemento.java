package estrutura;

public abstract class Elemento {
    private String nome;

    public int obterTamanho(){
        return 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
