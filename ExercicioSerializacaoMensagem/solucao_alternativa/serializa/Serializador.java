package serializa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {

    public static void escreverArqBin (ArrayList<Object> lista, String path){
        File arq = new File(path);

        try {
            arq.delete();
            arq.createNewFile();

            ObjectOutputStream escritor = new ObjectOutputStream (new FileOutputStream(arq));
            escritor.writeObject(lista);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Erro durante a escrita do arquivo.\n%s", e.getMessage());
        }
    }

    public static ArrayList<Object> lerArqBin (String path){
        ArrayList<Object> lista = new ArrayList();

        try{
            FILE arq = new File(path);
            if (arq.exists()) {
                ObjectInputStream leitor = new ObjectInputStream (new FileInputStream(arq));
                lista = (ArrayList<Object>) leitor.readObject();
                leitor.close();
            }
        } catch (IOException IOe) {
            System.out.println("Erro durante a leitura do arquivo.\n%s", e.getMessage());
        } catch (ClassNotFoundException CNFe){
            System.out.println("Erro durante a leitura do arquivo.\n%s", e.getMessage());
        }

        return (lista);
    }
}