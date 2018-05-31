package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsName = {
            "Ringo", "Mikan", "Banana", "Mikan",
    };
    public Gamer(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("increment money.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("half money");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("get fruits:" + f);
            fruits.add(f);
        } else {
            System.out.println("Nothing.");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String f : fruits) {
            if (f.startsWith("delicious")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "delicious ";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
