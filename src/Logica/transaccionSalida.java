package Logica;

import Modelos.Salida;
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
public class transaccionSalida {

    ServiciosDB service = new ServiciosDB();

    public void createSalida(Salida ent) {
        String query = "INSERT INTO SALIDAS "
                + "(IDSALIDA, FECHA, IDPRODUCTO, PRODUCTO, CANTIDAD, FACTURA, CONTADOR) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, ent.getIdEntrada());
            stmt.setString(2, ent.getFecha());
            stmt.setString(3, ent.getIdProducto());
            stmt.setString(4, ent.getProducto());
            stmt.setFloat(5, ent.getCantidad());
            stmt.setString(6, ent.getFactura());
            stmt.setInt(7, ent.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La entrada: " + ent.getIdEntrada() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La entrada: " + ent.getIdEntrada() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateSalida(String id, Salida ent) throws SQLException {
        String query = "UPDATE SALIDAS "
                + "SET FECHA=?, IDPRODUCTO=?, PRODUCTO=?, CANTIDAD=?, FACTURA=?"
                + "WHERE IDSALIDA=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, ent.getFecha());
            stmt.setString(2, ent.getIdProducto());
            stmt.setString(3, ent.getProducto());
            stmt.setFloat(4, ent.getCantidad());
            stmt.setString(5, ent.getFactura());
            stmt.setString(6, ent.getIdEntrada());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La salida: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La salida: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteSalida(String id) throws SQLException {
        Salida ent = findByIdSalida(id);
        if (ent == null) {
            JOptionPane.showMessageDialog(null, "Codigo de salida: " + id + " no existe.");
        }
        String query = "DELETE FROM SALIDAS WHERE IDSALIDA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de salida: " + id + "se ha borrado.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR Codigo de salida: " + id + "no se ha borrado.");
        }
    }

    public Salida findByIdSalida(String id) throws SQLException {
        String query = "SELECT * FROM SALIDAS WHERE IDSALIDA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Salida(rs.getString("IDSALIDA"), rs.getString("FECHA"), rs.getString("IDPRODUCTO"),
                    rs.getString("PRODUCTO"), rs.getFloat("CANTIDAD"), rs.getString("FACTURA"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR Codigo de salida: " + id + " no se ha encontrado.");
        }
        return null;
    }

    public List<Salida> findAllEntrada() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM SALIDAS";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Salida> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Salida(rs.getString("IDSALIDA"), rs.getString("FECHA"), rs.getString("IDPRODUCTO"),
                    rs.getString("PRODUCTO"), rs.getFloat("CANTIDAD"), rs.getString("FACTURA"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }
}
