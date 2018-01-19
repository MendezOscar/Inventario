package Logica;

import Modelos.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionProducto {

    ServiciosDB service = new ServiciosDB();

    public void createProducto(Producto pro) {
        String query = "INSERT INTO PRODUCTO "
                + "(IDPRODUCTO, CATEGORIA, NOMBRE, DESCRIPCION, PRECIO, UBICACION, MINIMO, CONTADOR) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, pro.getIdProducto());
            stmt.setString(2, pro.getCategotia());
            stmt.setString(3, pro.getNombre());
            stmt.setString(4, pro.getDescripcion());
            stmt.setFloat(5, pro.getPrecio());
            stmt.setString(6, pro.getUbicacion());
            stmt.setFloat(7, pro.getMinino());
            stmt.setInt(8, pro.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " El producto: " + pro.getIdProducto() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El producto: " + pro.getIdProducto() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateProducto(String id, Producto pro) throws SQLException {
        String query = "UPDATE PRODUCTO "
                + "SET CATEGORIA=?, NOMBRE=?, DESCRIPCION=?, PRECIO=?, UBICACION=?, MINIMO=?"
                + "WHERE IDPRODUCTO=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, pro.getCategotia());
            stmt.setString(2, pro.getNombre());
            stmt.setString(3, pro.getDescripcion());
            stmt.setFloat(4, pro.getPrecio());
            stmt.setString(5, pro.getUbicacion());
            stmt.setFloat(6, pro.getMinino());
            stmt.setString(7, pro.getIdProducto());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Producto: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El Producto: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteProducto(String id) throws SQLException {
        Producto pro = findByIdProducto(id);
        if (pro == null) {
            JOptionPane.showMessageDialog(null, "Codigo de producto: " + id + " no existe.");
        }
        String query = "DELETE FROM PRODUCTO WHERE IDPRODUCTO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de producto: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de producto: " + id + "no se ha borrado.");
        }
    }

    public Producto findByIdProducto(String id) throws SQLException {
        String query = "SELECT * FROM PRODUCTO WHERE IDPRODUCTO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Producto(rs.getString("IDPRODUCTO"), rs.getString("CATEGORIA"), rs.getString("NOMBRE"),
                    rs.getString("DESCRIPCION"), rs.getFloat("PRECIO"), rs.getString("UBICACION"), 
                    rs.getFloat("MINIMO"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de empleado: " + id + " no se ha encontrado.");
        }
        return null;
    }

    public List<Producto> findAllProductos() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM PRODUCTO";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Producto> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Producto(rs.getString("IDPRODUCTO"), rs.getString("CATEGORIA"), rs.getString("NOMBRE"),
                    rs.getString("DESCRIPCION"), rs.getFloat("PRECIO"), rs.getString("UBICACION"), 
                    rs.getFloat("MINIMO"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR. ");
        }
        return null;
    }

    public List<Producto> obtenerUltimoProductobyCategoria(String tipo) {
        try {
            String query = "SELECT * FROM PRODUCTO WHERE CATEGORIA = " + "'" + tipo + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Producto> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Producto(rs.getString("IDPRODUCTO"), rs.getString("CATEGORIA"), rs.getString("NOMBRE"),
                    rs.getString("DESCRIPCION"), rs.getFloat("PRECIO"), rs.getString("UBICACION"), 
                    rs.getFloat("MINIMO"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
