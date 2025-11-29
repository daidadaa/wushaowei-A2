// Visitor.java
public class Visitor extends Person {
    private String ticketType;
    private double height;

    public Visitor() { super(); this.ticketType = ""; this.height = 0.0; }

    public Visitor(String id, String name, int age, String ticketType, double height) {
        super(id, name, age);
        this.ticketType = ticketType;
        this.height = height;
    }

    public String getTicketType() { return ticketType; }
    public void setTicketType(String ticketType) { this.ticketType = ticketType; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        return String.format("%s Ticket:%s Height:%.2fm", super.toString(), ticketType, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitor v = (Visitor) o;
        return this.getId() != null && this.getId().equals(v.getId());
    }

    @Override
    public int hashCode() {
        return (getId() == null) ? 0 : getId().hashCode();
    }
}
