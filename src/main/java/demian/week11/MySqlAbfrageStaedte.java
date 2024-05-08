package demian.week11;

import at.digitalcampus.codingcampus.repetition.excercise1.ConsoleColors;

import java.sql.*;
import java.util.Scanner;

public class MySqlAbfrageStaedte {

    //AUFGABE: Abfrage Städte im Land ...
    //Erstelle ein Java Programm:
    //
    //1. der von Benutzer ein Land Name fragt. (Es ist der letzte Schritt im Entwicklungsprozess)
    //2. sich mit dem lokalen MySql Server verbindet
    //3. mit dem Namen eine SQL Abfrage ausführt
    //4. das Ergebnis in einer "schöne" tabellarische Form darstellt
    //!!! Achte darauf:
    //
    //X. Alle geöffnete Ressourcen wieder zuzumachen
    //Z. Keine Tür für SQL-Injection offenzulassen


    public static void main(String[] args) {

        //1.  der von Benutzer ein Land Name fragt.
        System.out.printf("%sGeben Sie hier den Namen eines Landes ein%n==>%s", ConsoleColors.BLUE, ConsoleColors.RESET);
        Scanner sc = new Scanner(System.in);
        String searchText = sc.nextLine();

        try {
            // 2. sich mit dem lokalen MySql Server verbindet
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "demian", "demian");

            // 3. mit dem Namen eine SQL Abfrage ausführt
                //3.1 SQL Statement vorbereiten und SQL Injection abfangen mit Platzhalter (?) für Userinput (Der Userinput darf nicht direkt in den String eingefügt werden weil sonst eine SQL-Injection stattfinden könnte.
                PreparedStatement ps = conn.prepareStatement("select city.Name as Stadt, city.Province as Bundesland, Country.Name as Staat from city join country on city.Country = Country.Code where Country.Name like ?");
                //3.2 (?) durch Userinput ersetzen (SQL Injection wird unmöglich gemacht durch setString)
                ps.setString(1,  searchText ); //Z. Keine Tür für SQL-Injection offenzulassen
                //3.3 Abfrage ausführen
                ResultSet rs = ps.executeQuery();




            // 4. das Ergebnis in einer "schöne" tabellarische Form darstellt
            System.out.println("----------------------------------------------------");
            System.out.printf("%s|%-20s | %-30s | %-15s|%n%s",ConsoleColors.BLUE, ps.getMetaData().getColumnLabel(1), ps.getMetaData().getColumnLabel(2), ps.getMetaData().getColumnLabel(3),ConsoleColors.RESET);
            System.out.println("----------------------------------------------------");
            while (rs.next()){
                System.out.printf("|%-20s | %-30s | %-15s|%n", rs.getString(1), rs.getString(2), rs.getString(3));
            }
            System.out.println("----------------------------------------------------");

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
