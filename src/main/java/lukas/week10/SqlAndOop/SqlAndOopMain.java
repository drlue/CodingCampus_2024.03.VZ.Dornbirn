package lukas.week10.SqlAndOop;

import java.sql.*;

public class SqlAndOopMain {

    public static void main(String[] args) {
        World myWorld = new World();
        myWorld.readCountriesFromDb();
        myWorld.readCitiesFromDb();
    }


}



