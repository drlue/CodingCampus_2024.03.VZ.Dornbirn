package demian.week08.Enum.Pizza;

public class Sim {

    public static void main(String[] args) {

        Pizza salamipizza = new Pizza();
        salamipizza.addTopping(PizzaTopings.SALAMI);
        salamipizza.addTopping(PizzaTopings.CHEESE);
        salamipizza.addTopping(PizzaTopings.TOMATO);
        salamipizza.backingSIM();
        System.out.println("Preis für Pizza mit " + salamipizza.getToppinganzahl() + " Toppings (" + salamipizza.getToppings() + "): "+ salamipizza.calculatePizzaPrice());
    }
}
