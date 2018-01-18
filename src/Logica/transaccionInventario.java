package Logica;

import Modelos.Inventarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionInventario {

    ServiciosDB service = new ServiciosDB();

    public void createInventario(Inventarios inv) {
        String query = "INSERT INTO INVENTARIO "
                + "(IDINVENTARIO, IDPRODUCTO, PRODUCTO, EXISTENCIA, CONTADOR)"
                + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, inv.getIdInventario());
            stmt.setString(2, inv.getIdProducto());
            stmt.setString(3, inv.getProducto());
            stmt.setFloat(4, inv.getExistencia());
            stmt.setInt(5, inv.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " El inventario: " + inv.getIdInventario() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El inventario: " + inv.getIdInventario() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateInventario(String id, Inventarios inv) throws SQLException {
        String query = "UPDATE INVENTARIO "
                + "SET EXISTENCIA=?"
                + "WHERE IDINVENTARIO=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setFloat(1, inv.getExistencia());
            stmt.setString(2, inv.getIdInventario());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El inventario: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El inventario: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteInventario(String id) throws SQLException {
        Inventarios inv = findByIdInventario(id);
        if (inv == null) {
            JOptionPane.showMessageDialog(null, "Codigo de inventario: " + id + " no existe.");
        }
        String query = "DELETE FROM INVENTARIO WHERE IDINVENTARIO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de inventario: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de inventario: " + id + "no se ha borrado.");
        }
    }

    public Inventarios findByIdInventario(String id) throws SQLException {
        String query = "SELECT * FROM INVENTARIO WHERE IDINVENTARIO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Inventarios(rs.getString("IDINVENTARIO"), rs.getString("IDPRODUCTO"), rs.getString("PRODUCTO"),
                    rs.getFloat("EXISTENCIA"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + " no se ha encontrado.");
        }
        return null;
    }

    public List<Inventarios> findAllProductos() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM INVENTARIO";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Inventarios> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Inventarios(rs.getString("IDINVENTARIO"), rs.getString("IDPRODUCTO"), rs.getString("PRODUCTO"),
                    rs.getFloat("EXISTENCIA"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }

}
