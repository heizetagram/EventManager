public class Participant {
    //Creates variables with class-wide scope
    String name;
    int age;

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
