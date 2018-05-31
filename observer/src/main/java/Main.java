public class Main {
    private static void execute(NumberGenerator generator) {
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new FizzBuzzObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
    public static void main(String[] args) {
        execute(new RamdomNumberGenerator());
        System.out.println("---------------");
        execute(new IcrementalNumberGenerator(10, 50, 5));
    }
}
