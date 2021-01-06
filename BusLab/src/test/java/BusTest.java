import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Train Station", 4);
        person = new Person();
        busStop = new BusStop("Bridge Street");
        busStop.addPersonToQueue(person);
    }

    @Test
    public void howManyPassengersOnBus(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void passengersCanGetOnBus(){
        bus.takePassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void passengerCannotGetOnBus(){
        bus.takePassenger(person);
        bus.takePassenger(person);
        bus.takePassenger(person);
        bus.takePassenger(person);
        bus.takePassenger(person);
        assertEquals(4, bus.getNumberOfPassengers());
    }

    @Test
    public void removePassengerFromBus(){
        bus.takePassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void pickUpPassengerFromBusStop(){
        bus.pickUp(busStop);
        assertEquals(0, busStop.numberOfPeopleInQueue());
        assertEquals(1, bus.getNumberOfPassengers());
    }
}
