
package Logica;

import Modelos.Proveedor;
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
public class transaccionProveedor {
    ServiciosDB service = new ServiciosDB();

    public void createProveedor(Proveedor pro) {
        String query = "INSERT INTO PROVEEDOR "
                + "(IDPROVEEDOR, NOMBRE, CONTADOR) "
                + "VALUES (? , ? , ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, pro.getIdProveedor());
            stmt.setString(2, pro.getNombre());
            stmt.setInt(3, pro.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " El proveedor: " + pro.getIdProveedor() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El proveedor: " + pro.getIdProveedor() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateProveedor(String id, Proveedor pro) throws SQLException {
        String query = "UPDATE PROVEEDOR "
                + "SET NOMBRE=?"
                + "WHERE IDPROVEEDOR=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, pro.getNombre());
            stmt.setString(2, pro.getIdProveedor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El proveedor: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El proveedor: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteProveedor(String id) throws SQLException {
        Proveedor pro = findByIdProveedor(id);
        if (pro == null) {
            JOptionPane.showMessageDialog(null, "Codigo de proveedor: " + id + " no existe.");
        }
        String query = "DELETE FROM PROVEEDOR WHERE IDPROVEEDOR = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de proveedor: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de proveedor: " + id + "no se ha borrado.");
        }
    }

    public Proveedor findByIdProveedor(String id) throws SQLException {
        String query = "SELECT * FROM PROVEEDOR WHERE IDPROVEEDOR = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Proveedor(rs.getString("IDPROVEEDOR"), rs.getString("NOMBRE"),rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de proveedor: " + id + " no se ha encontrado.");
        }
        return null;
    }

    public List<Proveedor> findAllProveedor() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM PROVEEDOR";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Proveedor> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Proveedor(rs.getString("IDPROVEEDOR"), rs.getString("NOMBRE"),rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }
   
}
