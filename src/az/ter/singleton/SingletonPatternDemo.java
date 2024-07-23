package az.ter.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //TODO: Get the only object available
        SingletonObject object = SingletonObject.getInstance();

        //TODO: Show the message
        object.showMessage();
    }
}
