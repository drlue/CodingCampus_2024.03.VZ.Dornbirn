package franco.week11.OOP_JDBC;

import franco.week11.dbManager.DatabaseManager;

public class WorldMain {
    public static void main(String[] args) {
        DatabaseManager db = DatabaseManager.getInstance();
        World earth= new World();
        db.readCountry(earth);
        earth.printStructure();



    }
}
