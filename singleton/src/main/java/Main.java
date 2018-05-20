public class Main {
    public static void main(String[] args) {
        System.out.println("Start main");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("same instance");
        } else {
            System.out.println("different instance");
        }
        System.out.println("End main");
    }
}
