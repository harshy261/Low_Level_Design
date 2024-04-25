public class SingletonLazy {
    private SingletonLazy() {
        System.out.println("Instance created");
    }
    private static class Holder{
        private static final SingletonLazy INSTANCE = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {

//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();
        Thread th1 = new Thread( () -> {SingletonLazy.getInstance();}  );
        Thread th2 = new Thread( () -> {SingletonLazy.getInstance();}  );

        th1.start();
        th2.start();

    }
}
