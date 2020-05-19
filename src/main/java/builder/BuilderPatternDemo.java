package builder;

/**
 * @fileName: BuilderPatternDemo
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 * 1. independent and easy to extend
 * 2. easy to control the inside risk
 * 3. has to use with similarity
 * 4. big builder will have complicated inside the design
 * 5. the object inside must rely on property
 **/
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
