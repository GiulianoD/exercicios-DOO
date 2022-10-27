package fabrica.abstrata.botoes;

import javax.swing.JButton;

public class FabricaPadrao extends FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
        JButton botao = new JButton();
        botao.setText("OK");
        return botao;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton botao = new JButton();
        botao.setText("Cancel");
        return botao;
    }

}
