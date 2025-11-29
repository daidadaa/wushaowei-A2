// RideInterface.java
public interface RideInterface {
    boolean addVisitorToQueue(Visitor v);
    Visitor removeVisitorFromQueue();
    void printQueue();

    boolean addVisitorToHistory(Visitor v);
    boolean checkVisitorFromHistory(Visitor v);
    int numberOfVisitors();
    void printRideHistory();

    void sortHistory();
    void runOneCycle();
}
