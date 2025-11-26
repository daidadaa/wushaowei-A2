public class Visitor extends Person {

    private String ticketType;
    private int height;

    public Visitor() {
        super();
    }

    public Visitor(String name, int age, String gender,
                   String ticketType, int height) {
        super(name, age, gender);
        this.ticketType = ticketType;
        this.height = height;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "[Visitor] " + super.toString() +
                " | Ticket: " + ticketType +
                " | Height: " + height + "cm";
    }
}
