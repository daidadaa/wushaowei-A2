// VisitorComparator.java
import java.util.Comparator;
public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2){
        int a = Integer.compare(v1.getAge(), v2.getAge());
        if(a!=0) return a;
        return v1.getName().compareToIgnoreCase(v2.getName());
    }
}
