package adaptercliente.adapter;

import adaptercliente.model.Cliente;

public class ClienteAdapter extends Cliente {

    public ClienteAdapter(lib.ClienteExterno ce){
        this.setNomeCompleto(ce.getNome() + " " + ce.getSobreNome());
        this.setTelefone(ce.getDddTelefone() + " " + ce.getTelefone());
        this.setEmail(ce.getEmail());
        this.setCelular(ce.getDddCelular() + " " + ce.getCelular());
    }
}
