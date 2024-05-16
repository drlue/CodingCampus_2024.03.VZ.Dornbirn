package gyula.week12.oopexample;

import gyula.week12.oopexample.dbmanager.DatabaseManager;
import gyula.week12.oopexample.model.World;


public class DB_OOP_Example {
    public static void main(String[] args) {
        DatabaseManager db = DatabaseManager.getInstance();

        World world = new World();
        db.readContinents(world);


        world.printStructure();

    }
}
