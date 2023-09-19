public class Participant {
    //Creates variables with class-wide scope
    String name;
    int age;

    //Constructor that initializes objects and ensures that every 'Participant' must have a 'name' and an 'age'
    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{Participant Name: " + name +
                ", Age: " + age + '}';
    }
}
