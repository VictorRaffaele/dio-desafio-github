import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //Exemplos prontos
        Banco banco = new Banco("Banco Teste");
        Cliente cliente = new Cliente("Cliente1");
        Cliente cliente2 = new Cliente("Cliente2");
        Conta cCorrente = new ContaCorrente(cliente);
        Conta cPolpanca = new ContaPolpanca(cliente2);
        banco.adicionarConta(cCorrente);
        cliente.adicionarConta(cCorrente);
        banco.adicionarConta(cPolpanca);
        cliente2.adicionarConta(cPolpanca);

        System.out.println(banco.getNome());

        cCorrente.depositar(100);
        cCorrente.transferir(cPolpanca, 30);

        //teste voce mesmo
        int caso = 99;
        Scanner scan = new Scanner(System.in);
        
        while(caso != 0){
            System.out.println("---------Bem Vindo ao Banco Teste---------");
            System.out.println("O que deseja fazer hoje:");
            System.out.println("Digite 1, paras se cadastrar e criar uma conta \nDigite 2, depositar um valor em uma conta \nDigite 3, para sacar um valor da conta \nDigite 4, para visualizar o dado de todas as contas \nDigite 5, para visualizar os clientes do banco \nDigite 0, Para encerrar o programa" );
            caso = scan.nextInt();

            switch(caso){
                case 1: {
                    System.out.println("\nDigite seu nome:");
                    String nomeNovo = scan.next();
                    Cliente novoCliente = new Cliente(nomeNovo);
                        
                    System.out.println("Digite o tipo de conta desejada: 1 - Conta Poupanca / 2 - Conta Corrente");
                    int opcao = scan.nextInt();
                        
                    if (opcao == 1){
                        Conta novaConta = new ContaPolpanca(novoCliente);
                        banco.adicionarConta(novaConta);
                        cliente.adicionarConta(novaConta);
                        break;
                    } 
                    if (opcao == 2){
                        Conta novaConta = new ContaCorrente(novoCliente);
                        banco.adicionarConta(novaConta);
                        cliente.adicionarConta(novaConta);
                        break;
                    }
                    else{
                        System.out.println("Tente novamente!");
                        break;
                    }
                }
                        
                case 2: {
                    System.out.println("\nQual numero da conta:");
                    int numeroConta = scan.nextInt();
                    banco.contas.get(numeroConta).imprimirExtrato();
                
                    System.out.println("Digite 1 - Sim / 2 - Nao");        
                    int opcaoDeposito = scan.nextInt();
                    if(opcaoDeposito == 1){
                        System.out.println("Digite o valor:");
                        double valorDep = scan.nextDouble();   
                        banco.contas.get(numeroConta).depositar(valorDep);
                        System.out.println("Depositado com Sucesso\n");
                        banco.contas.get(numeroConta).imprimirExtrato();
                        break;
                    }
                    else {
                        System.out.println("Tente novamente!");
                        break;
                    }
                }
                case 3: {System.out.println("\nQual numero da conta:");
                    int numeroContaSaq = scan.nextInt();
                    banco.contas.get(numeroContaSaq).imprimirExtrato();
        
                    System.out.println("Digite 1 - Sim / 2 - Nao");        
                    int opcaoSaq = scan.nextInt();
                    if(opcaoSaq == 1){
                        System.out.println("Digite o valor:");
                        double valorSaq = scan.nextDouble();   
                        banco.contas.get(numeroContaSaq).sacar(valorSaq);
                        System.out.println("Sacado com Sucesso\n");
                        banco.contas.get(numeroContaSaq).imprimirExtrato();
                        break;
                    }
                    else {
                        System.out.println("Tente novamente!");
                        break;
                    }
                }

                case 4: {
                    System.out.println("\nExtrato de todas as contas:");
                    banco.listarContas();  
                    break;      
                }

                case 5: {
                    System.out.println("\nLista de clientes:");
                    banco.listarClientes();
                    break;
                }

 
            }

        }
        scan.close();

    }
}
