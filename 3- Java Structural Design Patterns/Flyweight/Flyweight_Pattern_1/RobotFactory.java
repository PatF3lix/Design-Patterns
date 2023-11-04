
// Usually you will store a cache of objects in here.

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<String, RobotInterface>();
    
    /*We're going to add a method so that we can retrive the total number of objects created.
     * Which will demonstrate the use of the flyweight through the client.
     */
    public int totalObjectsCreated() {
        return shapes.size();
    }

    //Actual factory method

    public RobotInterface getRobotFromFactory(String RobotCategory) throws Exception {
        /* In this case you could change RobotInterface to the Robot class and avoid the casting in the client class,
            but if you plan on having more than one class implement the RobotFactory it is necessary to keep it as flexible as possible.
            It all depends on context!*/
        RobotInterface myRobot = null;

        if (shapes.containsKey(RobotCategory)) {
            myRobot = shapes.get(RobotCategory);
        } else {
            switch (RobotCategory) {
                case "small":
                    System.out.println("We don't have Small Robot Stored in our Map. So we are creating a Small Robot instance.");
                    myRobot = new Robot("small");
                    shapes.put("small", myRobot);
                    break;
                case "large":
                    System.out.println("We don't have Large Robot Stored in our Map. So we are creating a Large Robot instance.");
                    myRobot = new Robot("large");
                    shapes.put("large", myRobot);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only small and large shapes");
            }
        }
        return myRobot;
    }
}
