package gyula.week12.jail.service;

import gyula.week12.jail.model.Block;
import gyula.week12.jail.model.Cell;
import gyula.week12.jail.model.Jail;

import java.sql.*;
import java.util.Date;

public class CellService {

    public void updateName(String newName, Cell c){
        c.setName(newName);

        Connection conn = DatabaseManager.getInstance().getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement(
                        "update cell set name = ? where ID = ?");
                ps.setString(1, newName);
                ps.setInt(2, c.getId());
                int countChanges = ps.executeUpdate();

                if (countChanges != 1) {
                    System.out.println("Something goes wrong...");
                }
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

    public Cell createNewCell(String name, int capacity, Block b){
        Cell c = new Cell();
        c.setName(name);
        c.setCapacity(capacity);
        b.addCell(c);

        Connection conn = DatabaseManager.getInstance().getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement(
                        "insert into cell (name, capacity, blockId) Values (?, ?, ?);",
                        Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, name);
                ps.setInt(2, capacity);
                ps.setInt(3, b.getId());
                int countChanges = ps.executeUpdate();

                if (countChanges != 1) {
                    System.out.println("Something goes wrong...");
                }
                ResultSet rs = ps.getGeneratedKeys();

                while (rs.next()) {
                    int id = rs.getInt(1);
                    c.setId(id);
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

        return c;
    }

    public void readCells(Jail jail) {
        Connection conn = DatabaseManager.getInstance().getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("select ID, name, capacity, blockID from cell");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Cell cell = new Cell();
                    cell.setId(rs.getInt("ID"));
                    cell.setName(rs.getString("name"));
                    cell.setCapacity(rs.getInt("capacity"));

                    int blockId = rs.getInt("blockID");
                    Block block = jail.getBlockById(blockId);
                    block.addCell(cell);
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
