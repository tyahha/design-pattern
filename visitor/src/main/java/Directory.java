import java.util.ArrayList;
import java.util.Iterator;

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
    public Iterator<Entry> iterator() throws FileTreatmentException {
        return entries.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
