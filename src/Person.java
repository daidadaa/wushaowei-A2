// Person.java
// Abstract base class representing a person in PRVMS.
public abstract class Person {
    private String id;
    private String name;
    private int age;

    public Person() {
        this.id = "";
        this.name = "";
        this.age = 0;
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return String.format("ID:%s Name:%s Age:%d", id, name, age);
    }
}
