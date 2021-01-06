import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        person = new Person();
        busStop = new BusStop("Bridge Street");
    }

    @Test
    public void busStopHasAName(){
        assertEquals("Bridge Street", busStop.getName());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.numberOfPeopleInQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.numberOfPeopleInQueue());
    }


}
