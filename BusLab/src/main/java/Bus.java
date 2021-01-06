import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public void takePassenger(Person person) {
        if (passengers.size() < capacity){
            this.passengers.add(person);
        }

    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUp(BusStop busStop) {
        this.takePassenger(busStop.removePersonFromQueue());
    }
}
