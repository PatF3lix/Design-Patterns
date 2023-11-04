public interface MealBuilder {

    void buildBurger();
    void buildDrink();
    Meal getMeal();
}

class VegeMealBuilder implements MealBuilder {
    private Meal vegMeal;

    public VegeMealBuilder() {
        this.vegMeal = new Meal();
    }

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegeBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class NonVegMealBuilder implements MealBuilder {
    private Meal nonVegMeal;

    public NonVegMealBuilder() {
        this.nonVegMeal = new Meal();
    }

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}


