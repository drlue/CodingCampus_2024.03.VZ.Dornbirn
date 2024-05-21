package samet.week12.SqlOoP;

import samet.week12.SqlOoP.DatabaseManager.DatabaseManager;

public class Database_OOP_Example {

    public static void main(String[] args) {
        DatabaseManager databaseManager = DatabaseManager.getInstance();

        World world = new World();
        databaseManager.readCountry(world);

        world.printStructure();

    }
}
