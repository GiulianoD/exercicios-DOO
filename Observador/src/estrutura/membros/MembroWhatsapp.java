package estrutura.membros;

import estrutura.Observable;

public class MembroWhatsapp implements Observer {
    private int numero;

    public MembroWhatsapp(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void update(Observable obs) {
        System.out.println("O telefone \""+numero+"\" foi notificado.");
    }
}
