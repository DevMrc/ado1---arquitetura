package Exercicio02.Singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
    
    }
    public static synchronized Singleton pegaObj(){
        if(singleton==null){
            return singleton = new Singleton();
        }
        else{
            return singleton ;
        }
    }

}
