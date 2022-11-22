import estrutura.Arquivo;
import estrutura.Pasta;

public class Main{
    public static void main(String[] args) {
        Pasta raiz = new Pasta();
        raiz.setNome("Raiz");
        Pasta home = new Pasta();
        home.setNome("Home");
        Pasta vazia = new Pasta();
        vazia.setNome("Pasta Vazia");

        Arquivo xTxT = new Arquivo(2);
        xTxT.setNome("x.txt");
        Arquivo yTxT = new Arquivo(2);
        yTxT.setNome("y.txt");
        Arquivo zTxT = new Arquivo(2);
        zTxT.setNome("z.txt");

        raiz.addElementos(xTxT);
        raiz.addElementos(home);

        home.addElementos(yTxT);
        home.addElementos(zTxT);
        home.addElementos(vazia);

        System.out.println("A pasta "+raiz.getNome()+" tem o tamanho total de "+raiz.obterTamanho()+" kbytes.");
    }
}