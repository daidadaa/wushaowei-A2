// Ride.java
import java.io.*;
import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private Employee operator;
    private int maxRider;
    private int numOfCycles;
    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.rideName = "Unnamed Ride";
        this.operator = null;
        this.maxRider = 1;
        this.numOfCycles = 0;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, int maxRider) {
        this();
        this.rideName = rideName;
        if (maxRider >= 1) this.maxRider = maxRider;
    }

    public void setOperator(Employee op) { this.operator = op; }
    public Employee getOperator() { return operator; }
    public int getNumOfCycles() { return numOfCycles; }

    @Override
    public boolean addVisitorToQueue(Visitor v) {
        if (v == null) return false;
        boolean added = waitingLine.offer(v);
        System.out.printf("[addVisitorToQueue] %s added: %s%n", added ? "Success" : "Fail", v);
        return added;
    }

    @Override
    public Visitor removeVisitorFromQueue() {
        Visitor v = waitingLine.poll();
        if (v == null) System.out.println("[removeVisitorFromQueue] queue empty.");
        else System.out.println("[removeVisitorFromQueue] Removed: " + v);
        return v;
    }

    @Override
    public void printQueue() {
        System.out.println("---- Queue: " + rideName + " ----");
        if (waitingLine.isEmpty()) { System.out.println("(empty)"); return; }
        int i=1;
        for (Visitor v: waitingLine) System.out.printf("%d) %s%n", i++, v);
    }

    @Override
    public boolean addVisitorToHistory(Visitor v) {
        if (v==null) return false;
        boolean added = rideHistory.add(v);
        System.out.println("[addVisitorToHistory] Added: " + v);
        return added;
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor v) {
        if (v==null || v.getId()==null) { System.out.println("[checkVisitorFromHistory] invalid visitor"); return false; }
        for (Visitor x: rideHistory) if (v.getId().equals(x.getId())) { System.out.println("[checkVisitorFromHistory] Found: " + v); return true; }
        System.out.println("[checkVisitorFromHistory] Not found: " + v); return false;
    }

    @Override
    public int numberOfVisitors() {
        System.out.println("[numberOfVisitors] " + rideHistory.size());
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("---- Ride History: " + rideName + " ----");
        if (rideHistory.isEmpty()) { System.out.println("(no history)"); return; }
        int i=1;
        for (Visitor v: rideHistory) System.out.printf("%d) %s%n", i++, v);
    }

    @Override
    public void sortHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("[sortHistory] Done.");
    }

    @Override
    public void runOneCycle() {
        System.out.printf("[runOneCycle] Attempting (%s) maxRider=%d%n", rideName, maxRider);
        if (operator==null) { System.out.println("No operator assigned."); return; }
        if (waitingLine.isEmpty()) { System.out.println("No visitors waiting."); return; }
        int take = Math.min(maxRider, waitingLine.size());
        for (int i=0;i<take;i++) {
            Visitor v = waitingLine.poll();
            if (v!=null) addVisitorToHistory(v);
        }
        numOfCycles++;
        System.out.println("[runOneCycle] Cycle complete."); 
    }

    public boolean exportRideHistory(String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            pw.println("id,name,age,ticketType,height");
            for (Visitor v: rideHistory) {
                pw.printf("%s,%s,%d,%s,%.2f%n", escape(v.getId()), escape(v.getName()), v.getAge(), escape(v.getTicketType()), v.getHeight());
            }
            System.out.println("[exportRideHistory] Exported to " + filename);
            return true;
        } catch(IOException e) {
            System.out.println("[exportRideHistory] Error: " + e.getMessage());
            return false;
        }
    }

    public boolean importRideHistory(String filename) {
        File f = new File(filename);
        if (!f.exists()) { System.out.println("[importRideHistory] File not found: " + filename); return false; }
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String header = br.readLine();
            String line; int count=0;
            while ((line=br.readLine())!=null) {
                String[] parts = parseCsv(line);
                if (parts.length>=5) {
                    Visitor v = new Visitor(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Double.parseDouble(parts[4]));
                    rideHistory.add(v); count++;
                }
            }
            System.out.println("[importRideHistory] Imported " + count + " records."); return true;
        } catch(Exception e) { System.out.println("[importRideHistory] Error: " + e.getMessage()); return false; }
    }

    private String escape(String s) { if (s==null) return ""; if (s.contains(",")||s.contains("\"")) return '"'+s.replace("\"","\"\"")+'"'; return s; }

    private String[] parseCsv(String line) {
        List<String> tokens = new ArrayList<>(); StringBuilder sb = new StringBuilder(); boolean inQuotes=false;
        for (int i=0;i<line.length();i++) {
            char c=line.charAt(i);
            if (c=='"') inQuotes=!inQuotes;
            else if (c==',' && !inQuotes) { tokens.add(sb.toString()); sb.setLength(0); }
            else sb.append(c);
        }
        tokens.add(sb.toString()); return tokens.toArray(new String[0]);
    }
}
