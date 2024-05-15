package gyula.week12.jail.service;

import gyula.week12.jail.model.Block;
import gyula.week12.jail.model.Jail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BlockService {


    public void readBlocks(Jail jail) {
        Connection conn = DatabaseManager.getInstance().getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("select ID, name, constructed from block b");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Block block = new Block();
                    block.setId(rs.getInt("ID"));
                    block.setName(rs.getString("name"));
                    block.setConstructed(new Date(rs.getDate("constructed").getTime()));
                    jail.addBlock(block);
                }
                rs.close();
                ps.close();
            } catch (SQLException sqle) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
                conn = null;
            }
        }
    }


}
