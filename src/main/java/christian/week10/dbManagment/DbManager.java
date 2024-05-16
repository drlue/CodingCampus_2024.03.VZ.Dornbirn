package christian.week10.dbManagment;

import christian.week10.model.Bank;

import java.sql.*;
import java.util.Scanner;

public class DbManager {
    private static DbManager dbmanager = null;
    private Connection conn;

    private DbManager() {

    }


    //================================================================================================set=========
    //================================================================================================get=========
    public static DbManager getInstance() {
        if (dbmanager == null) {
            dbmanager = new DbManager();
        }
        return dbmanager;
    }


    public void getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankschema?user=root&password=Zmamk_243567");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //================================================================================================create=========
    //================================================================================================alter=========
    //================================================================================================remove=========
    //================================================================================================SQL-Get=========

    //================================================================================================SQL=========
    public void readBankFromDB(){
        getConnection();
        try{
            PreparedStatement prep = conn.prepareStatement("Select * from bank");
            ResultSet rs = prep.executeQuery();
            while(rs.next()){
                Bank bank = new Bank (
                        rs.getInt("bank_id"),
                        rs.getString("name"),
                        rs.getInt("established"),
                        rs.getFloat("assets")
                );
            }

        }catch (SQLException sex){
            sex.printStackTrace();
        }
    }


    //================================================================================================print=========

}
