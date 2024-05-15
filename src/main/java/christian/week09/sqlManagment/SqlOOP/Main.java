package christian.week09.sqlManagment.SqlOOP;

import christian.week09.sqlManagment.SqlOOP.Database.Databasemanager;
import christian.week09.sqlManagment.SqlOOP.model.World;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        Databasemanager db = Databasemanager.getInstance();
        db.getConnection();
        db.readContinentFromDB(world);
        world.printWorldStructure();
    }
}
