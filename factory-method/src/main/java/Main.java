public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("111");
        Product card2 = factory.create("222");
        Product card3 = factory.create("333");
        card1.use();
        card2.use();
        card3.use();
    }
}
