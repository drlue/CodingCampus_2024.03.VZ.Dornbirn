package lukas.week11.SqlAndOopV2;

import lukas.week11.SqlAndOopV2.dbManager.DbManager;
import lukas.week11.SqlAndOopV2.model.Country;
import lukas.week11.SqlAndOopV2.model.World;

public class Main {

    public static void main(String[] args) {
        //connect to db
        DbManager db = DbManager.getInstance();

        //
        World world = new World();
        db.readCountries(world);
        //alternativ:
        //world.getCountriesFromDb(db);
        world.printStructure();

        //
        //Find country
        //
        Country findResultCountry  = world.searchCountryByName("Austria");
        findResultCountry.printStructure();

        //
        //Create new Country in Db
        //
        Country myCountry = new Country(
                "Lukistan",
                "LUK",
                "Codetown",
                "Javavalley",
                250000f,
                1
        );
        db.insertCountry(myCountry);
        world.addCountry(myCountry);
        myCountry.printStructure();

        //
        //Change / Update Country
        //
        //V1 only population
        myCountry.setPopulation(2);
        db.updateCountryPopulation(myCountry);
        myCountry.printStructure();

        //V2 update total row
        myCountry.setPopulation(3);
        db.updateCountry(myCountry);
        myCountry.printStructure();

        //
        //Delete Country
        //
        db.deleteCountry(myCountry);
        world.removeCountry(myCountry);



    }


}
