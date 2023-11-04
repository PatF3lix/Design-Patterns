public class Client {

    public static void main(String[] args) {
        CricketData cricketData = new CricketData();

        Observer averageScore =  new AverageScoreDisplay();
        Observer currentScore = new CurrentScoreDisplay();

        cricketData.registerObserver(averageScore);
        cricketData.registerObserver(currentScore);

        cricketData.dataChanged();

        cricketData.unRegisterObserver(averageScore);

        cricketData.dataChanged();


    }
}