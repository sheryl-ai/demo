public class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton() {}

    private static Singleton getInstance() {
        return instance;
    }
}

class Singleton1{
    private static Singleton1 instance = null;

    private Singleton1() {}

    private static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

class Singleton2{
    private volatile static Singleton2 instance = null;

    private Singleton2() {}

    private static Singleton2 getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}

class Singleton3{
    private static Singleton3[] instance;
    private volatile static int cnt = 0;

    private Singleton3() {}

    private static Singleton3 getInstance() {
        if (cnt < 3) {
            synchronized(Singleton.class) {
                if (instance[cnt] == null) {
                    instance[cnt++] = new Singleton3();
                }
            }
        }
        return instance[cnt - 1];
    }
}
