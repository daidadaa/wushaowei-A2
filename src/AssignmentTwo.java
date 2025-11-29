// AssignmentTwo.java - runs demos for Parts 3-7
public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo at = new AssignmentTwo();
        System.out.println("=== PART 3 DEMO ==="); at.partThree();
        System.out.println("\n=== PART 4A DEMO ==="); at.partFourA();
        System.out.println("\n=== PART 4B DEMO ==="); at.partFourB();
        System.out.println("\n=== PART 5 DEMO ==="); at.partFive();
        System.out.println("\n=== PART 6 DEMO ==="); at.partSix();
        System.out.println("\n=== PART 7 DEMO ==="); at.partSeven();
        System.out.println("\n=== DEMO COMPLETE ===");
    }

    private Visitor v(String id,String name,int age,String t,double h){ return new Visitor(id,name,age,t,h); }

    public void partThree() {
        Ride r = new Ride("Thunder Coaster",4);
        r.addVisitorToQueue(v("V001","Alice",25,"standard",1.65));
        r.addVisitorToQueue(v("V002","Bob",30,"fastpass",1.80));
        r.addVisitorToQueue(v("V003","Cara",22,"standard",1.58));
        r.addVisitorToQueue(v("V004","Dan",28,"standard",1.75));
        r.addVisitorToQueue(v("V005","Eve",35,"standard",1.60));
        r.removeVisitorFromQueue();
        r.printQueue();
    }

    public void partFourA() {
        Ride r = new Ride("Splash River",6);
        r.addVisitorToHistory(v("V010","Fiona",27,"standard",1.62));
        r.addVisitorToHistory(v("V011","George",40,"standard",1.70));
        r.addVisitorToHistory(v("V012","Hana",19,"fastpass",1.55));
        r.addVisitorToHistory(v("V013","Ian",33,"standard",1.78));
        r.addVisitorToHistory(v("V014","Jill",29,"fastpass",1.63));
        r.checkVisitorFromHistory(v("V012","Hana",19,"fastpass",1.55));
        r.numberOfVisitors();
        r.printRideHistory();
    }

    public void partFourB() {
        Ride r = new Ride("Sky Drop",3);
        r.addVisitorToHistory(v("V101","Zack",32,"standard",1.75));
        r.addVisitorToHistory(v("V102","Amy",22,"fastpass",1.60));
        r.addVisitorToHistory(v("V103","Ben",22,"standard",1.68));
        r.addVisitorToHistory(v("V104","Clara",28,"standard",1.66));
        r.addVisitorToHistory(v("V105","Derek",35,"fastpass",1.80));
        System.out.println("[Before sort]"); r.printRideHistory();
        r.sortHistory();
        System.out.println("[After sort]"); r.printRideHistory();
    }

    public void partFive() {
        Ride r = new Ride("Family Wheel",3);
        r.setOperator(new Employee("E001","Olivia",29,"S001","Operator"));
        for (int i=1;i<=10;i++) r.addVisitorToQueue(v(String.format("V2%03d",i),"Guest"+i,18+(i%10),"standard",1.50+(i%5)*0.05));
        System.out.println("Queue before:"); r.printQueue();
        r.runOneCycle();
        System.out.println("Queue after:"); r.printQueue();
        System.out.println("Ride history:"); r.printRideHistory();
    }

    public void partSix() {
        Ride r = new Ride("Sea Serpent",4);
        r.addVisitorToHistory(v("V300","Kara",26,"standard",1.66));
        r.addVisitorToHistory(v("V301","Liam",31,"fastpass",1.82));
        r.addVisitorToHistory(v("V302","Maya",24,"standard",1.59));
        r.addVisitorToHistory(v("V303","Noah",29,"standard",1.77));
        r.addVisitorToHistory(v("V304","Ona",27,"fastpass",1.65));
        r.exportRideHistory("ride_history_export.csv");
    }

    public void partSeven() {
        Ride r = new Ride("Imported Ride",5);
        boolean ok = r.importRideHistory("ride_history_export.csv");
        if (ok) { r.numberOfVisitors(); r.printRideHistory(); }
        else System.out.println("Import failed or file missing.");
    }
}
