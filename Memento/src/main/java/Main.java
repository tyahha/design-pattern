import game.Gamer;
import game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("Now: " + gamer);

            gamer.bet();

            System.out.println("now money is " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    save");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    restore");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
