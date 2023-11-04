abstract class HouseTemplate {

    //template method, final so subclasses cannot override it
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        buildRoof();
        System.out.println("The House has been built!");
    }

    //default implementation, hook method
    protected void buildRoof() {
        System.out.println("Building The Wooden Roof");
    }

    // default implementations, 2 concrete method buildWindows, buildFoundation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }

    //methods to be implemented by subclasses
    protected abstract void buildWalls();
    protected abstract void buildPillars();

}

//Concrete classes
class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with Wooden coating");
    }
}

class GlassHouse extends HouseTemplate {

    //Overridden Hook Method
    @Override
    protected void buildRoof() {
        System.out.println("Building a Glass Roof");
    }

    //abstract methods
    @Override
    protected void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with Glass coating");
    }
}
