package demian.week08.Enum.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<PizzaTopings> allPizzaToppings;

    public Pizza() {
        this.allPizzaToppings = new ArrayList<>();
    }

    public void addTopping(PizzaTopings topping){
        allPizzaToppings.add(topping);
    }

    public double calculatePizzaPrice(){
        double toppingprize = 1.5;
        return (allPizzaToppings.size()*toppingprize);
    }
}
