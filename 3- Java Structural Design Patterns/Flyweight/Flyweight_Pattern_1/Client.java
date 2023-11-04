import java.util.Random;

public class Client {

    public static void main(String[] args) throws Exception {
        RobotFactory myRobotFactory = new RobotFactory();
        Robot robotCategory;
        System.out.println("\n***Flyweight Pattern Example***\n");

        /*Here we are trying to get the objects additonaly 2 more times.
         * Note that from now onward we do not need to create additional
         *  small robots as we have already created this category.*/
        for (int i = 0; i < 2; i++) {
            robotCategory = (Robot) myRobotFactory.getRobotFromFactory("small");
            robotCategory.setColor(getRandomColor());
            robotCategory.print();
        }

        int numOfDistinctRobots = myRobotFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created = " + numOfDistinctRobots);

        /*Here we are trying to get the objects additonaly 5 more times.
         * Note that from now onward we do not need to create additional
         *  large robots as we have already created this category.*/
        for (int i = 0; i < 5 ; i++) {
            robotCategory = (Robot) myRobotFactory.getRobotFromFactory("large");
            robotCategory.setColor(getRandomColor());
            robotCategory.print();
        }

        numOfDistinctRobots = myRobotFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created = " + numOfDistinctRobots);
    };
    
    public static String getRandomColor() {
        Random r = new Random();
        String color;
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            color = "red";
        } else {
            color = "green";
        }
        return color;
    }
}