package coisos;

import java.util.ArrayList;

public class Pedido {

    ArrayList<Item> lstItem;

    public Pedido(){
        this.lstItem = new ArrayList<Item>();
    }

    public void addItemPedido(Item item1) {
        lstItem.add(item1);
    }
    
}
