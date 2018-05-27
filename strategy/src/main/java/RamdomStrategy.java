import java.util.Random;

public class RamdomStrategy implements Strategy {
    private Random random;
    public RamdomStrategy(int randomSeed) {
        random = new Random(randomSeed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
