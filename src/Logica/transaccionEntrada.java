package Logica;

import Modelos.Entrada;
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
public class transaccionEntrada {

    ServiciosDB service = new ServiciosDB();

    public void createEntrada(Entrada ent) {
        String query = "INSERT INTO ENTRADAS "
                + "(IDENTRADA, FECHA, IDPRODUCTO, PRODUCTO, CANTIDAD, FACTURA, PROVEEDOR, CONTADOR) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, ent.getIdEntrada());
            stmt.setString(2, ent.getFecha());
            stmt.setString(3, ent.getIdProducto());
            stmt.setString(4, ent.getProducto());
            stmt.setFloat(5, ent.getCantidad());
            stmt.setString(6, ent.getFactura());
            stmt.setString(7, ent.getProveedor());
            stmt.setInt(8, ent.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La entrada: " + ent.getIdEntrada() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La entrada: " + ent.getIdEntrada() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateEntrada(String id, Entrada ent) throws SQLException {
        String query = "UPDATE ENTRADAS "
                + "SET FECHA=?, IDPRODUCTO=?, PRODUCTO=?, CANTIDAD=?, FACTURA=?, PROVEEDOR=?"
                + "WHERE IDENTRADA=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, ent.getFecha());
            stmt.setString(2, ent.getIdProducto());
            stmt.setString(3, ent.getProducto());
            stmt.setFloat(4, ent.getCantidad());
            stmt.setString(5, ent.getFactura());
            stmt.setString(6, ent.getProveedor());
            stmt.setString(7, ent.getIdEntrada());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La entrada: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La entrada: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteEntrada(String id) throws SQLException {
        Entrada ent = findByIdEntrada(id);
        if (ent == null) {
            JOptionPane.showMessageDialog(null, "Codigo de entrada: " + id + " no existe.");
        }
        String query = "DELETE FROM ENTRADAS WHERE IDENTRADA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de entrada: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de entrada: " + id + "no se ha borrado.");
        }
    }

    public Entrada findByIdEntrada(String id) throws SQLException {
        String query = "SELECT * FROM ENTRADAS WHERE IDENTRADA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Entrada(rs.getString("IDENTRADA"), rs.getString("FECHA"), rs.getString("IDPRODUCTO"),
                    rs.getString("PRODUCTO"), rs.getFloat("CANTIDAD"), rs.getString("FACTURA"), 
                    rs.getString("PROVEEDOR"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + " no se ha encontrado.");
        }
        return null;
    }

    public List<Entrada> findAllEntrada() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM ENTRADAS";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Entrada> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Entrada(rs.getString("IDENTRADA"), rs.getString("FECHA"), rs.getString("IDPRODUCTO"),
                    rs.getString("PRODUCTO"), rs.getFloat("CANTIDAD"), rs.getString("FACTURA"), 
                    rs.getString("PROVEEDOR"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }
}
