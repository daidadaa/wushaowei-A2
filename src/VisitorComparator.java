import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First compare by age
        if (v1.getAge() != v2.getAge()) {
            return v1.getAge() - v2.getAge();
        }

        // Then by name
        return v1.getName().compareTo(v2.getName());
    }
}
