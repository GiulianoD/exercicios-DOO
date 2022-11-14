package estrutura;

import java.util.ArrayList;

import estrutura.membros.Observer;

public class Observable {
    ArrayList<Observer> monitores = new ArrayList<Observer>();

    public void addObserver(Observer ob) {
        this.monitores.add(ob);
    }
    public void deleteObserver(Observer ob) {
        this.monitores.remove(ob);
    }

    public void notifyObserver(){
        for (Observer ob : monitores){
            ob.update(this);
        }
    }
}
