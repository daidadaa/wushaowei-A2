public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo a = new AssignmentTwo();
        a.partThree();
        a.partFourA();
    }

    // Part 3 Demonstration (Queue)
    public void partThree() {
        System.out.println("\n=== PART 3: Queue Demo ===");

        Ride ride = new Ride("Super Coaster", 120, null);

        Visitor v1 = new Visitor("Alice", 20, "F", "Regular", 165);
        Visitor v2 = new Visitor("Bob", 18, "M", "VIP", 170);
        Visitor v3 = new Visitor("Charlie", 25, "M", "Regular", 180);
        Visitor v4 = new Visitor("Diana", 22, "F", "Regular", 160);
        Visitor v5 = new Visitor("Eric", 30, "M", "VIP", 175);

        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);

        ride.removeVisitorFromQueue();

        ride.printQueue();
    }

    // Part 4A Demonstration (History)
    public void partFourA() {
        System.out.println("\n=== PART 4A: Ride History Demo ===");

        Ride ride = new Ride("Water Splash", 110, null);

        Visitor v1 = new Visitor("Amy", 21, "F", "Regular", 160);
        Visitor v2 = new Visitor("Ben", 23, "M", "Regular", 175);
        Visitor v3 = new Visitor("Cindy", 19, "F", "VIP", 168);
        Visitor v4 = new Visitor("Dean", 27, "M", "Regular", 182);
        Visitor v5 = new Visitor("Eva", 20, "F", "VIP", 158);

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        ride.checkVisitorFromHistory(v3);

        ride.numberOfVisitors();

        ride.printRideHistory();
    }

    // Day 3–4 content below:
    public void partFourB() {}
    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}
}
