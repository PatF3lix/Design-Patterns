
/*This interface is implemented by all those
classes that are to be updated whenever
there is an update from CricketData*/

interface Observer {
    void update(int runs, int wickets, float overs);
}

class AverageScoreDisplay implements Observer {
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    public void display() {
        System.out.println("\nAverage score display: \n" +
                "Run Rate: " + runRate +
                "\nPredictedScore: " + predictedScore);
    }
}

class CurrentScoreDisplay implements Observer {
    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\nCurrent score display: \n" +
                "Runs: " +  runs + "\nWickets: " + wickets + "\nOvers: " + overs);
    }
}

