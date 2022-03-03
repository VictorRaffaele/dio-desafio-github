import java.util.ArrayList;
public class Cliente {

    private String nome;
    protected ArrayList<Conta> contas = new ArrayList<Conta>();

    public Cliente(String nome){
        this.nome = nome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        for(int indice = 0; indice < contas.size(); indice++){
            contas.get(indice).imprimirExtrato();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
