public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIA = 0;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;
    
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIA++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }
    
    @Override
    public void sacar(double valor){
        saldo -= valor;
    }
    
    @Override
    public void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirComuns(){
        System.out.println("Titular: " + cliente.getNome());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f \n", this.saldo));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
