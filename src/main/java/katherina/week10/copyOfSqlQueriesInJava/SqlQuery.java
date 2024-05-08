package katherina.week10.copyOfSqlQueriesInJava;
//Kommentierbare Kopie zu Lernzwecken.

import java.sql.*;

public class SqlQuery {
    public static void main(String[] args) {
        String searchText = "%burg";
        //Wonach suche ich? An der Stelle kann das auch ein Scanner sein.
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "root", "3v4n3sC4");
            //Normalerweise wird das nicht so gemacht, aber wir loggen uns quasi hardcoded ein, um nicht bei jeder Abfrage neu zu tippen ^^
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM city where name like ?");
            //Hier kommt das Query rein. Es ist sinnvoll, dieses vorher in Workbench/DBeaver zu testen, ob es auch liefert.
            ps.setString(1, searchText + "%");
            ResultSet rs = ps.executeQuery();
            System.out.println("Stadtname:\n------------------------");
            while (rs.next())
            //Sagt im Grunde genommen aus: Gib die Tabelle Zeile für Zeile wieder.
                {
                    System.out.print("|");
                System.out.println(rs.getString("Name"));

            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Try-Catch-Abfrage ist IMMER notwendig.
}
