package singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Singleton {
    private static String nomeArquivo = "src/singleton/ultimoNumero.g";
    private static Singleton instance = new Singleton();
	private volatile int proxNumero = getNumber();

    private Singleton() {
        // prevent external instantiation of a singleton.
    }

	private int getNumber(){
        try {
            File arq = new File(nomeArquivo);
            Scanner leitor = new Scanner(arq);
            int numero = leitor.nextInt();
            leitor.close();
            return numero;
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("O arquivo de leitura nao foi encontrado:");
        System.out.println(nomeArquivo);
        return 0;
	}
	
    public static Singleton getInstance() {
		return instance;
    }

    public synchronized int getProxNumero() {
        return proxNumero++;
    }

	public void close (){
		File arq=new File(nomeArquivo);
        arq.delete();

        try {
            FileWriter escritor = new FileWriter(arq, false);
            escritor.write(String.valueOf(proxNumero));
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}