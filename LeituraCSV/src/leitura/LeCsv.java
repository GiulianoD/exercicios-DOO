package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {

    public LinkedList<Cliente> leCsvClientes() throws IOException{

        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();
        String current = new java.io.File( "." ).getCanonicalPath();
        File inputFile = new File(current + "\\src\\arquivo.csv");
        BufferedReader in = new BufferedReader (new FileReader(inputFile));
        String linha;
        //Cliente clienteAux;
        in.read(linha)); // pula a primeira linha (cabecalho)
        while (in.read(linha) != -1) {
            String[] linhas = linha.split(";");
            // clienteAux = new Cliente();
            // clienteAux.setId(linhas[0]);
            // clienteAux.setNome(linhas[1]);
            // clienteAux.setEmail(linhas[2]);
            // clienteAux.setDtNasc(linhas[3]);
            // clienteAux.setTelefone(linhas[4]);
            // clienteAux.setTotalCompras(Double.parseDouble(linhas[5]));

            // clientes.add(clienteAux);
            clientes.add(new Cliente (linhas[0],linhas[1],linhas[2],linhas[4],Double.parseDouble(linhas[5])));

            in.read(); // com esta linha + o q esta dentro do while, nao esta lendo duas vezes?
        }
        in.close();

        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.

        return clientes;
    }
}
