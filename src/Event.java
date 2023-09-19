import java.util.Arrays;

public class Event {
    //Creates variables with class-wide scope
    String name;
    String date;
    String place;
    int amountOfParticipants;
    Participant[] participant;

    //Constructor that initializes objects and ensures that every 'Event' must have the following parameters
    public Event(String name, String date, String place, Participant[] participants) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.participant = participants;
        amountOfParticipants = participants.length; //Stores the number of participants from the participants[] array
    }

    @Override
    public String toString() {
        return "\nEvent name: " + name +
                "\nDate: " + date +
                "\nPlace: " + place +
                "\nAmount of participants: " + amountOfParticipants +
                "\nParticipants: " + Arrays.toString(participant);
    }
}
