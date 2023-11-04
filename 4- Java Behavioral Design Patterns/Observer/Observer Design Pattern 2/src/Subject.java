import java.util.ArrayList;

public interface Subject {
    void registerObserver(Observer obj);
    void unRegisterObserver(Observer obj);
    void notifyObservers();
}

class CricketData implements Subject {
    int runs;
    int wickets;
    float overs;

    ArrayList<Observer> observerArrayList;

    public CricketData() {
        this.observerArrayList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obj) {
        observerArrayList.add(obj);
    }

    @Override
    public void unRegisterObserver(Observer obj) {
        observerArrayList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerArrayList) {
            o.update(runs, wickets, overs);
        }
    }

    //Imitating real life data from live cricket game
    private int getLatestRuns() {return 90;}
    private int getLatestWickets() {return 2;}

    private float getLatestOvers() {return (float) 10.2;}

    //this method is used to update displays when data changes
    public void dataChanged() {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
        notifyObservers();
    }
}
