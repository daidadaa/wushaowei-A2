public class Ride implements RideInterface {

    private String rideName;
    private int minHeight;
    private Employee rideOperator;

    // Day 1: no queue, no ride history yet
    public Ride() {
    }

    public Ride(String rideName, int minHeight, Employee rideOperator) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.rideOperator = rideOperator;
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

    // Empty implementations (will be completed in Day 2–3)
    public void addVisitorToQueue(Visitor v) {}
    public void removeVisitorFromQueue() {}
    public void printQueue() {}
    public void addVisitorToHistory(Visitor v) {}
    public boolean checkVisitorFromHistory(Visitor v) { return false; }
    public int numberOfVisitors() { return 0; }
    public void printRideHistory() {}
    public void runOneCycle() {}
}
