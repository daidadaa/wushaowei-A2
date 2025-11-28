import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface {

    private String rideName;
    private int minHeight;
    private Employee rideOperator;

    private Queue<Visitor> waitingQueue;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        waitingQueue = new LinkedList<>();
        rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, int minHeight, Employee rideOperator) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.rideOperator = rideOperator;
        waitingQueue = new LinkedList<>();
        rideHistory = new LinkedList<>();
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    // Part 3 — FIFO Queue for waiting visitors
    @Override
    public void addVisitorToQueue(Visitor v) {
        waitingQueue.add(v);
        System.out.println(v.getName() + " joined the queue.");
    }

    @Override
    public void removeVisitorFromQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue is empty. No visitor removed.");
        } else {
            Visitor removed = waitingQueue.poll();
            System.out.println(removed.getName() + " removed from the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Visitors currently in queue:");
        for (Visitor v : waitingQueue) {
            System.out.println(" - " + v);
        }
    }

    // Part 4A — LinkedList for ride history
    @Override
    public void addVisitorToHistory(Visitor v) {
        rideHistory.add(v);
        System.out.println(v.getName() + " added to ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor v) {
        boolean exists = rideHistory.contains(v);
        System.out.println(v.getName() + (exists ? " is" : " is NOT") + " in ride history.");
        return exists;
    }

    @Override
    public int numberOfVisitors() {
        System.out.println("Number of visitors in ride history: " + rideHistory.size());
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("Ride history is empty.");
            return;
        }

        System.out.println("Ride history:");

        Iterator<Visitor> it = rideHistory.iterator();
        while (it.hasNext()) {
            Visitor v = it.next();
            System.out.println(" - " + v);
        }
    }

    // Part 4B — Sorting
    @Override
    public void sortRideHistory() {
        System.out.println("Sorting ride history by age then name...");
        VisitorComparator comp = new VisitorComparator();
        rideHistory.sort(comp);
    }

    // Part 5 — Running One Cycle
    @Override
    public void runOneCycle() {
        System.out.println("\nRunning one cycle of the ride...");

        if (waitingQueue.isEmpty()) {
            System.out.println("No visitors in queue. Cannot run cycle.");
            return;
        }

        // First visitor gets on the ride
        Visitor v = waitingQueue.poll();
        System.out.println(v.getName() + " has completed the ride!");

        // Add visitor to ride history
        rideHistory.add(v);
        System.out.println(v.getName() + " added to ride history.");
    }
}
