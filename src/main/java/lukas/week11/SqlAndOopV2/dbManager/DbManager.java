package lukas.week11.SqlAndOopV2.dbManager;

import lukas.week11.SqlAndOopV2.model.City;
import lukas.week11.SqlAndOopV2.model.Country;
import lukas.week11.SqlAndOopV2.model.World;

import java.lang.reflect.Type;
import java.sql.*;
import java.util.Vector;

public class DbManager {
    private static DbManager _instance = null;
    private Connection conn = null;

    private DbManager() {
    }

    public static DbManager getInstance() {
        if (_instance == null) {
            _instance = new DbManager();
        }
        return _instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial", "lukas", "#StrengGeheim!");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                conn = null;
            }
        }
        return conn;
    }


    public void readCountries(World w) {
        getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT Name, Code, Capital, Province, Area, Population FROM country");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Country country = new Country(
                            rs.getString("Name"),
                            rs.getString("Code"),
                            rs.getString("Capital"),
                            rs.getString("Province"),
                            rs.getFloat("Area"),
                            rs.getInt("Population"));

                    w.addCountry(country);
                    readCitiesFromCountry(country);
                }
                rs.close();
                ps.close();
            } catch (SQLException sqle) {
                try {
                    conn.close();
                    sqle.printStackTrace();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }

    public void readCitiesFromCountry(Country country) {
        getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT ci.name, ci.province, ci.population, ci.longitude, ci.latitude FROM city ci JOIN country co on ci.country = co.code WHERE co.name = ?");
                ps.setString(1, country.getName());
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    City city = new City(
                            rs.getString("Name"),
                            country,
                            rs.getString("Province"),
                            rs.getInt("Population"),
                            rs.getFloat("Longitude"),
                            rs.getFloat("Latitude"));
                    country.addCityToCities(city);
                }

                rs.close();
                ps.close();
            } catch (SQLException sqle) {
                try {
                    conn.close();
                    sqle.printStackTrace();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }

    }

    public void insertCountry(Country country) {
        getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("insert into country(name, code, area, population) " +
                        "values(?,?,?,?)");
                ps.setString(1, country.getName());
                ps.setString(2, country.getCode());
                ps.setString(3, Float.toString(country.getArea()));
                ps.setString(4, Integer.toString(country.getPopulation()));

                int affectedLines = ps.executeUpdate();
                printUpdateFeedback(affectedLines, "inserted");

                ps.close();

            } catch (SQLException sqle) {
                try {
                    conn.close();
                    sqle.printStackTrace();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }

    public void updateCountryPopulation(Country country) {
        getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("update country set population = ? WHERE name = ?");
                ps.setInt(1, country.getPopulation());
                ps.setString(2, country.getName());

                int affectedLines = ps.executeUpdate();
                printUpdateFeedback(affectedLines, "updated");

                ps.close();

            } catch (SQLException sqle) {
                try {
                    conn.close();
                    sqle.printStackTrace();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }

    public void updateCountry(Country country) {
        getConnection();
        if (conn != null) {
            try {

                PreparedStatement ps = conn.prepareStatement("update country " +
                        "set " +
                        "name = ?, " +
                        "code = ?, " +
                        "capital = ?, " +
                        "province = ?, " +
                        "area = ?, " +
                        "population = ? " +
                        "WHERE name = ?");
                ps.setString(1, country.getName());
                ps.setString(2, country.getCode());
                ps.setString(3, country.getCapital());
                ps.setString(4, country.getProvince());
                ps.setFloat(5, country.getArea());
                ps.setInt(6, country.getPopulation());
                ps.setString(7, country.getName());

                int affectedLines = ps.executeUpdate();
                printUpdateFeedback(affectedLines, "updated");

                ps.close();

            } catch (SQLException sqle) {
                try {
                    conn.close();
                    sqle.printStackTrace();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }


    public void deleteCountry(Country country) {
        getConnection();
        if (conn != null) {
            try {

                PreparedStatement ps = conn.prepareStatement("DELETE FROM country WHERE Name = ?");
                ps.setString(1, country.getName());

                int affectedLines = ps.executeUpdate();
                printUpdateFeedback(affectedLines, "deleted");

                ps.close();

            } catch (SQLException sqle) {
                try {
                    conn.close();
                    sqle.printStackTrace();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }

    //------------------------------ GENERAL SQL QUERY METHOD
    public void getRsFromDb(String sql, Vector<Object> params, IQueryProcessor queryProc) {
        getConnection();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mondial", "lukas", "#StrengGeheim!");
            PreparedStatement stmt = conn.prepareStatement(sql);

            //set params
            stmt = checkStatement(stmt, sql, params);

            ResultSet rs = stmt.executeQuery();
            queryProc.process(rs);

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int countQuestionMarks(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '?') {
                count++;
            }
        }
        return count;
    }

    private PreparedStatement checkStatement(PreparedStatement stmt, String sql, Vector<Object> params) {
        int questionMarks = countQuestionMarks(sql);
        if (questionMarks == 0) {
            return stmt;
        } else if (questionMarks > params.size()) {
            System.out.printf("Params missing (?: %d, params: %d", questionMarks, params.size());
            return null;
        } else {
            if (questionMarks != params.size()) {
                System.out.printf("More params (%d) then ?(%d)", params.size(), questionMarks);
            }

            try {
                int paramCount = Math.min(countQuestionMarks(sql), params.size());
                for (int i = 0; i < paramCount; i++) {
                    Object param = params.get(i);
                    switch (param) {
                        case String s -> stmt.setString(i + 1, s);
                        case Integer integer -> stmt.setInt(i + 1, (int) param);
                        case Float v -> stmt.setFloat(i + 1, (float) param);
                        case Double v -> stmt.setDouble(i + 1, (double) param);
                        case Date date -> stmt.setDate(i + 1, date);
                        case null, default -> {
                            System.out.printf("Param tpye %s not implemented", param.getClass().getSimpleName());
                            return null;
                        }
                    }
                }
                return stmt;
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                return null;
            }
        }
    }

    //--- PRINT ---
    private void printUpdateFeedback(int affectedLines, String verb) {
        switch (affectedLines) {
            case 0:
                System.out.println("ATTENTION: No rows affected!");
                break;
            case 1:
                System.out.printf("One row %s!%n", verb);
                break;
            default:
                System.out.printf("ATTENTION: Multiple rows (%d) %s!", affectedLines, verb);
        }
    }


}