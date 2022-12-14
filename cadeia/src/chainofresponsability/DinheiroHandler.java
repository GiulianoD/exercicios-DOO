package chainofresponsability;

import javax.swing.JOptionPane;

public class DinheiroHandler  extends AbstractPagamentoHandler {
    public static final int DINHEIRO =4;
    @Override
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o "
                + "pagamento com Dinheiro?", valor);
        JOptionPane.showMessageDialog(null, "Pago no dinheiro. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }

    @Override
    protected int getTipoPagamento() {
        return DINHEIRO;
    }
}
