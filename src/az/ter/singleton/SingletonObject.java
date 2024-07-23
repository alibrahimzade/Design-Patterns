package az.ter.singleton;

public class SingletonObject {

    //TODO: create an object of Singleton object
    private static SingletonObject instance = new SingletonObject();

    //TODO: make the constructo private so that this class cannot be instantiated\
    private SingletonObject(){

    }

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!!");
    }
}
