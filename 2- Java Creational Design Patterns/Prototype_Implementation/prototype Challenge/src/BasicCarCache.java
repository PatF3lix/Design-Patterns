import java.util.Hashtable;

public class BasicCarCache {

    private static Hashtable<String, BasicCar> basicCarHashtable = new Hashtable<>();

    public static BasicCar getCar(String carName) {
        BasicCar cachedBasicCar = basicCarHashtable.get(carName);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void loadCache() {
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price=100000;
        basicCarHashtable.put(nano_base.getModelName(), nano_base);

        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price = 500000;
        basicCarHashtable.put(ford_basic.getModelName(), ford_basic);
    }
}
