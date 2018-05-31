public class FizzBuzzObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int n = generator.getNumber();
        System.out.print("FizzBuzzObserver:");
        if (n % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}
