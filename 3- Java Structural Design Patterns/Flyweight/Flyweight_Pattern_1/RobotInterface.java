

public interface RobotInterface {
    void print();

    // Extrinsic data is passed as arguments
    void setColor(String colorOfRobot);
}

// Normally the robot class should not store extrinsic data, it should be used when passed as an argument to a method.*
class Robot implements RobotInterface {
    /*Color of robot and robot category should not be stored in this class,
    it just for displaying and demonstrating that we are setting extrinsic data.
    Should normally be passed as an argument in one of the RobotInterface methods*/ 
    private String robotCategory;
    public String robotColor;

    public Robot(String robotCategory) {
        this.robotCategory = robotCategory;
    }

    @Override
    public void print() {
        System.out.println(" This is a " + robotCategory + " type robot with " + robotColor + " color");
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.robotColor = colorOfRobot;
    }

}

// Simple
// intrinsic data implimentation 

// class SmallRobot implements RobotInterface {

//     @Override
//     public void print() {
//         System.out.println("This is a small robot");
//     }

// }

// class LargeRobot implements RobotInterface {

//     @Override
//     public void print() {
//         System.out.println("This is a Large robot");
//     }
    
// }
