import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> count;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.count = new ArrayList<>();
    }

    public int passengerCount(){
        return this.count.size();
    }


    public void add(Person person){
        if (this.passengerCount() < this.capacity){
            this.count.add(person);
        }
    }

    public void remove(Person person) {
        this.count.remove(person);
    }

    public void pickupFromStop(BusStop busStop){
        Person person = busStop.removeFromQueue();
        this.add(person);
    }



}
