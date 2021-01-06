import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;
    private Person person;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }


    public String getName() {
        return this.name;
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public int numberOfPeopleInQueue() {
        return this.queue.size();
    }

    public Person removePersonFromQueue() {
        this.queue.remove(person);
        return person;
    }
}
