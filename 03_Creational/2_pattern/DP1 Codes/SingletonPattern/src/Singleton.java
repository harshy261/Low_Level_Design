public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("constructor k andar hu, instance create");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();
//        Thread th1 = new Thread( () -> {Singleton.getInstance();}  );
//        Thread th2 = new Thread( () -> {Singleton.getInstance();}  );
//
//        th1.start();
//        th2.start();

    }
}
