package DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBHelper {
    public static final String USER = "kuis";
    public static final String PASSWORD = "1234";
    public static final String DB = "kuis";
    public static final String MyConn = "jdbc:mysl://localhost/"+DB+"?user="+USER+"&password="+PASSWORD;
    private static String SQConn;
    public static Connection getConnection(String driver){
        Connection conn = null;
        switch (driver) {
            case "SQLITE": {
                try {
                    //            Class.forName("com.mysql.cj.jdbc.Driver");
                    Class.forName("org.sqlite.JDBC");
                    conn = DriverManager.getConnection(SQConn);
                    System.out.println("Koneksi Berhasil");
                } catch (ClassNotFoundException ex) {
                    System.out.println("Library blm ada");
                    //            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    //            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Koneksi Gagal");
                }
                break;
            }
            case "MYSQL": {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(MyConn);
                    System.out.println("Koneksi berhasil");
                } catch (ClassNotFoundException ex) {
                  System.out.println("Library blm ada");
        //        Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex){
        //        Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                  System.out.println("Koneksi gagal");
                }
            }
        }
        return conn;
    }
}
