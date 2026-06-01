package hw.ch11;

import java.util.List;

public abstract class Entry {

    public abstract String getName();
    public abstract int getSize();
    public abstract void printList(String prefix);

    public String getFullName() {
        return getName();
    }

    public abstract List<Entry> search(String keyword);
}