public class Participant {
    //Creates variables with class-wide scope
    String name;
    int age;

    //Constructor that initializes the object's attributes and ensures that every 'Participant' must have a 'name' and an 'age'
    //Keyword 'this.' is used to clarify the instance variables and prevents naming conflict with the parameters
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
