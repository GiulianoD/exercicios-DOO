package serializa.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
    private String nome;
    private ArrayList<Mensagem> recebido;
    private ArrayList<Mensagem> enviado;

    public Usuario (String nome){
        this.nome = nome;
        this.recebido = new ArrayList<Usuario>();
        this.enviado  = new ArrayList<Usuario>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void receberMenssagem(Mensagem m){
        recebido.add(m);
    }
    public ArrayList<Mensagem> getRecebidos(){
        return recebido;
    }

    public void enviarMenssagem(Mensagem m, Usuario destinatario){
        enviado.add(m);
        destinatario.receberMenssagem(m);
    }
    public ArrayList<Mensagem> getEnviados(){
        return enviado;
    }
}