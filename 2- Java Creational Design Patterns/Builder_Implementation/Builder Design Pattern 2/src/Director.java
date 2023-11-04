public class Director {
    MealBuilder myBuilder;

    public void construct(MealBuilder mealBuilder) {
        myBuilder = mealBuilder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
