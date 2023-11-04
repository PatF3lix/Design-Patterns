import java.util.LinkedList;

public interface IteratorInterface {

    void first();   //Reset to first element
    String next();  //Get next element
    boolean isDone();   //End of collection check
    String currentItem();   //Retrieve Current Item
}

class ArtIterator implements IteratorInterface {
    private String[] subjects;

    private int pos;

    public ArtIterator(String[] subjects) {
        this.subjects = subjects;
        this.pos = 0;
    }

    @Override
    public void first() {
        pos = 0;
    }

    @Override
    public String next() {
        return subjects[pos++];
    }

    @Override
    public boolean isDone() {
        return pos >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[pos];
    }
}

class ScienceIterator implements IteratorInterface {
    private LinkedList<String> subjects;
    private int pos;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        this.pos = 0;
    }

    @Override
    public void first() {
        pos = 0;
    }

    @Override
    public String next() {
        return subjects.get(pos++);
    }

    @Override
    public boolean isDone() {
        return pos >= subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(pos);
    }
}


