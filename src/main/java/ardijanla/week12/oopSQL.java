package ardijanla.week12;

import ardijanla.week12.dbmanager.DatabaseManager;
import ardijanla.week12.models.World;
import ardijanla.week12.services.CityService;
import ardijanla.week12.services.CountryService;

public class oopSQL {
    public static void main(String[] args) {

        DatabaseManager dbmanager = DatabaseManager.getinstance();

        World world = new World();
        CountryService cs = new CountryService();
        CityService cityService  = new CityService();


        cs.readCountries(world);




        world.printStructure();


    }
}
