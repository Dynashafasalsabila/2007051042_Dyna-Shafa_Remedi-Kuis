
package DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oven.model.oven;


public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addsetrika(oven o){
        String insertTv = "INSERT INTO `produk`(`id`, `nama`, `tgl_produksi`,`merk`.`pembayaran`)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertTv);
            stmtInsert.setString(1, o.getId());
            stmtInsert.setString(2, o.getNama());
            stmtInsert.setString(3, o.getTglBeli());
            stmtInsert.setString(4, o.getPembayaran());
            stmtInsert.setString(5, o.getMerk());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addoven(oven o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
