import coisos.StatusItem;
import coisos.StatusItem.Estado;

public class FlyweightStatusItem {
    private static StatusItem carrinho = new StatusItem(Estado.CARRINHO, true, false);
    private static StatusItem fechado = new StatusItem(Estado.FECHADO, true, false);
    private static StatusItem pago = new StatusItem(Estado.PAGO, true, true);
    private static StatusItem enviado = new StatusItem(Estado.ENVIADO, false, true);
    private static StatusItem entregue = new StatusItem(Estado.ENTREGUE, false, true);

    public static StatusItem get(Estado estado){
        if (estado == Estado.CARRINHO)
            return carrinho;
        if (estado == Estado.FECHADO)
            return fechado;
        if (estado == Estado.PAGO)
            return pago;
        if (estado == Estado.ENVIADO)
            return enviado;
        if (estado == Estado.ENTREGUE)
            return entregue;
        return null;
    }
}
