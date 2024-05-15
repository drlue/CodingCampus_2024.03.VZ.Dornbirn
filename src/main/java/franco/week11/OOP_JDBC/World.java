package franco.week11.OOP_JDBC;

import java.util.ArrayList;
import java.util.Scanner;

public class World {
    public static Scanner scan = new Scanner(System.in);

    private final String name = "Earth";
    private ArrayList<Country> countryArrayList;

    public World() {
        countryArrayList = new ArrayList<>();
    }
    public void addCountry(Country pays) {
        if (!countryArrayList.contains(pays)) {
            countryArrayList.add(pays);
        }
//        else{
//            System.out.println(pays + " already exist on "+ name);
//        }
    }
    public void printStructure(){
        for(Country pays:countryArrayList){
            pays.printStructure();
        }
    }

}









