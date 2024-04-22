package demian.week08.Enum.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<PizzaTopings> allPizzaToppings;

    public Pizza() {

        this.allPizzaToppings = new ArrayList<>();
        System.out.println("Pizza bereit zum belegen");
    }

    public void addTopping(PizzaTopings topping) {

        allPizzaToppings.add(topping);
        System.out.println("Pizza mit " + topping + " belegt");
    }

    public double calculatePizzaPrice() {
        double toppingprize = 1.5;
        return (allPizzaToppings.size() * toppingprize);
    }

    public int getToppinganzahl() {
        return allPizzaToppings.size();
    }


    public String getToppings() {
        String toppings = "";
        for (int i = 0; i < allPizzaToppings.size(); i++) {
            if (i == allPizzaToppings.size()-1) {
                toppings += allPizzaToppings.get(i);
            } else {
                toppings += allPizzaToppings.get(i) + ",";
            }
        }
        return toppings;
    }

    public void backingSIM(){
        System.out.println("Pizza wird gebacken ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("3");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("       _              \n" +
                "      (_)             \n" +
                " _ __  _ __________ _ \n" +
                "| '_ \\| |_  /_  / _` |\n" +
                "| |_) | |/ / / / (_| |\n" +
                "| .__/|_/___/___\\__,_|\n" +
                "| |                   \n" +
                "|_|  ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                        ___\n" +
                "                        |  ~~--.\n" +
                "                        |%=@%%/\n" +
                "                        |o%%%/\n" +
                "                     __ |%%o/\n" +
                "               _,--~~ | |(_/ ._\n" +
                "            ,/'  m%%%%| |o/ /  `\\.\n" +
                "           /' m%%o(_)%| |/ /o%%m `\\\n" +
                "         /' %%@=%o%%%o|   /(_)o%%% `\\\n" +
                "        /  %o%%%%%=@%%|  /%%o%%@=%%  \\\n" +
                "       |  (_)%(_)%%o%%| /%%%=@(_)%%%  |\n" +
                "       | %%o%%%%o%%%(_|/%o%%o%%%%o%%% |\n" +
                "       | %%o%(_)%%%%%o%(_)%%%o%%o%o%% |\n" +
                "       |  (_)%%=@%(_)%o%o%%(_)%o(_)%  |\n" +
                "        \\ ~%%o%%%%%o%o%=@%%o%%@%%o%~ /\n" +
                "         \\. ~o%%(_)%%%o%(_)%%(_)o~ ,/\n" +
                "           \\_ ~o%=@%(_)%o%%(_)%~ _/\n" +
                "             `\\_~~o%%%o%%%%%~~_/'\n" +
                "                `--..____,,--'\n");
    }

}
