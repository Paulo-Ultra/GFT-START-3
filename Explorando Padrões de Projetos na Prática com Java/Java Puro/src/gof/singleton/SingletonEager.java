package gof.singleton;

/**
 * Singleton "apressado".
 * @author Paulo Ricardo
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
