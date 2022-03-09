import facade.Facade;
import singleton.*;
import strategy.*;

public class Teste {

    public static void main(String[] args) {

        //singleton
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonLazy lazy = SingletonLazy.getInstancia();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    
        System.out.println(eager);
        System.out.println(lazy);
        System.out.println(lazyHolder);

        //strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //facade
        Facade facade = new Facade();
        facade.migrarCliente("Victor", "12345-684");
    }
}
