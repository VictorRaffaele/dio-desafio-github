public class ContaPolpanca extends Conta{

    public ContaPolpanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato da Conta Polpanca:");
        imprimirComuns();
    }
    
}
