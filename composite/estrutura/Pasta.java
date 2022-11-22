package estrutura;

import java.util.ArrayList;

public class Pasta extends Elemento{
    private ArrayList<Elemento> elementos;

    public Pasta(){
        elementos = new ArrayList<Elemento>();
    }

    @Override
    public int obterTamanho(){
        int tamanhoDaPasta = 0;
        for (Elemento x : elementos) tamanhoDaPasta += x.obterTamanho();
        return tamanhoDaPasta;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }
    public void addElementos(Elemento x) {
        this.elementos.add(x);
    }
}
