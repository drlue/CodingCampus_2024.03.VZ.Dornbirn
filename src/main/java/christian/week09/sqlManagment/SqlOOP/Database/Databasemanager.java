package christian.week09.sqlManagment.SqlOOP.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databasemanager {
    private static Databasemanager _Instance=null;
    private Connection conn = null;

    private Databasemanager(){

    }
    public static Databasemanager getInstance(){
        if(_Instance == null){
            _Instance = new Databasemanager();
        }
        return _Instance;
    }
    public void getConnection(){
        if(conn==null){
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=root&password=Zmamk_243567");
            }catch (SQLException sex){
                sex.printStackTrace();
            }
        }
    }


}
