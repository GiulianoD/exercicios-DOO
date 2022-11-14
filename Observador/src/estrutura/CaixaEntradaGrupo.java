package estrutura;

public class CaixaEntradaGrupo {
    private String mensagem;
    private Observable ob;

    public Observable getObservable() {
        return ob;
    }
    public void setObservable(Observable ob) {
        this.ob = ob;
    }

    public CaixaEntradaGrupo() {
        ob = new Observable();
    }

    public String getMensagem() {
        return mensagem;
    }
    public void setNovaMensagem(String mensagem) {
        this.mensagem = mensagem;
        ob.notifyObserver();
    }
}
