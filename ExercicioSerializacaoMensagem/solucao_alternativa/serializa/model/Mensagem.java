package serializa.model;

import java.io.Serializable;

public class Mensagem implements Serializable{
    private String texto;
    private Usuario remetente;
    private Usuario destinatario;

    public Mensagem(String texto, Usuario remetente, Usuario destinatario){
        this.texto = texto;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        return texto;
    }

    public void setRemetente(Usuario remetente){
        this.remetente = remetente;
    }
    public Usuario getRemetente(){
        return remetente;
    }

    public void setDestinatario(Usuario destinatario){
        this.destinatario = destinatario;
    }
    public Usuario getdestinatario(){
        return destinatario;
    }
}