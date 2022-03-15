import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public void addToQueue(Person person){
        this.queue.add(person);
    }

    public int queueCount(){
        return this.queue.size();
    }

    public Person removeFromQueue() {
        return this.queue.remove(0);
    }
}
