package estrutura;

public class Arquivo extends Elemento{
    private int tamanho;

    public Arquivo(int tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public int obterTamanho(){
        return tamanho;
    }
    public void atualizarTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
