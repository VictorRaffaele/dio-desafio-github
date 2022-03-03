import java.util.ArrayList;
import java.util.List;

public class Banco{

    private String nome;
    protected ArrayList<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome){
        this.nome = nome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void listarContas(){
        for(int indice = 0; indice < contas.size(); indice++){
            contas.get(indice).imprimirExtrato();

        }
    }

    public void listarClientes(){
        for(int indice = 0; indice < contas.size(); indice++){
            String nomeCliente = contas.get(indice).getCliente().getNome();
            System.out.println(nomeCliente);
        }
    }
}