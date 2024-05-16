package ardijanla.ArdijansBank.DAO;

import ardijanla.ArdijansBank.models.Bank;

import java.sql.*;
import java.util.List;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class BankDaoImpl implements BankDao {

    private String jdbcURL = "jdbc:mysql://localhost:3306/bankdb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";


    private static final String INSERT_BANK_SQL = "INSERT INTO Bank (name,location) VALUES (?,?);";
    private static final String SELECT_BANK_BY_ID = "select id,name,location from bank";
    private static final String UPDATE_BANK_SQL = "update bank set name = '?' where bank.name = '?'";
    private static final String DELETE_BANK_BY_ID = "delete from bank where bank.name = '?';";
    private static final String SELECT_ALL_BANKS = "Select * from bank";


    protected Connection getConnection() {


        try {
            return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            System.out.println("not gutd");
            return null;
        }

    }


    @Override
    public void addBank(Bank bank) {
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BANK_SQL,Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1,bank.getBankname());
            preparedStatement.setString(2,bank.getLocation());
            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();

            if (generatedKeys.next()){
                bank.setIdbank(generatedKeys.getInt(1));
            }



        }catch (SQLException e){

        }
    }

    @Override
    public Bank getBank(int id) {
        return null;
    }

    @Override
    public List<Bank> getAllBanks() {
        return List.of();
    }

    @Override
    public void updateBank(Bank bank) {

    }

    @Override
    public void deleteBank(int id) {

    }
}
