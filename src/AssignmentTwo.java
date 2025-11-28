public class AssignmentTwo {

    public static void main(String[] args) {

        AssignmentTwo a = new AssignmentTwo();

        // Day 2
        a.partThree();
        a.partFourA();

        // Day 3
        a.partFourB();
        a.partFive();
    }

    // Part 3 — Queue Demonstration (Day 2)
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

    // Part 4A — Ride History (Day 2)
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

    // Part 4B — Sorting Ride History (Day 3)
    public void partFourB() {
        System.out.println("\n=== PART 4B: Sorting Ride History ===");

        Ride ride = new Ride("Sky Drop", 100, null);

        Visitor v1 = new Visitor("Adam", 22, "M", "Regular", 170);
        Visitor v2 = new Visitor("Bella", 20, "F", "Regular", 160);
        Visitor v3 = new Visitor("Chris", 22, "M", "VIP", 175);
        Visitor v4 = new Visitor("Daisy", 18, "F", "VIP", 158);
        Visitor v5 = new Visitor("Ethan", 25, "M", "Regular", 180);

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        System.out.println("\nBefore sorting:");
        ride.printRideHistory();

        ride.sortRideHistory();

        System.out.println("\nAfter sorting:");
        ride.printRideHistory();
    }

    // Part 5 — Run One Cycle (Day 3)
    public void partFive() {
        System.out.println("\n=== PART 5: Run One Cycle ===");

        Ride ride = new Ride("Galaxy Coaster", 120, null);

        Visitor v1 = new Visitor("Henry", 21, "M", "Regular", 172);
        Visitor v2 = new Visitor("Isabella", 19, "F", "VIP", 165);
        Visitor v3 = new Visitor("Jack", 24, "M", "Regular", 180);

        // Add to queue
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);

        System.out.println("\nQueue before running cycles:");
        ride.printQueue();

        // Run cycles
        ride.runOneCycle();
        ride.runOneCycle();

        System.out.println("\nQueue after two cycles:");
        ride.printQueue();

        System.out.println("\nRide history after two cycles:");
        ride.printRideHistory();
    }

    // Empty methods for Day 4
    public void partSix() {}
    public void partSeven() {}
}
