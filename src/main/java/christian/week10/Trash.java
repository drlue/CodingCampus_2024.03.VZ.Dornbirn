package christian.week10;

import christian.week10.dbManagment.DbManager;

import java.sql.SQLException;

public class Trash {
//
//    DbManager db = DbManager.getInstance();
//    boolean loopBoolean = true;
//        while (loopBoolean) {
//        int choice = 0;
//        while(choice == 0){
//            System.out.println("Willkommen bei der BadBank!\n Wählen sie zwischen den nachfolgenden Optionen:\n 1) Neuer Kunde\n 2) Neues Konto\n 3) Konto löschen\n 4) Berechtigungen ändern\n 5) Ein- oder Auszahlen");
//            choice = DbManager.sc.nextInt();
//        }
//
//
//    }
//
//    int custID = db.getCustomerId();
//        System.out.println("customer ID:" + custID);
//public void printResultsetCustomers() {
//
//    try {
//        while (rs.next()) {
//            System.out.printf("%d | %s | %d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
//        }
//    } catch (SQLException sex) {
//        sex.printStackTrace();
//    }
//}
//
//    public void printResultsetAccount() {
//
//        try {
//            while (rs.next()) {
//                System.out.printf("%3d | %.2f\n", rs.getInt(1), (float) (Math.pow(10,-2) * rs.getInt(2)));
//            }
//        } catch (SQLException sex) {
//            sex.printStackTrace();
//        }
//    }

//    public void SqlQuerySelect(String query) {
//        getConnection();
//        prep = null;
//        rs = null;
//        try {
//            prep = conn.prepareStatement(query);
//            rs = prep.executeQuery();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void SqlQueryInsert(String query) {
//        getConnection();
//        prep = null;
//        rs = null;
//        try {
//            prep = conn.prepareStatement(query);
//            prep.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void SqlCloseConnectionsEtc() {
//        try {
//            if (rs != null) {
//                rs.close();
//            }
//            if (prep != null) {
//                prep.close();
//            }
//            if (conn != null) {
//                conn.close();
//            }
//
//        } catch (SQLException sex) {
//            sex.printStackTrace();
//        }
//    }
}
