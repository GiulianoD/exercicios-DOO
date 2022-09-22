package serializa;

import serializa.model.Mensagem;
import serializa.model.Usuario;

public class Testador {

    public static void main (void *args){
        Usuario u1 = new Usuario("Giuliano");
        Usuario u2 = new Usuario("Joana");

        Mensagem m;

        int i = 20;
        ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();

        while (i>0){
            m = new Mensagem("G a J #" + i, u1, u2);
            u1.enviarMenssagem(m,u2);
            i--;
            m = new Mensagem("J a G #" + i, u2, u1);
            u2.enviarMenssagem(m,u1);
            i--;
        }

        return;
    }
}