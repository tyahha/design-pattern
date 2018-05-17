import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractDisplay> a = new ArrayList<AbstractDisplay>();
        a.add(new CharDisplay('H'));
        a.add(new StringDisplay("Hello, world."));
        a.add(new StringDisplay("こんにちは"));
        for (AbstractDisplay d : a) {
            d.display();
        }
    }
}
