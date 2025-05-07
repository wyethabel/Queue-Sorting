import java.util.Comparator;

public class NameComp implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p2.getLast().compareToIgnoreCase(p1.getLast());
    }
}
