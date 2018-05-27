import java.util.ArrayList;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> entries = new ArrayList<>();
    public Directory(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry e: entries) {
            size += e.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry e: entries) {
            e.printList(prefix + "/" + name);
        }
    }
}
