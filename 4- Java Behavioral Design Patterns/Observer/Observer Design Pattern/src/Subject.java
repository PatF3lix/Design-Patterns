import java.util.ArrayList;
import java.util.List;

public interface Subject {

    //Methods to register and unregister observers
    void register(Observer obj);
    void unresgister(Observer obj);

    //method to notify observers of changes
    void notifyObservers();
    //Method to get updates from subject, not required, but, added so observers can query
    Object getUpdate(Observer obj);
}


class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unresgister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerslocal = null;

        if(changed){
           observerslocal = new ArrayList<>(this.observers);
           this.changed = false;

            for(Observer obj : observerslocal) {
                obj.update();
            }
        }

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    //Method to post message to the topic, change state (trigger notifications)
    public void postMessage(String msg){
        System.out.println("Message Posted to topic:"+ msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }


}
