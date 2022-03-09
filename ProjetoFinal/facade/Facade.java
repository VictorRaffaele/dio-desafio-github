package facade;

import subsistema1.CrmService;
import subsistema2.ApiCep;

public class Facade {
    
    public void migrarCliente(String nome, String cep){
        String cidade = ApiCep.getInstancia().recuperaCidade(cep);
        String estado = ApiCep.getInstancia().recuperarEstado(cep);


        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
