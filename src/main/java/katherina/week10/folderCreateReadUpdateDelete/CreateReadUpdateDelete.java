package katherina.week10.folderCreateReadUpdateDelete;

import java.sql.*;

public class CreateReadUpdateDelete {
    public static void main(String[] args) {

        String searchText = "%burg";
        //Wonach suche ich? An der Stelle kann das auch ein Scanner sein.
        try {
            Connection datenbankanbindung = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "root", "3v4n3sC4");
            //Normalerweise wird das nicht so gemacht, aber wir loggen uns quasi hardcoded ein, um nicht bei jeder Abfrage neu zu tippen ^^
            PreparedStatement korrektesValidesQuery = datenbankanbindung.prepareStatement("SELECT * FROM city where name like ?");
            //Hier kommt das Query rein. Es ist sinnvoll, dieses vorher in Workbench/DBeaver zu testen, ob es auch liefert.
            korrektesValidesQuery.setString(1, searchText + "%");
            ResultSet ausgabetabelle = korrektesValidesQuery.executeQuery();

            while (ausgabetabelle.next())
            //Sagt im Grunde genommen aus: Gib die Tabelle Zeile für Zeile wieder.
            {
                System.out.println(ausgabetabelle.getString("Name"));
            }

            ausgabetabelle.close();
            korrektesValidesQuery.close();
            datenbankanbindung.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Try-Catch-Abfrage ist IMMER notwendig.

public static void create(){
}

public static void read(){
}

public static void update(){
}

public static void delete(){
}
    }
