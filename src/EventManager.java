public class EventManager {
    //Creates variables class-wide scope
    Event[] events;
    Participant[] participants;

    //----------INITIALIZE VARIABLES----------\\
    void initVars() {
        //Participants
        participants = new Participant[8];
        //Initializes 'Participant' object in each participants[] element
        participants[0] = new Participant("Lee", 21);
        participants[1] = new Participant("Bob", 45);
        participants[2] = new Participant("Juno", 23);
        participants[3] = new Participant("John", 30);
        participants[4] = new Participant("Mina", 26);
        participants[5] = new Participant("Anna", 34);
        participants[6] = new Participant("Mark", 18);
        participants[7] = new Participant("Lisa", 26);

        //Events
        events = new Event[2];
        //Creates the events and fills out the details. Creates a new Participant[] array with the desired participants created above
        events[0] = new Event("Movie Night", "20/09-2023", "Cinema", new Participant[]{participants[0], participants[1], participants[2]});
        events[1] = new Event("Birthday Party", "22/09-2023", "Home", new Participant[]{participants[3], participants[4], participants[5], participants[6], participants[7]});
    }

    //----------MAIN----------\\
    public static void main(String[] args) {
        new EventManager().run();
    }

    //----------RUN METHOD----------\\
    private void run() {
        initVars();
        System.out.println(events[0]);
        System.out.println(events[1]);
    }
}
