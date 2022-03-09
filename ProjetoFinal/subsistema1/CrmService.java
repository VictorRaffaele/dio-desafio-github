package subsistema1;

public class CrmService {

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente Salvo no CRM!");
        System.out.printf("%s\n%s\n%s\n%s", nome, cep, cidade, estado);
    }
    
}
