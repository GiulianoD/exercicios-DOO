package fabrica.abstrata.botoes;

// import javax.swing.JButton;

public class FabricaBotoesIcones extends FabricaAbstrataBotoes{

    @Override
    public ButtonOK criaBotaoOK() {
        ButtonOK botao = new ButtonOK();
        botao.setText("OK");
        return botao;
    }

    @Override
    public ButtonCancel criaBotaoCancel() {
        ButtonCancel botao = new ButtonCancel();
        botao.setText("Cancel");
        return botao;
    }

}
