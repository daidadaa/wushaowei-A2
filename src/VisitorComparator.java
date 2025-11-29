// VisitorComparator.java
import java.util.Comparator;
public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        int ageComp = Integer.compare(v1.getAge(), v2.getAge());
        if (ageComp != 0) return ageComp;
        return v1.getName().compareToIgnoreCase(v2.getName());
    }
}
