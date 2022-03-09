package singleton;

public class SingletonLazyHolder{

    public static class InstaceHolder{
        private static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder(){
        super();
    }

     public static SingletonLazyHolder getInstancia(){
        return InstaceHolder.instacia;
    }


}