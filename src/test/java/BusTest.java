import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Glasgow", 3);
        person = new Person();
        busStop = new BusStop();
        busStop.addToQueue (person);

    }

    @Test
    public void getNumberOfPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
       bus.add(person);
       assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.add(person);
        bus.remove(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickupFromStop(){
        bus.pickupFromStop(busStop);
        assertEquals(1, bus.passengerCount());
    }


}
