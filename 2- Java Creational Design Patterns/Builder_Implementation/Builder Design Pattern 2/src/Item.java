

public interface Item {
    String name();
    Packing packing();
    float price();
}

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}

class VegeBurger extends Burger {

    @Override
    public float price() {
        return 3.50f;
    }

    @Override
    public String name() {
        return "Vege Burger";
    }
}

class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 4.50f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}

class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 1.50f;
    }

    @Override
    public String name()
    {
        return "Pepsi";
    }
}

class Coke extends ColdDrink {
    @Override
    public float price() {
        return 1.75f;
    }

    @Override
    public String name()
    {
        return "Coke";
    }
}

interface Packing {
    String pack();
}

class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

