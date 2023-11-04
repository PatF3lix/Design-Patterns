abstract class AnimalFactoryInterface {
    abstract AnimalInterface getAnimalType(String type) throws  Exception;
}

class ConcreteFactory extends AnimalFactoryInterface {

    @Override
    AnimalInterface getAnimalType(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal type: " + type + " cannot be instantiated");
        }
    }
}