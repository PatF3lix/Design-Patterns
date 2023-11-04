import java.util.LinkedList;

public interface SubjectInterface {

    IteratorInterface createIterator();
}

class Art implements SubjectInterface {

    private String[] subjects;

    public Art() {
        this.subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtIterator(subjects);
    }
}

class Science implements SubjectInterface {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.add("Maths");
        subjects.add("Computer Science");
        subjects.add("Physics");
    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}