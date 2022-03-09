package subsistema2;

public class ApiCep {

    private static ApiCep instacia = new ApiCep();

    private ApiCep(){
        super();
    }

     public static ApiCep getInstancia(){
        return instacia;
    }

    public String recuperaCidade(String cep){
        return "Jaboatao";
    }

    public String recuperarEstado(String cep){
        return "PE";
    }
    
}
