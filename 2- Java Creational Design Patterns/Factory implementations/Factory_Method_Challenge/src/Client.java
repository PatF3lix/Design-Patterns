public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        AnimalFactoryInterface animalFactory = new ConcreteFactory();

        AnimalInterface duckType = animalFactory.getAnimalType("Duck");
        duckType.Speak();

        AnimalInterface tigerType = animalFactory.getAnimalType("Tiger");
        tigerType.Speak();

        AnimalInterface lionType = animalFactory.getAnimalType("Lion");
        lionType.Speak();
    }

}