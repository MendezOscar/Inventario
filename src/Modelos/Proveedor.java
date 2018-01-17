
package Modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Proveedor {
    String idProveedor;
    String nombre;
    int contador;

    public Proveedor(String idProveedor, String nombre, int contador) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contador = contador;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
  
}
