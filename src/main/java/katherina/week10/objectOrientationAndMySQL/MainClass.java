package katherina.week10.objectOrientationAndMySQL;

import java.sql.*;

public class MainClass {
    public static void main(String[] args) {
        Welt earth = new Welt("Erde");


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial?user=root&password=3v4n3sC4");

            preparedStatement = connection.prepareStatement("Select * FROM country");
            //preparedStatement.setString(1, "");
            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int col = 1; col <= metaData.getColumnCount(); col++) {
                System.out.println(metaData.getColumnLabel(col) + " " +
                        metaData.getColumnTypeName(col) + " " +
                        metaData.getColumnDisplaySize(col)
                );
            }
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                String code = resultSet.getString(2);
                int population = resultSet.getInt(6);
                System.out.printf("Country %s = new country(\"%s\",\"%s\", %d);%n", code.toLowerCase(), name, code, population);
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException se) {
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException se) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException se) {
                }
            }
        }


        earth.printStructure();
    }


}
